package routines;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.XMLConstants;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import net.sf.saxon.TransformerFactoryImpl;

import org.xml.sax.SAXException;

import routines.system.Document;

public class ClientServices {

    public static boolean isRequestComplete(String xsdPath, Document xmlContent) {
        
    	try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            
            Source s = new StreamSource(new StringReader(xmlContent.toString()));
            System.out.println("Source : " + s);
            validator.validate(s);
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
    
    public static String buildServiceResponse (String pivots, String xslFilepath, String codeRetourResult, String codeRetourNoResult, String rootNode) {
    	
    	TransformerFactory tFactory = new TransformerFactoryImpl();
	
		Transformer transformer = null;
		try {
			
			Source inputSource = new StreamSource(new StringReader("<response>" + pivots.toString() + "</response>"));
			
			Writer sw = new StringWriter();
			Result outputResult = new StreamResult(sw);
				  
			transformer = tFactory.newTransformer(new StreamSource(xslFilepath));
			
			transformer.setParameter("rootNode", rootNode);
			transformer.setParameter("codeRetourResult", codeRetourResult);
			transformer.setParameter("codeRetourNoResult", codeRetourNoResult);
			
			transformer.transform(inputSource, outputResult);
			
			return sw.toString();
		} catch (TransformerException e) {
			return "";
		}

    	
    }
}
