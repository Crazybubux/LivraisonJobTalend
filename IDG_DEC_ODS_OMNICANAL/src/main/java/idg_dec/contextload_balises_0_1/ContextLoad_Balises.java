
package idg_dec.contextload_balises_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.Mathematical;
import routines.DataQualityDependencies;
import routines.SQLike;
import routines.Numeric;
import routines.TalendString;
import routines.StringHandling;
import routines.DQTechnical;
import routines.MDM;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;

	//the import part of tJavaRow_1
	//import java.util.List;

	//the import part of tJavaRow_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: ContextLoad_Balises Purpose: Lire des contextes balisés suivant le code marque et le code entrepôt.<br>
 * Description: Lecture sélective des contextes répertoriés entre balises suivant la valeur des paramètres P_VAR_CODE_MARQUE et P_VAR_CODE_ENTREPOT. <br>
 * @author developpeur, developpeur
 * @version 6.1.1.20171108_1421_patch
 * @status 
 */
public class ContextLoad_Balises implements TalendJob {
	static {System.setProperty("TalendJob.log", "ContextLoad_Balises.log");}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ContextLoad_Balises.class);



	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends java.util.Properties {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(contextDir != null){
				
					this.setProperty("contextDir", contextDir.toString());
				
			}
			
			if(tmpDir != null){
				
					this.setProperty("tmpDir", tmpDir.toString());
				
			}
			
			if(P_VAR_CODE_ENTREPOT != null){
				
					this.setProperty("P_VAR_CODE_ENTREPOT", P_VAR_CODE_ENTREPOT.toString());
				
			}
			
			if(P_VAR_CODE_MARQUE != null){
				
					this.setProperty("P_VAR_CODE_MARQUE", P_VAR_CODE_MARQUE.toString());
				
			}
			
		}

public String contextDir;
public String getContextDir(){
	return this.contextDir;
}
public String tmpDir;
public String getTmpDir(){
	return this.tmpDir;
}
public String P_VAR_CODE_ENTREPOT;
public String getP_VAR_CODE_ENTREPOT(){
	return this.P_VAR_CODE_ENTREPOT;
}
public String P_VAR_CODE_MARQUE;
public String getP_VAR_CODE_MARQUE(){
	return this.P_VAR_CODE_MARQUE;
}
	}
	private ContextProperties context = new ContextProperties();
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "ContextLoad_Balises";
	private final String projectName = "IDG_DEC";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	


	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			 globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent);
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				ContextLoad_Balises.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(ContextLoad_Balises.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileExist_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileExist_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputFullRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputFullRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputFullRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tBufferOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputFullRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputFullRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputFullRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tBufferOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileExist_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputFullRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputFullRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			








public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


globalMap.put("generalContextFile", context.contextDir  + contextStr + ".General.cfg"); 

 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJava_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tFileExist_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileExist_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileExist_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileExist_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileExist_1", false);
		start_Hash.put("tFileExist_1", System.currentTimeMillis());
		
	
	currentComponent="tFileExist_1";

	
		int tos_count_tFileExist_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tFileExist_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tFileExist_1 = new StringBuilder();
            log4jParamters_tFileExist_1.append("Parameters:");
                    log4jParamters_tFileExist_1.append("FILE_NAME" + " = " + "(String) globalMap.get(\"generalContextFile\")");
                log4jParamters_tFileExist_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileExist_1 - "  + log4jParamters_tFileExist_1 );

 



/**
 * [tFileExist_1 begin ] stop
 */
	
	/**
	 * [tFileExist_1 main ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	


				final StringBuffer log4jSb_tFileExist_1 = new StringBuffer();
			

java.io.File file_tFileExist_1 = new java.io.File((String) globalMap.get("generalContextFile"));
if (!file_tFileExist_1.exists()) {
    globalMap.put("tFileExist_1_EXISTS",false);
    log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath() + " doesn't exist.");
}else{
	globalMap.put("tFileExist_1_EXISTS",true);
    log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath() + " exists.");
}

globalMap.put("tFileExist_1_FILENAME",(String) globalMap.get("generalContextFile"));


 


	tos_count_tFileExist_1++;

/**
 * [tFileExist_1 main ] stop
 */
	
	/**
	 * [tFileExist_1 end ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 
                if(log.isInfoEnabled())
            log.info("tFileExist_1 - "  + "Done." );

ok_Hash.put("tFileExist_1", true);
end_Hash.put("tFileExist_1", System.currentTimeMillis());

   			if (! (Boolean) globalMap.get("tFileExist_1_EXISTS")) {
   				
    			tDie_1Process(globalMap);
   			}

			
   			if ((Boolean) globalMap.get("tFileExist_1_EXISTS") 
) {
   				
    			tJava_2Process(globalMap);
   			}

			



/**
 * [tFileExist_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileExist_1 finally ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 



/**
 * [tFileExist_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileExist_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tDie_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tDie_1 = new StringBuilder();
            log4jParamters_tDie_1.append("Parameters:");
                    log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Le job \" + jobName + \" n'arrive pas à ouvrir le fichier \" + (String) globalMap.get(\"generalContextFile\") ");
                log4jParamters_tDie_1.append(" | ");
                    log4jParamters_tDie_1.append("CODE" + " = " + "4");
                log4jParamters_tDie_1.append(" | ");
                    log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
                log4jParamters_tDie_1.append(" | ");
                    log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
                log4jParamters_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + log4jParamters_tDie_1 );

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	


	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le job " + jobName + " n'arrive pas à ouvrir le fichier " + (String) globalMap.get("generalContextFile") );
	
		log.error("tDie_1 - The die message: "+"Le job " + jobName + " n'arrive pas à ouvrir le fichier " + (String) globalMap.get("generalContextFile") );
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le job " + jobName + " n'arrive pas à ouvrir le fichier " + (String) globalMap.get("generalContextFile") );
	globalMap.put("tDie_1_DIE_MESSAGES", "Le job " + jobName + " n'arrive pas à ouvrir le fichier " + (String) globalMap.get("generalContextFile") );
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 
                if(log.isInfoEnabled())
            log.info("tDie_1 - "  + "Done." );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		


System.out.println("Le job " + jobName + " lit le fichier context " + (String) globalMap.get("generalContextFile")); 

 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJava_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tSetGlobalVar_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";

	
		int tos_count_tSetGlobalVar_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSetGlobalVar_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSetGlobalVar_1 = new StringBuilder();
            log4jParamters_tSetGlobalVar_1.append("Parameters:");
                    log4jParamters_tSetGlobalVar_1.append("VARIABLES" + " = " + "[{VALUE="+("0")+", KEY="+("\"compteur\"")+"}, {VALUE="+("0")+", KEY="+("\"debut\"")+"}, {VALUE="+("0")+", KEY="+("\"fin\"")+"}, {VALUE="+("\"--Begin Marque=\"+context.P_VAR_CODE_MARQUE")+", KEY="+("\"balise debut\"")+"}, {VALUE="+("\"--End Marque=\"+context.P_VAR_CODE_MARQUE")+", KEY="+("\"balise fin\"")+"}]");
                log4jParamters_tSetGlobalVar_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + log4jParamters_tSetGlobalVar_1 );

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

globalMap.put("compteur", 0);
globalMap.put("debut", 0);
globalMap.put("fin", 0);
globalMap.put("balise debut", "--Begin Marque="+context.P_VAR_CODE_MARQUE);
globalMap.put("balise fin", "--End Marque="+context.P_VAR_CODE_MARQUE);

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 
                if(log.isInfoEnabled())
            log.info("tSetGlobalVar_1 - "  + "Done." );

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				tFileInputFullRow_1Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	


public static class selectStruct implements routines.system.IPersistableRow<selectStruct> {
    final static byte[] commonByteArrayLock_IDG_DEC_ContextLoad_Balises = new byte[0];
    static byte[] commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[0];

	
			    public String line;

				public String getLine () {
					return this.line;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_ContextLoad_Balises.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_ContextLoad_Balises.length == 0) {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_IDG_DEC_ContextLoad_Balises) {

        	try {

        		int length = 0;
		
					this.line = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.line,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("line="+line);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(line == null){
        					sb.append("<null>");
        				}else{
            				sb.append(line);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(selectStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputFullRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputFullRow_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		selectStruct select = new selectStruct();




	
	/**
	 * [tJavaRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_1", false);
		start_Hash.put("tJavaRow_1", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_1";

	
		int tos_count_tJavaRow_1 = 0;
		

int nb_line_tJavaRow_1 = 0;

 



/**
 * [tJavaRow_1 begin ] stop
 */



	
	/**
	 * [tFileInputFullRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputFullRow_1", false);
		start_Hash.put("tFileInputFullRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputFullRow_1";

	
		int tos_count_tFileInputFullRow_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tFileInputFullRow_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tFileInputFullRow_1 = new StringBuilder();
            log4jParamters_tFileInputFullRow_1.append("Parameters:");
                    log4jParamters_tFileInputFullRow_1.append("FILENAME" + " = " + "context.contextDir+contextStr + \".General.cfg\"");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("HEADER" + " = " + "");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("FOOTER" + " = " + "");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("LIMIT" + " = " + "");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("REMOVE_EMPTY_ROW" + " = " + "false");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                    log4jParamters_tFileInputFullRow_1.append("RANDOM" + " = " + "false");
                log4jParamters_tFileInputFullRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputFullRow_1 - "  + log4jParamters_tFileInputFullRow_1 );

				final StringBuffer log4jSb_tFileInputFullRow_1 = new StringBuffer();
			
	org.talend.fileprocess.FileInputDelimited fid_tFileInputFullRow_1 = null;

					log.info("tFileInputFullRow_1 - Retrieving records from the datasource.");
			

	try{//}
		fid_tFileInputFullRow_1 =new org.talend.fileprocess.FileInputDelimited(context.contextDir+contextStr + ".General.cfg","ISO-8859-15","","\n",false,0,0,-1,-1,false);
		while (fid_tFileInputFullRow_1.nextRecord()) {//}
			select = null;						
	boolean whetherReject_tFileInputFullRow_1 = false;
	select = new selectStruct();
		select.line = fid_tFileInputFullRow_1.get(0);

 



/**
 * [tFileInputFullRow_1 begin ] stop
 */
	
	/**
	 * [tFileInputFullRow_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 


	tos_count_tFileInputFullRow_1++;

/**
 * [tFileInputFullRow_1 main ] stop
 */

	
	/**
	 * [tJavaRow_1 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";

	
    			if(log.isTraceEnabled()){
    				log.trace("select - " + (select==null? "": select.toLogString()));
    			}
    		

    globalMap.put("compteur", (Integer)globalMap.get("compteur")+1);

if (globalMap.get("balise debut").equals(select.line)){
	globalMap.put("debut", (Integer)globalMap.get("compteur"));
}else if (globalMap.get("balise fin").equals(select.line)) {
	globalMap.put("fin", (Integer)globalMap.get("compteur"));
}

    nb_line_tJavaRow_1++;   

 


	tos_count_tJavaRow_1++;

/**
 * [tJavaRow_1 main ] stop
 */



	
	/**
	 * [tFileInputFullRow_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

	


            }
           	}finally{
           		if(fid_tFileInputFullRow_1!=null){
            		fid_tFileInputFullRow_1.close();
            	}
            }
            globalMap.put("tFileInputFullRow_1_NB_LINE", fid_tFileInputFullRow_1.getRowNumber());
				log.info("tFileInputFullRow_1 - Retrieved records count: "+ globalMap.get("tFileInputFullRow_1_NB_LINE") + " .");
			
 
                if(log.isInfoEnabled())
            log.info("tFileInputFullRow_1 - "  + "Done." );

ok_Hash.put("tFileInputFullRow_1", true);
end_Hash.put("tFileInputFullRow_1", System.currentTimeMillis());




/**
 * [tFileInputFullRow_1 end ] stop
 */

	
	/**
	 * [tJavaRow_1 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";

	

globalMap.put("tJavaRow_1_NB_LINE",nb_line_tJavaRow_1);
 

ok_Hash.put("tJavaRow_1", true);
end_Hash.put("tJavaRow_1", System.currentTimeMillis());




/**
 * [tJavaRow_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputFullRow_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tFileInputDelimited_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputFullRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 



/**
 * [tFileInputFullRow_1 finally ] stop
 */

	
	/**
	 * [tJavaRow_1 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";

	

 



/**
 * [tJavaRow_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputFullRow_1_SUBPROCESS_STATE", 1);
	}
	


public static class insertStruct implements routines.system.IPersistableRow<insertStruct> {
    final static byte[] commonByteArrayLock_IDG_DEC_ContextLoad_Balises = new byte[0];
    static byte[] commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_ContextLoad_Balises.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_ContextLoad_Balises.length == 0) {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_IDG_DEC_ContextLoad_Balises) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(insertStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		insertStruct insert = new insertStruct();




	
	/**
	 * [tBufferOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tBufferOutput_2", false);
		start_Hash.put("tBufferOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tBufferOutput_2";

	
		int tos_count_tBufferOutput_2 = 0;
		

 



/**
 * [tBufferOutput_2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";

	
		int tos_count_tFileInputDelimited_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tFileInputDelimited_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
            log4jParamters_tFileInputDelimited_2.append("Parameters:");
                    log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "(String) globalMap.get(\"generalContextFile\")");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"=\"");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "(Integer)globalMap.get(\"debut\")-1");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("FOOTER" + " = " + "");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "(Integer)globalMap.get(\"fin\")-(Integer)globalMap.get(\"debut\")");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("RANDOM" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("key")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("value")+"}]");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("CHECK_DATE" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("SPLITRECORD" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                    log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE" + " = " + "false");
                log4jParamters_tFileInputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + log4jParamters_tFileInputDelimited_2 );
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				try{
					
						Object filename_tFileInputDelimited_2 = (String) globalMap.get("generalContextFile");
						if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0, random_value_tFileInputDelimited_2 = -1;
			if(footer_value_tFileInputDelimited_2 >0 || random_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited((String) globalMap.get("generalContextFile"), "ISO-8859-15","=","\n",false,(Integer)globalMap.get("debut")-1,0,(Integer)globalMap.get("fin")-(Integer)globalMap.get("debut"),-1, false);
						} catch(java.lang.Exception e) {
							
								
									log.error("tFileInputDelimited_2 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_2!=null && fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();
						
			    						insert = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									insert = new insertStruct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
							insert.key = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 1;
					
							insert.value = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
				
										
										if(rowstate_tFileInputDelimited_2.getException()!=null) {
											throw rowstate_tFileInputDelimited_2.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
			        					whetherReject_tFileInputDelimited_2 = true;
			        					
												log.error("tFileInputDelimited_2 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					insert = null;
			                				
			    					}
								
			log.debug("tFileInputDelimited_2 - Retrieving the record " + fid_tFileInputDelimited_2.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
// Start of branch "insert"
if(insert != null) { 



	
	/**
	 * [tBufferOutput_2 main ] start
	 */

	

	
	
	currentComponent="tBufferOutput_2";

	
    			if(log.isTraceEnabled()){
    				log.trace("insert - " + (insert==null? "": insert.toLogString()));
    			}
    		



String[] row_tBufferOutput_2=new String[]{"","",};		
	    if(insert.key != null){
	        
	            row_tBufferOutput_2[0] = insert.key;
	                        			    
	    }else{
	    	row_tBufferOutput_2[0] = null;
	    }
	    if(insert.value != null){
	        
	            row_tBufferOutput_2[1] = insert.value;
	                        			    
	    }else{
	    	row_tBufferOutput_2[1] = null;
	    }
	globalBuffer.add(row_tBufferOutput_2);	
	
 


	tos_count_tBufferOutput_2++;

/**
 * [tBufferOutput_2 main ] stop
 */

} // End of branch "insert"




	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	



            }
            }finally{
                if(!((Object)((String) globalMap.get("generalContextFile")) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_2!=null){
                		fid_tFileInputDelimited_2.close();
                	}
                }
                if(fid_tFileInputDelimited_2!=null){
                	globalMap.put("tFileInputDelimited_2_NB_LINE", fid_tFileInputDelimited_2.getRowNumber());
					
						log.info("tFileInputDelimited_2 - Retrieved records count: "+ fid_tFileInputDelimited_2.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isInfoEnabled())
            log.info("tFileInputDelimited_2 - "  + "Done." );

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tBufferOutput_2 end ] start
	 */

	

	
	
	currentComponent="tBufferOutput_2";

	

 

ok_Hash.put("tBufferOutput_2", true);
end_Hash.put("tBufferOutput_2", System.currentTimeMillis());




/**
 * [tBufferOutput_2 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tSetGlobalVar_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tBufferOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tBufferOutput_2";

	

 



/**
 * [tBufferOutput_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_2", false);
		start_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_2";

	
		int tos_count_tSetGlobalVar_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSetGlobalVar_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tSetGlobalVar_2 = new StringBuilder();
            log4jParamters_tSetGlobalVar_2.append("Parameters:");
                    log4jParamters_tSetGlobalVar_2.append("VARIABLES" + " = " + "[{VALUE="+("0")+", KEY="+("\"compteur\"")+"}, {VALUE="+("0")+", KEY="+("\"debut\"")+"}, {VALUE="+("0")+", KEY="+("\"fin\"")+"}, {VALUE="+("\"--Begin Entrepot=\"+context.P_VAR_CODE_ENTREPOT")+", KEY="+("\"balise debut\"")+"}, {VALUE="+("\"--End Entrepot=\"+context.P_VAR_CODE_ENTREPOT")+", KEY="+("\"balise fin\"")+"}]");
                log4jParamters_tSetGlobalVar_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_2 - "  + log4jParamters_tSetGlobalVar_2 );

 



/**
 * [tSetGlobalVar_2 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

globalMap.put("compteur", 0);
globalMap.put("debut", 0);
globalMap.put("fin", 0);
globalMap.put("balise debut", "--Begin Entrepot="+context.P_VAR_CODE_ENTREPOT);
globalMap.put("balise fin", "--End Entrepot="+context.P_VAR_CODE_ENTREPOT);

 


	tos_count_tSetGlobalVar_2++;

/**
 * [tSetGlobalVar_2 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 
                if(log.isInfoEnabled())
            log.info("tSetGlobalVar_2 - "  + "Done." );

ok_Hash.put("tSetGlobalVar_2", true);
end_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());

				tFileInputFullRow_2Process(globalMap);



/**
 * [tSetGlobalVar_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_2 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 



/**
 * [tSetGlobalVar_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 1);
	}
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_IDG_DEC_ContextLoad_Balises = new byte[0];
    static byte[] commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[0];

	
			    public String line;

				public String getLine () {
					return this.line;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_ContextLoad_Balises.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_ContextLoad_Balises.length == 0) {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_IDG_DEC_ContextLoad_Balises) {

        	try {

        		int length = 0;
		
					this.line = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.line,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("line="+line);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(line == null){
        					sb.append("<null>");
        				}else{
            				sb.append(line);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputFullRow_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputFullRow_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();




	
	/**
	 * [tJavaRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_2", false);
		start_Hash.put("tJavaRow_2", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_2";

	
		int tos_count_tJavaRow_2 = 0;
		

int nb_line_tJavaRow_2 = 0;

 



/**
 * [tJavaRow_2 begin ] stop
 */



	
	/**
	 * [tFileInputFullRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputFullRow_2", false);
		start_Hash.put("tFileInputFullRow_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputFullRow_2";

	
		int tos_count_tFileInputFullRow_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tFileInputFullRow_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tFileInputFullRow_2 = new StringBuilder();
            log4jParamters_tFileInputFullRow_2.append("Parameters:");
                    log4jParamters_tFileInputFullRow_2.append("FILENAME" + " = " + "context.contextDir+contextStr + \".General.cfg\"");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("HEADER" + " = " + "");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("FOOTER" + " = " + "");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("LIMIT" + " = " + "");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("REMOVE_EMPTY_ROW" + " = " + "false");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                    log4jParamters_tFileInputFullRow_2.append("RANDOM" + " = " + "false");
                log4jParamters_tFileInputFullRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputFullRow_2 - "  + log4jParamters_tFileInputFullRow_2 );

				final StringBuffer log4jSb_tFileInputFullRow_2 = new StringBuffer();
			
	org.talend.fileprocess.FileInputDelimited fid_tFileInputFullRow_2 = null;

					log.info("tFileInputFullRow_2 - Retrieving records from the datasource.");
			

	try{//}
		fid_tFileInputFullRow_2 =new org.talend.fileprocess.FileInputDelimited(context.contextDir+contextStr + ".General.cfg","ISO-8859-15","","\n",false,0,0,-1,-1,false);
		while (fid_tFileInputFullRow_2.nextRecord()) {//}
			row1 = null;						
	boolean whetherReject_tFileInputFullRow_2 = false;
	row1 = new row1Struct();
		row1.line = fid_tFileInputFullRow_2.get(0);

 



/**
 * [tFileInputFullRow_2 begin ] stop
 */
	
	/**
	 * [tFileInputFullRow_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_2";

	

 


	tos_count_tFileInputFullRow_2++;

/**
 * [tFileInputFullRow_2 main ] stop
 */

	
	/**
	 * [tJavaRow_2 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";

	
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

    globalMap.put("compteur", (Integer)globalMap.get("compteur")+1);

if (globalMap.get("balise debut").equals(row1.line)){
	globalMap.put("debut", (Integer)globalMap.get("compteur"));
}else if (globalMap.get("balise fin").equals(row1.line)) {
	globalMap.put("fin", (Integer)globalMap.get("compteur"));
}

    nb_line_tJavaRow_2++;   

 


	tos_count_tJavaRow_2++;

/**
 * [tJavaRow_2 main ] stop
 */



	
	/**
	 * [tFileInputFullRow_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_2";

	

	


            }
           	}finally{
           		if(fid_tFileInputFullRow_2!=null){
            		fid_tFileInputFullRow_2.close();
            	}
            }
            globalMap.put("tFileInputFullRow_2_NB_LINE", fid_tFileInputFullRow_2.getRowNumber());
				log.info("tFileInputFullRow_2 - Retrieved records count: "+ globalMap.get("tFileInputFullRow_2_NB_LINE") + " .");
			
 
                if(log.isInfoEnabled())
            log.info("tFileInputFullRow_2 - "  + "Done." );

ok_Hash.put("tFileInputFullRow_2", true);
end_Hash.put("tFileInputFullRow_2", System.currentTimeMillis());




/**
 * [tFileInputFullRow_2 end ] stop
 */

	
	/**
	 * [tJavaRow_2 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";

	

globalMap.put("tJavaRow_2_NB_LINE",nb_line_tJavaRow_2);
 

ok_Hash.put("tJavaRow_2", true);
end_Hash.put("tJavaRow_2", System.currentTimeMillis());




/**
 * [tJavaRow_2 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputFullRow_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tFileInputDelimited_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputFullRow_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_2";

	

 



/**
 * [tFileInputFullRow_2 finally ] stop
 */

	
	/**
	 * [tJavaRow_2 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";

	

 



/**
 * [tJavaRow_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputFullRow_2_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_IDG_DEC_ContextLoad_Balises = new byte[0];
    static byte[] commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_ContextLoad_Balises.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_ContextLoad_Balises.length == 0) {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_ContextLoad_Balises = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_ContextLoad_Balises, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_IDG_DEC_ContextLoad_Balises) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tBufferOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tBufferOutput_1", false);
		start_Hash.put("tBufferOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tBufferOutput_1";

	
		int tos_count_tBufferOutput_1 = 0;
		

 



/**
 * [tBufferOutput_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tFileInputDelimited_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
            log4jParamters_tFileInputDelimited_1.append("Parameters:");
                    log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "(String) globalMap.get(\"generalContextFile\")");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"=\"");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("HEADER" + " = " + "(Integer)globalMap.get(\"debut\")-1");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("FOOTER" + " = " + "");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = " + "(Integer)globalMap.get(\"fin\")-(Integer)globalMap.get(\"debut\")");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("RANDOM" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("key")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("value")+"}]");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                    log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
                log4jParamters_tFileInputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + log4jParamters_tFileInputDelimited_1 );
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				try{
					
						Object filename_tFileInputDelimited_1 = (String) globalMap.get("generalContextFile");
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited((String) globalMap.get("generalContextFile"), "ISO-8859-15","=","\n",false,(Integer)globalMap.get("debut")-1,0,(Integer)globalMap.get("fin")-(Integer)globalMap.get("debut"),-1, false);
						} catch(java.lang.Exception e) {
							
								
									log.error("tFileInputDelimited_1 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row2 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row2 = new row2Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row2.key = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row2.value = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
												log.error("tFileInputDelimited_1 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row2 = null;
			                				
			    					}
								
			log.debug("tFileInputDelimited_1 - Retrieving the record " + fid_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tBufferOutput_1 main ] start
	 */

	

	
	
	currentComponent="tBufferOutput_1";

	
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		



String[] row_tBufferOutput_1=new String[]{"","",};		
	    if(row2.key != null){
	        
	            row_tBufferOutput_1[0] = row2.key;
	                        			    
	    }else{
	    	row_tBufferOutput_1[0] = null;
	    }
	    if(row2.value != null){
	        
	            row_tBufferOutput_1[1] = row2.value;
	                        			    
	    }else{
	    	row_tBufferOutput_1[1] = null;
	    }
	globalBuffer.add(row_tBufferOutput_1);	
	
 


	tos_count_tBufferOutput_1++;

/**
 * [tBufferOutput_1 main ] stop
 */

} // End of branch "row2"




	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)((String) globalMap.get("generalContextFile")) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
						log.info("tFileInputDelimited_1 - Retrieved records count: "+ fid_tFileInputDelimited_1.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isInfoEnabled())
            log.info("tFileInputDelimited_1 - "  + "Done." );

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tBufferOutput_1 end ] start
	 */

	

	
	
	currentComponent="tBufferOutput_1";

	

 

ok_Hash.put("tBufferOutput_1", true);
end_Hash.put("tBufferOutput_1", System.currentTimeMillis());




/**
 * [tBufferOutput_1 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage());
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tBufferOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tBufferOutput_1";

	

 



/**
 * [tBufferOutput_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Linux";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };



    private java.util.Properties context_param = new java.util.Properties();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";

    public static void main(String[] args){
        final ContextLoad_Balises ContextLoad_BalisesClass = new ContextLoad_Balises();

        int exitCode = ContextLoad_BalisesClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'ContextLoad_Balises' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = (String[][])globalBuffer.toArray(new String[globalBuffer.size()][]);

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        		hastBufferOutput = true;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";

        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }

	        if(!"".equals(log4jLevel)){
				if("trace".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.OFF);
				}
				org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
    	    }
        	log.info("TalendJob: 'ContextLoad_Balises' - Start.");
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }


        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = ContextLoad_Balises.class.getClassLoader().getResourceAsStream("idg_dec/contextload_balises_0_1/contexts/"+contextStr+".properties");
            if(isDefaultContext && inContext ==null) {

            } else {
                if (inContext!=null) {
                    //defaultProps is in order to keep the original context value
                    defaultProps.load(inContext);
                    inContext.close();
                    context = new ContextProperties(defaultProps);
                }else{
                    //print info and job continue to run, for case: context_param is not empty.
                    System.err.println("Could not find the context " + contextStr);
                }
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
            }
                context.contextDir=(String) context.getProperty("contextDir");
                context.tmpDir=(String) context.getProperty("tmpDir");
                context.P_VAR_CODE_ENTREPOT=(String) context.getProperty("P_VAR_CODE_ENTREPOT");
                context.P_VAR_CODE_MARQUE=(String) context.getProperty("P_VAR_CODE_MARQUE");
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }


        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("contextDir")) {
                context.contextDir = (String) parentContextMap.get("contextDir");
            }if (parentContextMap.containsKey("tmpDir")) {
                context.tmpDir = (String) parentContextMap.get("tmpDir");
            }if (parentContextMap.containsKey("P_VAR_CODE_ENTREPOT")) {
                context.P_VAR_CODE_ENTREPOT = (String) parentContextMap.get("P_VAR_CODE_ENTREPOT");
            }if (parentContextMap.containsKey("P_VAR_CODE_MARQUE")) {
                context.P_VAR_CODE_MARQUE = (String) parentContextMap.get("P_VAR_CODE_MARQUE");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));




	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tJava_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tJava_1) {
globalMap.put("tJava_1_SUBPROCESS_STATE", -1);

e_tJava_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : ContextLoad_Balises");
        }





    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }




		









    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        }else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		}

    }

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     100214 characters generated by Talend Data Services Platform 
 *     on the 8 septembre 2020 14:59:07 CEST
 ************************************************************************************************/