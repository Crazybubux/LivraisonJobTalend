package routines;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class MDMtools {

    /**
     * getFKpart: Return one of the FK component by position (starts at 0) in a mangled FK (FKs are mangled in MDM to accommodate for
     * compound keys)
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} MDMtools
     * 
     * {param} string(FKs) mangledFK: original mangled FK.
     * 
     * {param} int(0) pos: key position (starts at 0)
     * 
     * {example} getFKpart(FKs,0) # 12345
     */
    public static String getFKpart(String mangledFK, int pos) {
        if (mangledFK == null) {
            return null;
        }
        Pattern p = Pattern.compile("\\[([^\\[\\]]*)\\]"); //$NON-NLS-1$    
        Matcher m = p.matcher(mangledFK.trim());
        if ( m.matches()) {
        	Pattern p2 = Pattern.compile("\\.");
        	String t = m.group(1);
        	String[] items = p2.split(t);
        	if ( pos <= items.length) {
        		return items[pos];
        		}
        	return null;
        }
        return null;
    }

    /**
     * getVide: Return if the string is empty
     * Blanc, chaine vide, chaine nulle return true.
     * 
     * {talendTypes} Boolean
     * 
     * {Category} MDMtools
     * 
     * {param} string() : chaine.
     * 
     * 
     * 
     * {example} getVide("aaa ")
     */

    public static String[] cutStringOverFlow(String chaine, int lenghtMax, String separ) {
    String[] tab = new String[2];
    String chaine1 = "";
    String chaine2 = "";

	    if (chaine.length() > lenghtMax){
	
	    	if (chaine.substring(lenghtMax,lenghtMax+1).equals(separ)){
	    		chaine1 = chaine.substring(0,lenghtMax);
	    		chaine2 = chaine.substring(lenghtMax+1);
	    	}
	    	else {
	    		chaine1 = chaine.substring(0,lenghtMax);
	    		chaine1 = chaine1.substring(0, chaine1.lastIndexOf(" ")+1);
	    		chaine2 = chaine.substring(chaine1.length());
	    	}	    
		    tab[0] = chaine1;
		    tab[1] = chaine2;
		    return tab;	
	    }
	    tab[0] = chaine;
	    tab[1] = chaine2;
	    return 	tab;
	    
    }
    
    public static Boolean getVide(String chaine) {
        
    	if (chaine == null || "".equals(chaine.trim())) {
            return true;
        }
        return false;
    } 
    
}