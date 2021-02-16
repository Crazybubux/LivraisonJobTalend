package routines;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

public class Pivot {

    public static String filterBySousSysteme(String xmlString, String xslFilepath, String entity, String sousSysteme) {

    	TransformerFactory tFactory = new TransformerFactoryImpl();
	
		Transformer transformer = null;
		try {
			
			Source inputSource = new StreamSource(new StringReader(xmlString.toString()));
			
			Writer sw = new StringWriter();
			Result outputResult = new StreamResult(sw);
				  
			transformer = tFactory.newTransformer(new StreamSource(xslFilepath));
			
			transformer.setParameter("sousSysteme", sousSysteme);
			transformer.setParameter("entite", entity);
			
			transformer.transform(inputSource, outputResult);
			
			return sw.toString();
		} catch (TransformerException e) {
			return "";
		}

    	
    }
    
  /***     Routine pour comparer un champ du pivot à son equivalent dans le MDM pour decider de mettre à jour le MDM ou non       **/  
    public static Boolean compareFields(String mdmField, String pivotField, String nullString) {

    	Boolean compareResult = false;
	
    	if (pivotField == null)//Cas du champ pivot non renseigné
    		
    		compareResult=false;
    	
    	else 
    		  if ( pivotField.equalsIgnoreCase(nullString) ) // Cas du champs pivot= chaine designant une mise à jour à null
    			 
    			  compareResult = null;
    	
    		  else
    			     if (mdmField == null)//Cas du champ mdm est null, est champ pivot renseigné
    			    	 
    			    	 compareResult = true;
    			     
    			     else 
    		      	         if ( pivotField.equals(mdmField) )//Cas d'egalité des deux champs mdm et pivot
    		      	        	 
    		      	        	compareResult=false;
    	
    		      	         else //Cas de non egalité des deux champs mdm et pivot
    		      	        	 
    		      	        	compareResult=true;
    	
    		    	     
    			
			return compareResult;
		    	
    }
    
    
  
    
    
    /***     Routine pour convertir un String en Integer       **/  
    public static Integer getIntegerFromString(String InputString) {

    	Integer IntegerResult = null;
	
    	if (InputString == null)
    		IntegerResult = null;
    	else 
    	{
    		  InputString=InputString.trim();
    		
    		  if (InputString.matches("\\d+"))
    			 
    			  IntegerResult = Integer.parseInt(InputString);
    		  else
    			  IntegerResult = null;
    		    	     
    	}		
			return IntegerResult;
		    	
    }
    
    /***     Routine pour convertir un Integer en String       **/    
    public static String getStringFromInteger(Integer InputInteger) {

    	String StringResult = null;
	
    	if (InputInteger == null)
    		StringResult = null;
    	else 
    		StringResult=String.valueOf(InputInteger);
    		
			return StringResult;
		    	
    }
    
    
    /***     Routine permettant de choisir les dates de creation/mise à jour       **/  
    public static Date getElementDate(Date localDate, Date individuDate,Date fileDate) {

    	Date dateResult = null;
	
    	if (localDate != null)
    		dateResult = localDate;
    	else 
    		  if (individuDate != null)
    			  dateResult = individuDate;
    		  else
    			  dateResult = fileDate;
    		    	     
    			
			return dateResult;
		    	
    }
    
    
    
}
