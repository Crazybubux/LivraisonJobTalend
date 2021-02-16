package routines;

public class IdGroupUtils {

    public static String convertQuot(Object globalVar) {
        if (globalVar == null) {
            return " is null"; 
        }
        if(globalVar instanceof Integer || globalVar instanceof Double){
        	return " = " + globalVar + "";
        }
        return " = '" + ((String)globalVar).replaceAll("'", "''") + "'";
    }
    
    public static String lpad(String text, int length, String fill){
    	if(text == null){
    		return null;
    	}
    	int textLength = text.length();
    	if(textLength >= length){
    		return text.substring(0,length);
    	}
    	for(int i = 0 ; i < length - textLength ; i++){
    		text = fill + text;
    	}
    	return text;
    }
    
    public static String rpad(String text, int length, String fill){
    	if(text == null){
    		return null;
    	}
    	int textLength = text.length();
    	if(textLength >= length){
    		return text.substring(0,length);
    	}
    	for(int i = 0 ; i < length - textLength ; i++){
    		text = text + fill;
    	}
    	return text;
    }
}
