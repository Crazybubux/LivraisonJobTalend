
package idg_dec.idg_dec_ods_omnicanal_0_2;

import routines.CustomerService;
import routines.TalendDataGenerator;
import routines.ICustomerService;
import routines.Reason;
import routines.Numeric;
import routines.ServiceFaultList;
import routines.ServiceFault;
import routines.DQTechnical;
import routines.MDM;
import routines.BasicHttpBinding_ICustomerServiceStub;
import routines.OperatorInfo;
import routines.ContactInfo;
import routines.InactiveCardInfo;
import routines.InfoCustGeneral;
import routines.MDMtools;
import routines.ParserUtils;
import routines.DataOperation;
import routines.ClientServices;
import routines.DataQuality;
import routines.BusinessFault;
import routines.InfoDyn;
import routines.Relational;
import routines.CustomerServiceLocator;
import routines.TestRoutine;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.ServiceFaultListItem;
import routines.SQLike;
import routines.TechnicalFault;
import routines.TalendString;
import routines.StringHandling;
import routines.TalendDate;
import routines.InfoContactGeneral;
import routines.DqStringHandling;
import routines.IdGroupUtils;
import routines.Pivot;
import routines.CustomerInfo;
import routines.InfosIdentCustReturn;
import routines.CDATA;
import routines.GoogleMapURL;
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
 





@SuppressWarnings("unused")

/**
 * Job: IDG_DEC_ODS_OMNICANAL Purpose: <br>
 * Description:  <br>
 * @author developpeur, developpeur5
 * @version 6.1.1.20171108_1421_patch
 * @status 
 */
public class IDG_DEC_ODS_OMNICANAL implements TalendJob {
	static {System.setProperty("TalendJob.log", "IDG_DEC_ODS_OMNICANAL.log");}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(IDG_DEC_ODS_OMNICANAL.class);



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
			
			if(ORACLE_ODS_AdditionalParams != null){
				
					this.setProperty("ORACLE_ODS_AdditionalParams", ORACLE_ODS_AdditionalParams.toString());
				
			}
			
			if(ORACLE_ODS_Login != null){
				
					this.setProperty("ORACLE_ODS_Login", ORACLE_ODS_Login.toString());
				
			}
			
			if(ORACLE_ODS_Password != null){
				
					this.setProperty("ORACLE_ODS_Password", ORACLE_ODS_Password.toString());
				
			}
			
			if(ORACLE_ODS_Port != null){
				
					this.setProperty("ORACLE_ODS_Port", ORACLE_ODS_Port.toString());
				
			}
			
			if(ORACLE_ODS_Schema != null){
				
					this.setProperty("ORACLE_ODS_Schema", ORACLE_ODS_Schema.toString());
				
			}
			
			if(ORACLE_ODS_Server != null){
				
					this.setProperty("ORACLE_ODS_Server", ORACLE_ODS_Server.toString());
				
			}
			
			if(ORACLE_ODS_ServiceName != null){
				
					this.setProperty("ORACLE_ODS_ServiceName", ORACLE_ODS_ServiceName.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams", ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_Login != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Login", ORACLE_ODS_SRC_WORK_SCHEMA_Login.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_Password != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Password", ORACLE_ODS_SRC_WORK_SCHEMA_Password.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_Port != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Port", ORACLE_ODS_SRC_WORK_SCHEMA_Port.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_Schema != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Schema", ORACLE_ODS_SRC_WORK_SCHEMA_Schema.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_Server != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Server", ORACLE_ODS_SRC_WORK_SCHEMA_Server.toString());
				
			}
			
			if(ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName != null){
				
					this.setProperty("ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName", ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName.toString());
				
			}
			
			if(SYBASE_DEC_AdditionalParams != null){
				
					this.setProperty("SYBASE_DEC_AdditionalParams", SYBASE_DEC_AdditionalParams.toString());
				
			}
			
			if(SYBASE_DEC_Login != null){
				
					this.setProperty("SYBASE_DEC_Login", SYBASE_DEC_Login.toString());
				
			}
			
			if(SYBASE_DEC_Password != null){
				
					this.setProperty("SYBASE_DEC_Password", SYBASE_DEC_Password.toString());
				
			}
			
			if(SYBASE_DEC_Port != null){
				
					this.setProperty("SYBASE_DEC_Port", SYBASE_DEC_Port.toString());
				
			}
			
			if(SYBASE_DEC_Schema != null){
				
					this.setProperty("SYBASE_DEC_Schema", SYBASE_DEC_Schema.toString());
				
			}
			
			if(SYBASE_DEC_Server != null){
				
					this.setProperty("SYBASE_DEC_Server", SYBASE_DEC_Server.toString());
				
			}
			
			if(SYBASE_DEC_Sid != null){
				
					this.setProperty("SYBASE_DEC_Sid", SYBASE_DEC_Sid.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams", SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Login != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Login", SYBASE_DEC_SRC_WORK_SCHEMA_Login.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Password != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Password", SYBASE_DEC_SRC_WORK_SCHEMA_Password.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Port != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Port", SYBASE_DEC_SRC_WORK_SCHEMA_Port.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Schema != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Schema", SYBASE_DEC_SRC_WORK_SCHEMA_Schema.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Server != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Server", SYBASE_DEC_SRC_WORK_SCHEMA_Server.toString());
				
			}
			
			if(SYBASE_DEC_SRC_WORK_SCHEMA_Sid != null){
				
					this.setProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Sid", SYBASE_DEC_SRC_WORK_SCHEMA_Sid.toString());
				
			}
			
			if(P_VAR_DEC_DIR != null){
				
					this.setProperty("P_VAR_DEC_DIR", P_VAR_DEC_DIR.toString());
				
			}
			
		}

public String contextDir;
public String getContextDir(){
	return this.contextDir;
}
public String ORACLE_ODS_AdditionalParams;
public String getORACLE_ODS_AdditionalParams(){
	return this.ORACLE_ODS_AdditionalParams;
}
public String ORACLE_ODS_Login;
public String getORACLE_ODS_Login(){
	return this.ORACLE_ODS_Login;
}
public java.lang.String ORACLE_ODS_Password;
public java.lang.String getORACLE_ODS_Password(){
	return this.ORACLE_ODS_Password;
}
public String ORACLE_ODS_Port;
public String getORACLE_ODS_Port(){
	return this.ORACLE_ODS_Port;
}
public String ORACLE_ODS_Schema;
public String getORACLE_ODS_Schema(){
	return this.ORACLE_ODS_Schema;
}
public String ORACLE_ODS_Server;
public String getORACLE_ODS_Server(){
	return this.ORACLE_ODS_Server;
}
public String ORACLE_ODS_ServiceName;
public String getORACLE_ODS_ServiceName(){
	return this.ORACLE_ODS_ServiceName;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams;
public String getORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_Login;
public String getORACLE_ODS_SRC_WORK_SCHEMA_Login(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_Login;
}
public java.lang.String ORACLE_ODS_SRC_WORK_SCHEMA_Password;
public java.lang.String getORACLE_ODS_SRC_WORK_SCHEMA_Password(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_Password;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_Port;
public String getORACLE_ODS_SRC_WORK_SCHEMA_Port(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_Port;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_Schema;
public String getORACLE_ODS_SRC_WORK_SCHEMA_Schema(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_Schema;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_Server;
public String getORACLE_ODS_SRC_WORK_SCHEMA_Server(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_Server;
}
public String ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName;
public String getORACLE_ODS_SRC_WORK_SCHEMA_ServiceName(){
	return this.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName;
}
public String SYBASE_DEC_AdditionalParams;
public String getSYBASE_DEC_AdditionalParams(){
	return this.SYBASE_DEC_AdditionalParams;
}
public String SYBASE_DEC_Login;
public String getSYBASE_DEC_Login(){
	return this.SYBASE_DEC_Login;
}
public java.lang.String SYBASE_DEC_Password;
public java.lang.String getSYBASE_DEC_Password(){
	return this.SYBASE_DEC_Password;
}
public String SYBASE_DEC_Port;
public String getSYBASE_DEC_Port(){
	return this.SYBASE_DEC_Port;
}
public String SYBASE_DEC_Schema;
public String getSYBASE_DEC_Schema(){
	return this.SYBASE_DEC_Schema;
}
public String SYBASE_DEC_Server;
public String getSYBASE_DEC_Server(){
	return this.SYBASE_DEC_Server;
}
public String SYBASE_DEC_Sid;
public String getSYBASE_DEC_Sid(){
	return this.SYBASE_DEC_Sid;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_Login;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_Login(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Login;
}
public java.lang.String SYBASE_DEC_SRC_WORK_SCHEMA_Password;
public java.lang.String getSYBASE_DEC_SRC_WORK_SCHEMA_Password(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Password;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_Port;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_Port(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Port;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_Schema;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_Schema(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Schema;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_Server;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_Server(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Server;
}
public String SYBASE_DEC_SRC_WORK_SCHEMA_Sid;
public String getSYBASE_DEC_SRC_WORK_SCHEMA_Sid(){
	return this.SYBASE_DEC_SRC_WORK_SCHEMA_Sid;
}
public String P_VAR_DEC_DIR;
public String getP_VAR_DEC_DIR(){
	return this.P_VAR_DEC_DIR;
}
	}
	private ContextProperties context = new ContextProperties();
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.2";
	private final String jobName = "IDG_DEC_ODS_OMNICANAL";
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
				IDG_DEC_ODS_OMNICANAL.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(IDG_DEC_ODS_OMNICANAL.this, new Object[] { e , currentComponent, globalMap});
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

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tContextLoad_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tContextLoad_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tOracleConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseClose_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseClose_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tOracleClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tOracleInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tOracleInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseOutputBulk_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseIQBulkExec_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseIQBulkExec_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSybaseIQBulkExec_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSybaseIQBulkExec_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tOracleRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tOracleRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tOracleConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tOracleClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tOracleInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tOracleInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseIQBulkExec_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSybaseIQBulkExec_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tOracleRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			








public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

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
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				tRunJob_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
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
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	


public static class PayrollContextStruct implements routines.system.IPersistableRow<PayrollContextStruct> {
    final static byte[] commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];
    static byte[] commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];

	
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
			if(length > commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length == 0) {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL) {

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
    public int compareTo(PayrollContextStruct other) {

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
public void tRunJob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		PayrollContextStruct PayrollContext = new PayrollContextStruct();




	
	/**
	 * [tContextLoad_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tContextLoad_1", false);
		start_Hash.put("tContextLoad_1", System.currentTimeMillis());
		
	
	currentComponent="tContextLoad_1";

	
		int tos_count_tContextLoad_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tContextLoad_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tContextLoad_1 = new StringBuilder();
            log4jParamters_tContextLoad_1.append("Parameters:");
                    log4jParamters_tContextLoad_1.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("PRINT_OPERATIONS" + " = " + "false");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("DISABLE_ERROR" + " = " + "false");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("DISABLE_WARNINGS" + " = " + "true");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("DISABLE_INFO" + " = " + "true");
                log4jParamters_tContextLoad_1.append(" | ");
                    log4jParamters_tContextLoad_1.append("DIEONERROR" + " = " + "false");
                log4jParamters_tContextLoad_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tContextLoad_1 - "  + log4jParamters_tContextLoad_1 );
	java.util.List<String> assignList_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_tContextLoad_1 = new java.util.ArrayList<String>();
	int nb_line_tContextLoad_1 = 0;

 



/**
 * [tContextLoad_1 begin ] stop
 */



	
	/**
	 * [tRunJob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_1", false);
		start_Hash.put("tRunJob_1", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_1";

	
		int tos_count_tRunJob_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tRunJob_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tRunJob_1 = new StringBuilder();
            log4jParamters_tRunJob_1.append("Parameters:");
                    log4jParamters_tRunJob_1.append("USE_DYNAMIC_JOB" + " = " + "false");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("PROCESS" + " = " + "ContextLoad");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("CONTEXTPARAMS" + " = " + "[]");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                log4jParamters_tRunJob_1.append(" | ");
                    log4jParamters_tRunJob_1.append("PRINT_PARAMETER" + " = " + "false");
                log4jParamters_tRunJob_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_1 - "  + log4jParamters_tRunJob_1 );


 



/**
 * [tRunJob_1 begin ] stop
 */
	
	/**
	 * [tRunJob_1 main ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	
	java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_1.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_1.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_1.add("--father_node=tRunJob_1");
	      			
	        			paraList_tRunJob_1.add("--context=Linux");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_1.add("--log4jLevel="+log4jLevel);
			}
		
	//for feature:10589
	
		paraList_tRunJob_1.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_1.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_1 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_1 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_1".equals(tRunJobName_tRunJob_1) && childResumePath_tRunJob_1 != null){
		paraList_tRunJob_1.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_1");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_1 = null;

	
	
		idg_dec.contextload_0_1.ContextLoad childJob_tRunJob_1 = new idg_dec.contextload_0_1.ContextLoad();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_1 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_1) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_1 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_1 : talendDataSources_tRunJob_1
			        .entrySet()) {
	            dataSources_tRunJob_1.put(talendDataSourceEntry_tRunJob_1.getKey(),
	                    talendDataSourceEntry_tRunJob_1.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_1.setDataSources(dataSources_tRunJob_1);
	    }
		  
			childJob_tRunJob_1.parentContextMap = parentContextMap_tRunJob_1;
		  
		
			log.info("tRunJob_1 - The child job 'idg_dec.contextload_0_1.ContextLoad' starts on the version '0.1' with the context 'Linux'.");
		
		String[][] childReturn_tRunJob_1 = childJob_tRunJob_1.runJob((String[]) paraList_tRunJob_1.toArray(new String[paraList_tRunJob_1.size()]));
		
			log.info("tRunJob_1 - The child job 'idg_dec.contextload_0_1.ContextLoad' is done.");
		
	  	
				errorCode = childJob_tRunJob_1.getErrorCode();
		    
	            
	    	if(childJob_tRunJob_1.getErrorCode() == null){
				globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getStatus() != null && ("failure").equals(childJob_tRunJob_1.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getErrorCode());
		    }
		    if (childJob_tRunJob_1.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_1.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_1.getErrorCode() != null || ("failure").equals(childJob_tRunJob_1.getStatus())) {
	        		throw new RuntimeException("Child job running failed");
				}
			
	  	
			for (String[] item_tRunJob_1 : childReturn_tRunJob_1) { 
				if(childJob_tRunJob_1.hastBufferOutputComponent() || true){
			    			
						if(0 < item_tRunJob_1.length){				
			           		
				           		PayrollContext.key = item_tRunJob_1[0];
			           		
		           		}else{
			           		PayrollContext.key = null;
		           		}
							
						if(1 < item_tRunJob_1.length){				
			           		
				           		PayrollContext.value = item_tRunJob_1[1];
			           		
		           		}else{
			           		PayrollContext.value = null;
		           		}
					
				}
		

 


	tos_count_tRunJob_1++;

/**
 * [tRunJob_1 main ] stop
 */

	
	/**
	 * [tContextLoad_1 main ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	
    			if(log.isTraceEnabled()){
    				log.trace("PayrollContext - " + (PayrollContext==null? "": PayrollContext.toLogString()));
    			}
    		
        //////////////////////////
        String tmp_key_tContextLoad_1 = null;
                    String key_tContextLoad_1 = null;
                      if (PayrollContext.key != null){
                          tmp_key_tContextLoad_1 = PayrollContext.key.trim();
                        if ((tmp_key_tContextLoad_1.startsWith("#") || tmp_key_tContextLoad_1.startsWith("!") )){
                          tmp_key_tContextLoad_1 = null;
                        } else {
                          PayrollContext.key = tmp_key_tContextLoad_1;
                        }
                      }
                        if(PayrollContext.key != null) {
                    key_tContextLoad_1 =
                        PayrollContext.key;
                        }
                    String value_tContextLoad_1 = null;
                        if(PayrollContext.value != null) {
                    value_tContextLoad_1 =
                        PayrollContext.value;
                        }

  if (tmp_key_tContextLoad_1 != null){
  try{
        if(key_tContextLoad_1!=null && "contextDir".equals(key_tContextLoad_1))
        {
           context.contextDir=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_AdditionalParams".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_AdditionalParams=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_Login".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_Login=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_Password".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_Password=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_Port".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_Port=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_Schema".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_Schema=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_Server".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_Server=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_ServiceName".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_ServiceName=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Login".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Login=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Password".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Password=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Port".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Port=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Schema".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Schema=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Server".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Server=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName".equals(key_tContextLoad_1))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_AdditionalParams".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_AdditionalParams=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Login".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Login=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Password".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Password=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Port".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Port=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Schema".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Schema=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Server".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Server=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_Sid".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_Sid=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Login".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Login=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Password".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Password=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Port".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Port=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Schema".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Server".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Server=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Sid".equals(key_tContextLoad_1))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "P_VAR_DEC_DIR".equals(key_tContextLoad_1))
        {
           context.P_VAR_DEC_DIR=value_tContextLoad_1;
        }


        if (context.getProperty(key_tContextLoad_1)!=null)
        {
            assignList_tContextLoad_1.add(key_tContextLoad_1);
        }else  {
            newPropertyList_tContextLoad_1.add(key_tContextLoad_1);
        }
        if(value_tContextLoad_1 == null){
            context.setProperty(key_tContextLoad_1, "");
        }else{
            context.setProperty(key_tContextLoad_1,value_tContextLoad_1);
        }
    }catch(java.lang.Exception e){
            log.error("tContextLoad_1 - Setting a value for the key \"" + key_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_tContextLoad_1++;
    }
        //////////////////////////

 


	tos_count_tContextLoad_1++;

/**
 * [tContextLoad_1 main ] stop
 */


	
		} // C_01
	
	
	/**
	 * [tRunJob_1 end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 
                if(log.isInfoEnabled())
            log.info("tRunJob_1 - "  + "Done." );

ok_Hash.put("tRunJob_1", true);
end_Hash.put("tRunJob_1", System.currentTimeMillis());




/**
 * [tRunJob_1 end ] stop
 */

	
	/**
	 * [tContextLoad_1 end ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	
	
	java.util.Enumeration<?> enu_tContextLoad_1 = context.propertyNames();
    while(enu_tContextLoad_1.hasMoreElements())
    {           
    	String key_tContextLoad_1 = (String)enu_tContextLoad_1.nextElement();
        if(!assignList_tContextLoad_1.contains(key_tContextLoad_1) && !newPropertyList_tContextLoad_1.contains(key_tContextLoad_1))
        {
            noAssignList_tContextLoad_1.add(key_tContextLoad_1);
        }          
    } 

    String newPropertyStr_tContextLoad_1 = newPropertyList_tContextLoad_1.toString();
    String newProperty_tContextLoad_1 = newPropertyStr_tContextLoad_1.substring(1, newPropertyStr_tContextLoad_1.length() - 1);
    
    String noAssignStr_tContextLoad_1 = noAssignList_tContextLoad_1.toString();
    String noAssign_tContextLoad_1 = noAssignStr_tContextLoad_1.substring(1, noAssignStr_tContextLoad_1.length() - 1);
    
    globalMap.put("tContextLoad_1_KEY_NOT_INCONTEXT", newProperty_tContextLoad_1);
    globalMap.put("tContextLoad_1_KEY_NOT_LOADED", noAssign_tContextLoad_1);

    globalMap.put("tContextLoad_1_NB_LINE",nb_line_tContextLoad_1);

	List<String> parametersToEncrypt_tContextLoad_1 = new java.util.ArrayList<String>();
	
		parametersToEncrypt_tContextLoad_1.add("ORACLE_ODS_Password");
		
		parametersToEncrypt_tContextLoad_1.add("ORACLE_ODS_SRC_WORK_SCHEMA_Password");
		
		parametersToEncrypt_tContextLoad_1.add("SYBASE_DEC_Password");
		
		parametersToEncrypt_tContextLoad_1.add("SYBASE_DEC_SRC_WORK_SCHEMA_Password");
		
	
	resumeUtil.addLog("NODE", "NODE:tContextLoad_1", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_tContextLoad_1));    
    	log.info("tContextLoad_1 - Loaded contexts count: " + nb_line_tContextLoad_1 + ".");
    
 
                if(log.isInfoEnabled())
            log.info("tContextLoad_1 - "  + "Done." );

ok_Hash.put("tContextLoad_1", true);
end_Hash.put("tContextLoad_1", System.currentTimeMillis());




/**
 * [tContextLoad_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tRunJob_2Process(globalMap); 
						



	
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
	 * [tRunJob_1 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 finally ] stop
 */

	
	/**
	 * [tContextLoad_1 finally ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	

 



/**
 * [tContextLoad_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
	}
	


public static class PayrollContext_BalisesStruct implements routines.system.IPersistableRow<PayrollContext_BalisesStruct> {
    final static byte[] commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];
    static byte[] commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];

	
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
			if(length > commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length == 0) {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL) {

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
    public int compareTo(PayrollContext_BalisesStruct other) {

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
public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		PayrollContext_BalisesStruct PayrollContext_Balises = new PayrollContext_BalisesStruct();




	
	/**
	 * [tContextLoad_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tContextLoad_2", false);
		start_Hash.put("tContextLoad_2", System.currentTimeMillis());
		
	
	currentComponent="tContextLoad_2";

	
		int tos_count_tContextLoad_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tContextLoad_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tContextLoad_2 = new StringBuilder();
            log4jParamters_tContextLoad_2.append("Parameters:");
                    log4jParamters_tContextLoad_2.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("PRINT_OPERATIONS" + " = " + "false");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("DISABLE_ERROR" + " = " + "false");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("DISABLE_WARNINGS" + " = " + "true");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("DISABLE_INFO" + " = " + "true");
                log4jParamters_tContextLoad_2.append(" | ");
                    log4jParamters_tContextLoad_2.append("DIEONERROR" + " = " + "false");
                log4jParamters_tContextLoad_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tContextLoad_2 - "  + log4jParamters_tContextLoad_2 );
	java.util.List<String> assignList_tContextLoad_2 = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_tContextLoad_2 = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_tContextLoad_2 = new java.util.ArrayList<String>();
	int nb_line_tContextLoad_2 = 0;

 



/**
 * [tContextLoad_2 begin ] stop
 */



	
	/**
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";

	
		int tos_count_tRunJob_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tRunJob_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tRunJob_2 = new StringBuilder();
            log4jParamters_tRunJob_2.append("Parameters:");
                    log4jParamters_tRunJob_2.append("USE_DYNAMIC_JOB" + " = " + "false");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("PROCESS" + " = " + "ContextLoad_Balises");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "true");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("CONTEXTPARAMS" + " = " + "[]");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                log4jParamters_tRunJob_2.append(" | ");
                    log4jParamters_tRunJob_2.append("PRINT_PARAMETER" + " = " + "false");
                log4jParamters_tRunJob_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_2 - "  + log4jParamters_tRunJob_2 );


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        			paraList_tRunJob_2.add("--context=Linux");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_2.add("--log4jLevel="+log4jLevel);
			}
		
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	
		 
		context.synchronizeContext();
		java.util.Enumeration<?> propertyNames_tRunJob_2 = context.propertyNames();
		while (propertyNames_tRunJob_2.hasMoreElements()) {
			String key_tRunJob_2 = (String) propertyNames_tRunJob_2.nextElement();
			Object value_tRunJob_2 = (Object) context.get(key_tRunJob_2);       
			paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + value_tRunJob_2);
		}
		  
			parentContextMap_tRunJob_2.put("contextDir", context.contextDir);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_AdditionalParams", context.ORACLE_ODS_AdditionalParams);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_Login", context.ORACLE_ODS_Login);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_Password", context.ORACLE_ODS_Password);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_Port", context.ORACLE_ODS_Port);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_Schema", context.ORACLE_ODS_Schema);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_Server", context.ORACLE_ODS_Server);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_ServiceName", context.ORACLE_ODS_ServiceName);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams", context.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_Login", context.ORACLE_ODS_SRC_WORK_SCHEMA_Login);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_Password", context.ORACLE_ODS_SRC_WORK_SCHEMA_Password);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_Port", context.ORACLE_ODS_SRC_WORK_SCHEMA_Port);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_Schema", context.ORACLE_ODS_SRC_WORK_SCHEMA_Schema);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_Server", context.ORACLE_ODS_SRC_WORK_SCHEMA_Server);
		  
			parentContextMap_tRunJob_2.put("ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName", context.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_AdditionalParams", context.SYBASE_DEC_AdditionalParams);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Login", context.SYBASE_DEC_Login);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Password", context.SYBASE_DEC_Password);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Port", context.SYBASE_DEC_Port);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Schema", context.SYBASE_DEC_Schema);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Server", context.SYBASE_DEC_Server);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_Sid", context.SYBASE_DEC_Sid);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams", context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Login", context.SYBASE_DEC_SRC_WORK_SCHEMA_Login);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Password", context.SYBASE_DEC_SRC_WORK_SCHEMA_Password);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Port", context.SYBASE_DEC_SRC_WORK_SCHEMA_Port);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Schema", context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Server", context.SYBASE_DEC_SRC_WORK_SCHEMA_Server);
		  
			parentContextMap_tRunJob_2.put("SYBASE_DEC_SRC_WORK_SCHEMA_Sid", context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid);
		  
			parentContextMap_tRunJob_2.put("P_VAR_DEC_DIR", context.P_VAR_DEC_DIR);
		

	Object obj_tRunJob_2 = null;

	
	
		idg_dec.contextload_balises_0_1.ContextLoad_Balises childJob_tRunJob_2 = new idg_dec.contextload_balises_0_1.ContextLoad_Balises();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
			log.info("tRunJob_2 - The child job 'idg_dec.contextload_balises_0_1.ContextLoad_Balises' starts on the version '0.1' with the context 'Linux'.");
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
			log.info("tRunJob_2 - The child job 'idg_dec.contextload_balises_0_1.ContextLoad_Balises' is done.");
		
	  	
				errorCode = childJob_tRunJob_2.getErrorCode();
		    
	            
	    	if(childJob_tRunJob_2.getErrorCode() == null){
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
		    }
		    if (childJob_tRunJob_2.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
	        		throw new RuntimeException("Child job running failed");
				}
			
	  	
			for (String[] item_tRunJob_2 : childReturn_tRunJob_2) { 
				if(childJob_tRunJob_2.hastBufferOutputComponent() || true){
			    			
						if(0 < item_tRunJob_2.length){				
			           		
				           		PayrollContext_Balises.key = item_tRunJob_2[0];
			           		
		           		}else{
			           		PayrollContext_Balises.key = null;
		           		}
							
						if(1 < item_tRunJob_2.length){				
			           		
				           		PayrollContext_Balises.value = item_tRunJob_2[1];
			           		
		           		}else{
			           		PayrollContext_Balises.value = null;
		           		}
					
				}
		

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */

	
	/**
	 * [tContextLoad_2 main ] start
	 */

	

	
	
	currentComponent="tContextLoad_2";

	
    			if(log.isTraceEnabled()){
    				log.trace("PayrollContext_Balises - " + (PayrollContext_Balises==null? "": PayrollContext_Balises.toLogString()));
    			}
    		
        //////////////////////////
        String tmp_key_tContextLoad_2 = null;
                    String key_tContextLoad_2 = null;
                      if (PayrollContext_Balises.key != null){
                          tmp_key_tContextLoad_2 = PayrollContext_Balises.key.trim();
                        if ((tmp_key_tContextLoad_2.startsWith("#") || tmp_key_tContextLoad_2.startsWith("!") )){
                          tmp_key_tContextLoad_2 = null;
                        } else {
                          PayrollContext_Balises.key = tmp_key_tContextLoad_2;
                        }
                      }
                        if(PayrollContext_Balises.key != null) {
                    key_tContextLoad_2 =
                        PayrollContext_Balises.key;
                        }
                    String value_tContextLoad_2 = null;
                        if(PayrollContext_Balises.value != null) {
                    value_tContextLoad_2 =
                        PayrollContext_Balises.value;
                        }

  if (tmp_key_tContextLoad_2 != null){
  try{
        if(key_tContextLoad_2!=null && "contextDir".equals(key_tContextLoad_2))
        {
           context.contextDir=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_AdditionalParams".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_AdditionalParams=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_Login".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_Login=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_Password".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_Password=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_Port".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_Port=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_Schema".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_Schema=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_Server".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_Server=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_ServiceName".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_ServiceName=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Login".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Login=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Password".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Password=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Port".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Port=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Schema".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Schema=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_Server".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_Server=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName".equals(key_tContextLoad_2))
        {
           context.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_AdditionalParams".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_AdditionalParams=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Login".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Login=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Password".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Password=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Port".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Port=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Schema".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Schema=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Server".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Server=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_Sid".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_Sid=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Login".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Login=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Password".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Password=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Port".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Port=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Schema".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Server".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Server=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "SYBASE_DEC_SRC_WORK_SCHEMA_Sid".equals(key_tContextLoad_2))
        {
           context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid=value_tContextLoad_2;
        }

        if(key_tContextLoad_2!=null && "P_VAR_DEC_DIR".equals(key_tContextLoad_2))
        {
           context.P_VAR_DEC_DIR=value_tContextLoad_2;
        }


        if (context.getProperty(key_tContextLoad_2)!=null)
        {
            assignList_tContextLoad_2.add(key_tContextLoad_2);
        }else  {
            newPropertyList_tContextLoad_2.add(key_tContextLoad_2);
        }
        if(value_tContextLoad_2 == null){
            context.setProperty(key_tContextLoad_2, "");
        }else{
            context.setProperty(key_tContextLoad_2,value_tContextLoad_2);
        }
    }catch(java.lang.Exception e){
            log.error("tContextLoad_2 - Setting a value for the key \"" + key_tContextLoad_2 + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_tContextLoad_2 + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_tContextLoad_2++;
    }
        //////////////////////////

 


	tos_count_tContextLoad_2++;

/**
 * [tContextLoad_2 main ] stop
 */


	
		} // C_01
	
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 
                if(log.isInfoEnabled())
            log.info("tRunJob_2 - "  + "Done." );

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());

				tSybaseConnection_1Process(globalMap);



/**
 * [tRunJob_2 end ] stop
 */

	
	/**
	 * [tContextLoad_2 end ] start
	 */

	

	
	
	currentComponent="tContextLoad_2";

	
	
	java.util.Enumeration<?> enu_tContextLoad_2 = context.propertyNames();
    while(enu_tContextLoad_2.hasMoreElements())
    {           
    	String key_tContextLoad_2 = (String)enu_tContextLoad_2.nextElement();
        if(!assignList_tContextLoad_2.contains(key_tContextLoad_2) && !newPropertyList_tContextLoad_2.contains(key_tContextLoad_2))
        {
            noAssignList_tContextLoad_2.add(key_tContextLoad_2);
        }          
    } 

    String newPropertyStr_tContextLoad_2 = newPropertyList_tContextLoad_2.toString();
    String newProperty_tContextLoad_2 = newPropertyStr_tContextLoad_2.substring(1, newPropertyStr_tContextLoad_2.length() - 1);
    
    String noAssignStr_tContextLoad_2 = noAssignList_tContextLoad_2.toString();
    String noAssign_tContextLoad_2 = noAssignStr_tContextLoad_2.substring(1, noAssignStr_tContextLoad_2.length() - 1);
    
    globalMap.put("tContextLoad_2_KEY_NOT_INCONTEXT", newProperty_tContextLoad_2);
    globalMap.put("tContextLoad_2_KEY_NOT_LOADED", noAssign_tContextLoad_2);

    globalMap.put("tContextLoad_2_NB_LINE",nb_line_tContextLoad_2);

	List<String> parametersToEncrypt_tContextLoad_2 = new java.util.ArrayList<String>();
	
		parametersToEncrypt_tContextLoad_2.add("ORACLE_ODS_Password");
		
		parametersToEncrypt_tContextLoad_2.add("ORACLE_ODS_SRC_WORK_SCHEMA_Password");
		
		parametersToEncrypt_tContextLoad_2.add("SYBASE_DEC_Password");
		
		parametersToEncrypt_tContextLoad_2.add("SYBASE_DEC_SRC_WORK_SCHEMA_Password");
		
	
	resumeUtil.addLog("NODE", "NODE:tContextLoad_2", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_tContextLoad_2));    
    	log.info("tContextLoad_2 - Loaded contexts count: " + nb_line_tContextLoad_2 + ".");
    
 
                if(log.isInfoEnabled())
            log.info("tContextLoad_2 - "  + "Done." );

ok_Hash.put("tContextLoad_2", true);
end_Hash.put("tContextLoad_2", System.currentTimeMillis());




/**
 * [tContextLoad_2 end ] stop
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
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 finally ] stop
 */

	
	/**
	 * [tContextLoad_2 finally ] start
	 */

	

	
	
	currentComponent="tContextLoad_2";

	

 



/**
 * [tContextLoad_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseConnection_1_SUBPROCESS_STATE", 0);

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
	 * [tSybaseConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseConnection_1", false);
		start_Hash.put("tSybaseConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tSybaseConnection_1";

	
		int tos_count_tSybaseConnection_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseConnection_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseConnection_1 = new StringBuilder();
            log4jParamters_tSybaseConnection_1.append("Parameters:");
                    log4jParamters_tSybaseConnection_1.append("HOST" + " = " + "context.SYBASE_DEC_Server");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("PORT" + " = " + "context.SYBASE_DEC_Port");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("DBNAME" + " = " + "context.SYBASE_DEC_Sid");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("USER" + " = " + "context.SYBASE_DEC_Login");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.SYBASE_DEC_Password)).substring(0, 4) + "...");     
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("SCHEMA_DB" + " = " + "context.SYBASE_DEC_Schema");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("PROPERTIES" + " = " + "context.SYBASE_DEC_AdditionalParams");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                log4jParamters_tSybaseConnection_1.append(" | ");
                    log4jParamters_tSybaseConnection_1.append("AUTO_COMMIT" + " = " + "true");
                log4jParamters_tSybaseConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseConnection_1 - "  + log4jParamters_tSybaseConnection_1 );


	
		String url_tSybaseConnection_1 = "jdbc:sybase:Tds:" + context.SYBASE_DEC_Server + ":" + context.SYBASE_DEC_Port + "/" + context.SYBASE_DEC_Sid + "?" + context.SYBASE_DEC_AdditionalParams;

	String dbUser_tSybaseConnection_1 = context.SYBASE_DEC_Login;
	
	
		
	final String decryptedPassword_tSybaseConnection_1 = context.SYBASE_DEC_Password; 
		String dbPwd_tSybaseConnection_1 = decryptedPassword_tSybaseConnection_1;
	

	java.sql.Connection conn_tSybaseConnection_1 = null;
	
					String driverClass_tSybaseConnection_1 = "com.sybase.jdbc3.jdbc.SybDriver";
			java.lang.Class.forName(driverClass_tSybaseConnection_1);
		
	    		log.debug("tSybaseConnection_1 - Driver ClassName: "+driverClass_tSybaseConnection_1+".");
			
	    		log.info("tSybaseConnection_1 - Connection attempt to '" + url_tSybaseConnection_1 + "' with the username '" + dbUser_tSybaseConnection_1 + "'.");
			
		conn_tSybaseConnection_1 = java.sql.DriverManager.getConnection(url_tSybaseConnection_1,dbUser_tSybaseConnection_1,dbPwd_tSybaseConnection_1);
	    		log.info("tSybaseConnection_1 - Connection to '" + url_tSybaseConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tSybaseConnection_1", conn_tSybaseConnection_1);
	if (null != conn_tSybaseConnection_1) {
		
			log.debug("tSybaseConnection_1 - Connection is set auto commit to 'true'.");
			conn_tSybaseConnection_1.setAutoCommit(true);
	}
	
	globalMap.put("conn_tSybaseConnection_1", conn_tSybaseConnection_1);
	globalMap.put("host_tSybaseConnection_1", context.SYBASE_DEC_Server);
	globalMap.put("port_tSybaseConnection_1", context.SYBASE_DEC_Port);
	globalMap.put("db_tSybaseConnection_1", context.SYBASE_DEC_Sid);
	globalMap.put("user_tSybaseConnection_1", context.SYBASE_DEC_Login);
	globalMap.put("pass_tSybaseConnection_1", dbPwd_tSybaseConnection_1);
	globalMap.put("dbschema_tSybaseConnection_1", context.SYBASE_DEC_Schema);

 



/**
 * [tSybaseConnection_1 begin ] stop
 */
	
	/**
	 * [tSybaseConnection_1 main ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_1";

	

 


	tos_count_tSybaseConnection_1++;

/**
 * [tSybaseConnection_1 main ] stop
 */
	
	/**
	 * [tSybaseConnection_1 end ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_1";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseConnection_1 - "  + "Done." );

ok_Hash.put("tSybaseConnection_1", true);
end_Hash.put("tSybaseConnection_1", System.currentTimeMillis());

				tSybaseConnection_2Process(globalMap);



/**
 * [tSybaseConnection_1 end ] stop
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
	 * [tSybaseConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_1";

	

 



/**
 * [tSybaseConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseConnection_2_SUBPROCESS_STATE", 0);

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
	 * [tSybaseConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseConnection_2", false);
		start_Hash.put("tSybaseConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tSybaseConnection_2";

	
		int tos_count_tSybaseConnection_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseConnection_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseConnection_2 = new StringBuilder();
            log4jParamters_tSybaseConnection_2.append("Parameters:");
                    log4jParamters_tSybaseConnection_2.append("HOST" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_Server");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("PORT" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_Port");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("DBNAME" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("USER" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_Login");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.SYBASE_DEC_SRC_WORK_SCHEMA_Password)).substring(0, 4) + "...");     
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("SCHEMA_DB" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("PROPERTIES" + " = " + "context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
                log4jParamters_tSybaseConnection_2.append(" | ");
                    log4jParamters_tSybaseConnection_2.append("AUTO_COMMIT" + " = " + "true");
                log4jParamters_tSybaseConnection_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseConnection_2 - "  + log4jParamters_tSybaseConnection_2 );


	
		String url_tSybaseConnection_2 = "jdbc:sybase:Tds:" + context.SYBASE_DEC_SRC_WORK_SCHEMA_Server + ":" + context.SYBASE_DEC_SRC_WORK_SCHEMA_Port + "/" + context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid + "?" + context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams;

	String dbUser_tSybaseConnection_2 = context.SYBASE_DEC_SRC_WORK_SCHEMA_Login;
	
	
		
	final String decryptedPassword_tSybaseConnection_2 = context.SYBASE_DEC_SRC_WORK_SCHEMA_Password; 
		String dbPwd_tSybaseConnection_2 = decryptedPassword_tSybaseConnection_2;
	

	java.sql.Connection conn_tSybaseConnection_2 = null;
	
					String driverClass_tSybaseConnection_2 = "com.sybase.jdbc3.jdbc.SybDriver";
			java.lang.Class.forName(driverClass_tSybaseConnection_2);
		
	    		log.debug("tSybaseConnection_2 - Driver ClassName: "+driverClass_tSybaseConnection_2+".");
			
	    		log.info("tSybaseConnection_2 - Connection attempt to '" + url_tSybaseConnection_2 + "' with the username '" + dbUser_tSybaseConnection_2 + "'.");
			
		conn_tSybaseConnection_2 = java.sql.DriverManager.getConnection(url_tSybaseConnection_2,dbUser_tSybaseConnection_2,dbPwd_tSybaseConnection_2);
	    		log.info("tSybaseConnection_2 - Connection to '" + url_tSybaseConnection_2 + "' has succeeded.");
			

		globalMap.put("conn_tSybaseConnection_2", conn_tSybaseConnection_2);
	if (null != conn_tSybaseConnection_2) {
		
			log.debug("tSybaseConnection_2 - Connection is set auto commit to 'true'.");
			conn_tSybaseConnection_2.setAutoCommit(true);
	}
	
	globalMap.put("conn_tSybaseConnection_2", conn_tSybaseConnection_2);
	globalMap.put("host_tSybaseConnection_2", context.SYBASE_DEC_SRC_WORK_SCHEMA_Server);
	globalMap.put("port_tSybaseConnection_2", context.SYBASE_DEC_SRC_WORK_SCHEMA_Port);
	globalMap.put("db_tSybaseConnection_2", context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid);
	globalMap.put("user_tSybaseConnection_2", context.SYBASE_DEC_SRC_WORK_SCHEMA_Login);
	globalMap.put("pass_tSybaseConnection_2", dbPwd_tSybaseConnection_2);
	globalMap.put("dbschema_tSybaseConnection_2", context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema);

 



/**
 * [tSybaseConnection_2 begin ] stop
 */
	
	/**
	 * [tSybaseConnection_2 main ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_2";

	

 


	tos_count_tSybaseConnection_2++;

/**
 * [tSybaseConnection_2 main ] stop
 */
	
	/**
	 * [tSybaseConnection_2 end ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_2";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseConnection_2 - "  + "Done." );

ok_Hash.put("tSybaseConnection_2", true);
end_Hash.put("tSybaseConnection_2", System.currentTimeMillis());

				tOracleConnection_1Process(globalMap);



/**
 * [tSybaseConnection_2 end ] stop
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
	 * [tSybaseConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tSybaseConnection_2";

	

 



/**
 * [tSybaseConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseConnection_2_SUBPROCESS_STATE", 1);
	}
	

public void tOracleConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tOracleConnection_1_SUBPROCESS_STATE", 0);

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
	 * [tOracleConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tOracleConnection_1", false);
		start_Hash.put("tOracleConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tOracleConnection_1";

	
		int tos_count_tOracleConnection_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tOracleConnection_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tOracleConnection_1 = new StringBuilder();
            log4jParamters_tOracleConnection_1.append("Parameters:");
                    log4jParamters_tOracleConnection_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SERVICE_NAME");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("DB_VERSION" + " = " + "ORACLE_12");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("USE_TNS_FILE" + " = " + "false");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("HOST" + " = " + "context.ORACLE_ODS_Server");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("PORT" + " = " + "context.ORACLE_ODS_Port");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("DBNAME" + " = " + "context.ORACLE_ODS_ServiceName");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("SCHEMA_DB" + " = " + "context.ORACLE_ODS_Schema");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("USER" + " = " + "context.ORACLE_ODS_Login");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.ORACLE_ODS_Password)).substring(0, 4) + "...");     
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("PROPERTIES" + " = " + "context.ORACLE_ODS_AdditionalParams");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                log4jParamters_tOracleConnection_1.append(" | ");
                    log4jParamters_tOracleConnection_1.append("AUTO_COMMIT" + " = " + "true");
                log4jParamters_tOracleConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tOracleConnection_1 - "  + log4jParamters_tOracleConnection_1 );
	

	
        String url_tOracleConnection_1 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host=" + context.ORACLE_ODS_Server + ")(port=" + context.ORACLE_ODS_Port + "))(connect_data=(service_name=" + context.ORACLE_ODS_ServiceName + ")))";
    	globalMap.put("connectionType_" + "tOracleConnection_1", "ORACLE_SERVICE_NAME");

	String dbUser_tOracleConnection_1 = context.ORACLE_ODS_Login;
	
	
		
	final String decryptedPassword_tOracleConnection_1 = context.ORACLE_ODS_Password; 
		String dbPwd_tOracleConnection_1 = decryptedPassword_tOracleConnection_1;
	

	java.sql.Connection conn_tOracleConnection_1 = null;
	
		
			String driverClass_tOracleConnection_1 = "oracle.jdbc.OracleDriver";
			java.lang.Class.forName(driverClass_tOracleConnection_1);
		
	    		log.debug("tOracleConnection_1 - Driver ClassName: "+driverClass_tOracleConnection_1+".");
			
	    		log.info("tOracleConnection_1 - Connection attempt to '" + url_tOracleConnection_1 + "' with the username '" + dbUser_tOracleConnection_1 + "'.");
			
			java.util.Properties atnParamsPrope_tOracleConnection_1 = new java.util.Properties();
			atnParamsPrope_tOracleConnection_1.put("user",dbUser_tOracleConnection_1);
			atnParamsPrope_tOracleConnection_1.put("password",dbPwd_tOracleConnection_1);
			if(context.ORACLE_ODS_AdditionalParams != null && !"\"\"".equals(context.ORACLE_ODS_AdditionalParams) && !"".equals(context.ORACLE_ODS_AdditionalParams)){
                atnParamsPrope_tOracleConnection_1.load(new java.io.ByteArrayInputStream(context.ORACLE_ODS_AdditionalParams.replace("&", "\n").getBytes()));
            }
			conn_tOracleConnection_1 = java.sql.DriverManager.getConnection(url_tOracleConnection_1, atnParamsPrope_tOracleConnection_1);
	    		log.info("tOracleConnection_1 - Connection to '" + url_tOracleConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tOracleConnection_1", conn_tOracleConnection_1);
	if (null != conn_tOracleConnection_1) {
		
			log.debug("tOracleConnection_1 - Connection is set auto commit to 'true'.");
			conn_tOracleConnection_1.setAutoCommit(true);
	}
        globalMap.put("host_" + "tOracleConnection_1",context.ORACLE_ODS_Server);
        globalMap.put("port_" + "tOracleConnection_1",context.ORACLE_ODS_Port);
        globalMap.put("dbname_" + "tOracleConnection_1",context.ORACLE_ODS_ServiceName);

	globalMap.put("conn_" + "tOracleConnection_1",conn_tOracleConnection_1);
	globalMap.put("dbschema_" + "tOracleConnection_1", context.ORACLE_ODS_Schema);
	globalMap.put("username_" + "tOracleConnection_1",context.ORACLE_ODS_Login);
	globalMap.put("password_" + "tOracleConnection_1",dbPwd_tOracleConnection_1);

 



/**
 * [tOracleConnection_1 begin ] stop
 */
	
	/**
	 * [tOracleConnection_1 main ] start
	 */

	

	
	
	currentComponent="tOracleConnection_1";

	

 


	tos_count_tOracleConnection_1++;

/**
 * [tOracleConnection_1 main ] stop
 */
	
	/**
	 * [tOracleConnection_1 end ] start
	 */

	

	
	
	currentComponent="tOracleConnection_1";

	

 
                if(log.isInfoEnabled())
            log.info("tOracleConnection_1 - "  + "Done." );

ok_Hash.put("tOracleConnection_1", true);
end_Hash.put("tOracleConnection_1", System.currentTimeMillis());




/**
 * [tOracleConnection_1 end ] stop
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
	 * [tOracleConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tOracleConnection_1";

	

 



/**
 * [tOracleConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tOracleConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

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
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				tSybaseClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
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
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseClose_1_SUBPROCESS_STATE", 0);

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
	 * [tSybaseClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseClose_1", false);
		start_Hash.put("tSybaseClose_1", System.currentTimeMillis());
		
	
	currentComponent="tSybaseClose_1";

	
		int tos_count_tSybaseClose_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseClose_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseClose_1 = new StringBuilder();
            log4jParamters_tSybaseClose_1.append("Parameters:");
                    log4jParamters_tSybaseClose_1.append("CONNECTION" + " = " + "tSybaseConnection_1");
                log4jParamters_tSybaseClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseClose_1 - "  + log4jParamters_tSybaseClose_1 );

 



/**
 * [tSybaseClose_1 begin ] stop
 */
	
	/**
	 * [tSybaseClose_1 main ] start
	 */

	

	
	
	currentComponent="tSybaseClose_1";

	



	java.sql.Connection conn_tSybaseClose_1 = (java.sql.Connection)globalMap.get("conn_tSybaseConnection_1");
	if(conn_tSybaseClose_1 != null && !conn_tSybaseClose_1.isClosed())
	{
                if(log.isInfoEnabled())
            log.info("tSybaseClose_1 - "  + "Closing the connection "  + "conn_tSybaseConnection_1"  + " to the database." );
        conn_tSybaseClose_1.close();
                if(log.isInfoEnabled())
            log.info("tSybaseClose_1 - "  + "Connection "  + "conn_tSybaseConnection_1"  + " to the database has closed." );
	}

 


	tos_count_tSybaseClose_1++;

/**
 * [tSybaseClose_1 main ] stop
 */
	
	/**
	 * [tSybaseClose_1 end ] start
	 */

	

	
	
	currentComponent="tSybaseClose_1";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseClose_1 - "  + "Done." );

ok_Hash.put("tSybaseClose_1", true);
end_Hash.put("tSybaseClose_1", System.currentTimeMillis());

				tSybaseClose_2Process(globalMap);



/**
 * [tSybaseClose_1 end ] stop
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
	 * [tSybaseClose_1 finally ] start
	 */

	

	
	
	currentComponent="tSybaseClose_1";

	

 



/**
 * [tSybaseClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseClose_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseClose_2_SUBPROCESS_STATE", 0);

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
	 * [tSybaseClose_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseClose_2", false);
		start_Hash.put("tSybaseClose_2", System.currentTimeMillis());
		
	
	currentComponent="tSybaseClose_2";

	
		int tos_count_tSybaseClose_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseClose_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseClose_2 = new StringBuilder();
            log4jParamters_tSybaseClose_2.append("Parameters:");
                    log4jParamters_tSybaseClose_2.append("CONNECTION" + " = " + "tSybaseConnection_2");
                log4jParamters_tSybaseClose_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseClose_2 - "  + log4jParamters_tSybaseClose_2 );

 



/**
 * [tSybaseClose_2 begin ] stop
 */
	
	/**
	 * [tSybaseClose_2 main ] start
	 */

	

	
	
	currentComponent="tSybaseClose_2";

	



	java.sql.Connection conn_tSybaseClose_2 = (java.sql.Connection)globalMap.get("conn_tSybaseConnection_2");
	if(conn_tSybaseClose_2 != null && !conn_tSybaseClose_2.isClosed())
	{
                if(log.isInfoEnabled())
            log.info("tSybaseClose_2 - "  + "Closing the connection "  + "conn_tSybaseConnection_2"  + " to the database." );
        conn_tSybaseClose_2.close();
                if(log.isInfoEnabled())
            log.info("tSybaseClose_2 - "  + "Connection "  + "conn_tSybaseConnection_2"  + " to the database has closed." );
	}

 


	tos_count_tSybaseClose_2++;

/**
 * [tSybaseClose_2 main ] stop
 */
	
	/**
	 * [tSybaseClose_2 end ] start
	 */

	

	
	
	currentComponent="tSybaseClose_2";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseClose_2 - "  + "Done." );

ok_Hash.put("tSybaseClose_2", true);
end_Hash.put("tSybaseClose_2", System.currentTimeMillis());

				tOracleClose_1Process(globalMap);



/**
 * [tSybaseClose_2 end ] stop
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
	 * [tSybaseClose_2 finally ] start
	 */

	

	
	
	currentComponent="tSybaseClose_2";

	

 



/**
 * [tSybaseClose_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseClose_2_SUBPROCESS_STATE", 1);
	}
	

public void tOracleClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tOracleClose_1_SUBPROCESS_STATE", 0);

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
	 * [tOracleClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tOracleClose_1", false);
		start_Hash.put("tOracleClose_1", System.currentTimeMillis());
		
	
	currentComponent="tOracleClose_1";

	
		int tos_count_tOracleClose_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tOracleClose_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tOracleClose_1 = new StringBuilder();
            log4jParamters_tOracleClose_1.append("Parameters:");
                    log4jParamters_tOracleClose_1.append("CONNECTION" + " = " + "tOracleConnection_1");
                log4jParamters_tOracleClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tOracleClose_1 - "  + log4jParamters_tOracleClose_1 );

 



/**
 * [tOracleClose_1 begin ] stop
 */
	
	/**
	 * [tOracleClose_1 main ] start
	 */

	

	
	
	currentComponent="tOracleClose_1";

	

	java.sql.Connection conn_tOracleClose_1 = (java.sql.Connection)globalMap.get("conn_tOracleConnection_1");
	
	
	if(conn_tOracleClose_1 != null && !conn_tOracleClose_1.isClosed())
	{
		
	    		log.info("tOracleClose_1 - Closing the connection 'tOracleConnection_1' to the database.");
			
			conn_tOracleClose_1.close();
			
	    		log.info("tOracleClose_1 - Connection 'tOracleConnection_1' to the database closed.");
			
	}

 


	tos_count_tOracleClose_1++;

/**
 * [tOracleClose_1 main ] stop
 */
	
	/**
	 * [tOracleClose_1 end ] start
	 */

	

	
	
	currentComponent="tOracleClose_1";

	

 
                if(log.isInfoEnabled())
            log.info("tOracleClose_1 - "  + "Done." );

ok_Hash.put("tOracleClose_1", true);
end_Hash.put("tOracleClose_1", System.currentTimeMillis());




/**
 * [tOracleClose_1 end ] stop
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
	 * [tOracleClose_1 finally ] start
	 */

	

	
	
	currentComponent="tOracleClose_1";

	

 



/**
 * [tOracleClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tOracleClose_1_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];
    static byte[] commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];

	
			    public String P_VAR_DATE_DERN_EXEC;

				public String getP_VAR_DATE_DERN_EXEC () {
					return this.P_VAR_DATE_DERN_EXEC;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length == 0) {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL) {

        	try {

        		int length = 0;
		
					this.P_VAR_DATE_DERN_EXEC = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.P_VAR_DATE_DERN_EXEC,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("P_VAR_DATE_DERN_EXEC="+P_VAR_DATE_DERN_EXEC);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(P_VAR_DATE_DERN_EXEC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(P_VAR_DATE_DERN_EXEC);
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
public void tOracleInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tOracleInput_2_SUBPROCESS_STATE", 0);

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
                    log4jParamters_tSetGlobalVar_2.append("VARIABLES" + " = " + "[{VALUE="+("row2.P_VAR_DATE_DERN_EXEC")+", KEY="+("\"P_VAR_DATE_DERN_EXEC\"")+"}]");
                log4jParamters_tSetGlobalVar_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_2 - "  + log4jParamters_tSetGlobalVar_2 );

 



/**
 * [tSetGlobalVar_2 begin ] stop
 */



	
	/**
	 * [tOracleInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tOracleInput_2", false);
		start_Hash.put("tOracleInput_2", System.currentTimeMillis());
		
	
	currentComponent="tOracleInput_2";

	
		int tos_count_tOracleInput_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tOracleInput_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tOracleInput_2 = new StringBuilder();
            log4jParamters_tOracleInput_2.append("Parameters:");
                    log4jParamters_tOracleInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("CONNECTION" + " = " + "tOracleConnection_1");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("TABLE" + " = " + "\"\"");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("QUERY" + " = " + "\"  SELECT  	VAL  FROM ODS.PARAM_SCENAR  WHERE 1=1  	AND SCE = '\"+jobName+\"'  	AND VAR = 'IDG_DATE_DER_EXEC'  \"");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("USE_CURSOR" + " = " + "false");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("P_VAR_DATE_DERN_EXEC")+"}]");
                log4jParamters_tOracleInput_2.append(" | ");
                    log4jParamters_tOracleInput_2.append("NO_NULL_VALUES" + " = " + "false");
                log4jParamters_tOracleInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tOracleInput_2 - "  + log4jParamters_tOracleInput_2 );
	


	
		    int nb_line_tOracleInput_2 = 0;
		    java.sql.Connection conn_tOracleInput_2 = null;
		        conn_tOracleInput_2 = (java.sql.Connection)globalMap.get("conn_tOracleConnection_1");
				
				if(conn_tOracleInput_2 != null) {
					if(conn_tOracleInput_2.getMetaData() != null) {
						
						log.info("tOracleInput_2 - Uses an existing connection with username '" + conn_tOracleInput_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tOracleInput_2.getMetaData().getURL() + ".");
						
					}
				}
			
				if(((oracle.jdbc.OracleConnection)conn_tOracleInput_2).getSessionTimeZone() == null){
					java.sql.Statement stmtGetTZ_tOracleInput_2 = conn_tOracleInput_2.createStatement();
					java.sql.ResultSet rsGetTZ_tOracleInput_2 = stmtGetTZ_tOracleInput_2.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tOracleInput_2 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tOracleInput_2.next()) {
						sessionTimezone_tOracleInput_2 = rsGetTZ_tOracleInput_2.getString(1);
					}
					((oracle.jdbc.OracleConnection)conn_tOracleInput_2).setSessionTimeZone(sessionTimezone_tOracleInput_2);
				}
			
		    
			java.sql.Statement stmt_tOracleInput_2 = conn_tOracleInput_2.createStatement();

		    String dbquery_tOracleInput_2 = "\nSELECT\n	VAL\nFROM ODS.PARAM_SCENAR\nWHERE 1=1\n	AND SCE = '"+jobName+"'\n	AND VAR = 'IDG_DATE_DER_EXEC'\n";
			
                log.info("tOracleInput_2 - Executing the query: '"+dbquery_tOracleInput_2+"'.");
			

                       globalMap.put("tOracleInput_2_QUERY",dbquery_tOracleInput_2);

		    java.sql.ResultSet rs_tOracleInput_2 = null;
		try{
		    rs_tOracleInput_2 = stmt_tOracleInput_2.executeQuery(dbquery_tOracleInput_2);
		    java.sql.ResultSetMetaData rsmd_tOracleInput_2 = rs_tOracleInput_2.getMetaData();
		    int colQtyInRs_tOracleInput_2 = rsmd_tOracleInput_2.getColumnCount();

		    String tmpContent_tOracleInput_2 = null;
		    
		    
		    	log.info("tOracleInput_2 - Retrieving records from the database.");
		    
		    while (rs_tOracleInput_2.next()) {
		        nb_line_tOracleInput_2++;
		        
							if(colQtyInRs_tOracleInput_2 < 1) {
								row2.P_VAR_DATE_DERN_EXEC = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_2 = rs_tOracleInput_2.getString(1);
			        if(tmpContent_tOracleInput_2 != null) {
			            row2.P_VAR_DATE_DERN_EXEC = tmpContent_tOracleInput_2;
			        } else {
			            row2.P_VAR_DATE_DERN_EXEC = null;
			        }
		                    }
					
						log.debug("tOracleInput_2 - Retrieving the record " + nb_line_tOracleInput_2 + ".");
					




 



/**
 * [tOracleInput_2 begin ] stop
 */
	
	/**
	 * [tOracleInput_2 main ] start
	 */

	

	
	
	currentComponent="tOracleInput_2";

	

 


	tos_count_tOracleInput_2++;

/**
 * [tOracleInput_2 main ] stop
 */

	
	/**
	 * [tSetGlobalVar_2 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		

globalMap.put("P_VAR_DATE_DERN_EXEC", row2.P_VAR_DATE_DERN_EXEC);

 


	tos_count_tSetGlobalVar_2++;

/**
 * [tSetGlobalVar_2 main ] stop
 */



	
	/**
	 * [tOracleInput_2 end ] start
	 */

	

	
	
	currentComponent="tOracleInput_2";

	

}
}finally{
stmt_tOracleInput_2.close();

}

globalMap.put("tOracleInput_2_NB_LINE",nb_line_tOracleInput_2);
	    		log.info("tOracleInput_2 - Retrieved records count: "+nb_line_tOracleInput_2 + " .");
			
 
                if(log.isInfoEnabled())
            log.info("tOracleInput_2 - "  + "Done." );

ok_Hash.put("tOracleInput_2", true);
end_Hash.put("tOracleInput_2", System.currentTimeMillis());




/**
 * [tOracleInput_2 end ] stop
 */

	
	/**
	 * [tSetGlobalVar_2 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 
                if(log.isInfoEnabled())
            log.info("tSetGlobalVar_2 - "  + "Done." );

ok_Hash.put("tSetGlobalVar_2", true);
end_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());




/**
 * [tSetGlobalVar_2 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tOracleInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tOracleInput_3Process(globalMap); 
						



	
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
	 * [tOracleInput_2 finally ] start
	 */

	

	
	
	currentComponent="tOracleInput_2";

	

 



/**
 * [tOracleInput_2 finally ] stop
 */

	
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
		

		globalMap.put("tOracleInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];
    static byte[] commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[0];

	
			    public BigDecimal CODMAGUR_CONTACT;

				public BigDecimal getCODMAGUR_CONTACT () {
					return this.CODMAGUR_CONTACT;
				}
				
			    public String MAG_CONTACT;

				public String getMAG_CONTACT () {
					return this.MAG_CONTACT;
				}
				
			    public BigDecimal CODTPSCDE;

				public BigDecimal getCODTPSCDE () {
					return this.CODTPSCDE;
				}
				
			    public java.util.Date CREATION_TIME;

				public java.util.Date getCREATION_TIME () {
					return this.CREATION_TIME;
				}
				
			    public String NO_CMDE;

				public String getNO_CMDE () {
					return this.NO_CMDE;
				}
				
			    public BigDecimal NO_CAISSE;

				public BigDecimal getNO_CAISSE () {
					return this.NO_CAISSE;
				}
				
			    public BigDecimal NO_LIGNE;

				public BigDecimal getNO_LIGNE () {
					return this.NO_LIGNE;
				}
				
			    public BigDecimal CODINTART;

				public BigDecimal getCODINTART () {
					return this.CODINTART;
				}
				
			    public String CUST_ID;

				public String getCUST_ID () {
					return this.CUST_ID;
				}
				
			    public BigDecimal QUANTITE;

				public BigDecimal getQUANTITE () {
					return this.QUANTITE;
				}
				
			    public BigDecimal PV_TTC;

				public BigDecimal getPV_TTC () {
					return this.PV_TTC;
				}
				
			    public String DEVISE;

				public String getDEVISE () {
					return this.DEVISE;
				}
				
			    public String ANNULE;

				public String getANNULE () {
					return this.ANNULE;
				}
				
			    public String TYPE_PREPA;

				public String getTYPE_PREPA () {
					return this.TYPE_PREPA;
				}
				
			    public String MAG_PREPA;

				public String getMAG_PREPA () {
					return this.MAG_PREPA;
				}
				
			    public String TYPE_LIVRAISON;

				public String getTYPE_LIVRAISON () {
					return this.TYPE_LIVRAISON;
				}
				
			    public String MAG_DISTRIB;

				public String getMAG_DISTRIB () {
					return this.MAG_DISTRIB;
				}
				
			    public java.util.Date DATMOD;

				public java.util.Date getDATMOD () {
					return this.DATMOD;
				}
				
			    public String STATUT;

				public String getSTATUT () {
					return this.STATUT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length) {
				if(length < 1024 && commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL.length == 0) {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[1024];
				} else {
   					commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length);
			strReturn = new String(commonByteArray_IDG_DEC_IDG_DEC_ODS_OMNICANAL, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_IDG_DEC_IDG_DEC_ODS_OMNICANAL) {

        	try {

        		int length = 0;
		
						this.CODMAGUR_CONTACT = (BigDecimal) dis.readObject();
					
					this.MAG_CONTACT = readString(dis);
					
						this.CODTPSCDE = (BigDecimal) dis.readObject();
					
					this.CREATION_TIME = readDate(dis);
					
					this.NO_CMDE = readString(dis);
					
						this.NO_CAISSE = (BigDecimal) dis.readObject();
					
						this.NO_LIGNE = (BigDecimal) dis.readObject();
					
						this.CODINTART = (BigDecimal) dis.readObject();
					
					this.CUST_ID = readString(dis);
					
						this.QUANTITE = (BigDecimal) dis.readObject();
					
						this.PV_TTC = (BigDecimal) dis.readObject();
					
					this.DEVISE = readString(dis);
					
					this.ANNULE = readString(dis);
					
					this.TYPE_PREPA = readString(dis);
					
					this.MAG_PREPA = readString(dis);
					
					this.TYPE_LIVRAISON = readString(dis);
					
					this.MAG_DISTRIB = readString(dis);
					
					this.DATMOD = readDate(dis);
					
					this.STATUT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.CODMAGUR_CONTACT);
					
					// String
				
						writeString(this.MAG_CONTACT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CODTPSCDE);
					
					// java.util.Date
				
						writeDate(this.CREATION_TIME,dos);
					
					// String
				
						writeString(this.NO_CMDE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NO_CAISSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NO_LIGNE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CODINTART);
					
					// String
				
						writeString(this.CUST_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QUANTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PV_TTC);
					
					// String
				
						writeString(this.DEVISE,dos);
					
					// String
				
						writeString(this.ANNULE,dos);
					
					// String
				
						writeString(this.TYPE_PREPA,dos);
					
					// String
				
						writeString(this.MAG_PREPA,dos);
					
					// String
				
						writeString(this.TYPE_LIVRAISON,dos);
					
					// String
				
						writeString(this.MAG_DISTRIB,dos);
					
					// java.util.Date
				
						writeDate(this.DATMOD,dos);
					
					// String
				
						writeString(this.STATUT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODMAGUR_CONTACT="+String.valueOf(CODMAGUR_CONTACT));
		sb.append(",MAG_CONTACT="+MAG_CONTACT);
		sb.append(",CODTPSCDE="+String.valueOf(CODTPSCDE));
		sb.append(",CREATION_TIME="+String.valueOf(CREATION_TIME));
		sb.append(",NO_CMDE="+NO_CMDE);
		sb.append(",NO_CAISSE="+String.valueOf(NO_CAISSE));
		sb.append(",NO_LIGNE="+String.valueOf(NO_LIGNE));
		sb.append(",CODINTART="+String.valueOf(CODINTART));
		sb.append(",CUST_ID="+CUST_ID);
		sb.append(",QUANTITE="+String.valueOf(QUANTITE));
		sb.append(",PV_TTC="+String.valueOf(PV_TTC));
		sb.append(",DEVISE="+DEVISE);
		sb.append(",ANNULE="+ANNULE);
		sb.append(",TYPE_PREPA="+TYPE_PREPA);
		sb.append(",MAG_PREPA="+MAG_PREPA);
		sb.append(",TYPE_LIVRAISON="+TYPE_LIVRAISON);
		sb.append(",MAG_DISTRIB="+MAG_DISTRIB);
		sb.append(",DATMOD="+String.valueOf(DATMOD));
		sb.append(",STATUT="+STATUT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODMAGUR_CONTACT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODMAGUR_CONTACT);
            			}
            		
        			sb.append("|");
        		
        				if(MAG_CONTACT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MAG_CONTACT);
            			}
            		
        			sb.append("|");
        		
        				if(CODTPSCDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODTPSCDE);
            			}
            		
        			sb.append("|");
        		
        				if(CREATION_TIME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATION_TIME);
            			}
            		
        			sb.append("|");
        		
        				if(NO_CMDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NO_CMDE);
            			}
            		
        			sb.append("|");
        		
        				if(NO_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NO_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(NO_LIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NO_LIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODINTART == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODINTART);
            			}
            		
        			sb.append("|");
        		
        				if(CUST_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUST_ID);
            			}
            		
        			sb.append("|");
        		
        				if(QUANTITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QUANTITE);
            			}
            		
        			sb.append("|");
        		
        				if(PV_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(DEVISE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEVISE);
            			}
            		
        			sb.append("|");
        		
        				if(ANNULE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ANNULE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_PREPA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_PREPA);
            			}
            		
        			sb.append("|");
        		
        				if(MAG_PREPA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MAG_PREPA);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_LIVRAISON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_LIVRAISON);
            			}
            		
        			sb.append("|");
        		
        				if(MAG_DISTRIB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MAG_DISTRIB);
            			}
            		
        			sb.append("|");
        		
        				if(DATMOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATMOD);
            			}
            		
        			sb.append("|");
        		
        				if(STATUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STATUT);
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
public void tOracleInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tOracleInput_3_SUBPROCESS_STATE", 0);

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
	 * [tSybaseOutputBulk_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseOutputBulk_1", false);
		start_Hash.put("tSybaseOutputBulk_1", System.currentTimeMillis());
		
	
	currentComponent="tSybaseOutputBulk_1";

	
		int tos_count_tSybaseOutputBulk_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseOutputBulk_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseOutputBulk_1 = new StringBuilder();
            log4jParamters_tSybaseOutputBulk_1.append("Parameters:");
                    log4jParamters_tSybaseOutputBulk_1.append("FILENAME" + " = " + "context.P_VAR_DEC_DIR + \"/\" + jobName + \"/BULK/BI_FAICDE_OMNI.bcp\"");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                    log4jParamters_tSybaseOutputBulk_1.append("APPEND" + " = " + "false");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                    log4jParamters_tSybaseOutputBulk_1.append("ROWSEPARATOR" + " = " + "\"#²\"");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                    log4jParamters_tSybaseOutputBulk_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                    log4jParamters_tSybaseOutputBulk_1.append("INCLUDEHEADER" + " = " + "false");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                    log4jParamters_tSybaseOutputBulk_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                log4jParamters_tSybaseOutputBulk_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseOutputBulk_1 - "  + log4jParamters_tSybaseOutputBulk_1 );

		int nb_line_tSybaseOutputBulk_1 = 0;
		
		final String OUT_DELIM_tSybaseOutputBulk_1 = /** Start field tSybaseOutputBulk_1:FIELDSEPARATOR */"|"/** End field tSybaseOutputBulk_1:FIELDSEPARATOR */;
		
		final String OUT_DELIM_ROWSEP_tSybaseOutputBulk_1 = /** Start field tSybaseOutputBulk_1:ROWSEPARATOR */"#²"/** End field tSybaseOutputBulk_1:ROWSEPARATOR */;
		
		java.io.File file_tSybaseOutputBulk_1=new java.io.File(/** Start field tSybaseOutputBulk_1:FILENAME */context.P_VAR_DEC_DIR + "/" + jobName + "/BULK/BI_FAICDE_OMNI.bcp"/** End field tSybaseOutputBulk_1:FILENAME */);
		final java.io.BufferedWriter outtSybaseOutputBulk_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
        		new java.io.FileOutputStream(file_tSybaseOutputBulk_1, false),"ISO-8859-15"));
		resourceMap.put("outtSybaseOutputBulk_1", outtSybaseOutputBulk_1);         		
        		

 



/**
 * [tSybaseOutputBulk_1 begin ] stop
 */



	
	/**
	 * [tOracleInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tOracleInput_3", false);
		start_Hash.put("tOracleInput_3", System.currentTimeMillis());
		
	
	currentComponent="tOracleInput_3";

	
		int tos_count_tOracleInput_3 = 0;
		
                if(log.isInfoEnabled())
            log.info("tOracleInput_3 - "  + "Start to work." );
            StringBuilder log4jParamters_tOracleInput_3 = new StringBuilder();
            log4jParamters_tOracleInput_3.append("Parameters:");
                    log4jParamters_tOracleInput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("CONNECTION" + " = " + "tOracleConnection_1");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("TABLE" + " = " + "\"\"");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("QUERY" + " = " + "\"  SELECT  	CODMAGUR_CONTACT AS CODMAGUR_CONTACT  	,MAG_CONTACT AS MAG_CONTACT  	,CODTPSCDE AS CODTPSCDE  	,CREATION_TIME AS CREATION_TIME  	,NO_CMDE AS NO_CMDE  	,NO_CAISSE AS NO_CAISSE  	,NO_LIGNE AS NO_LIGNE  	,CODINTART AS CODINTART  	,CUST_ID AS CUST_ID  	,QUANTITE AS QUANTITE  	,PV_TTC AS PV_TTC  	,DEVISE AS DEVISE  	,ANNULE AS ANNULE  	,TYPE_PREPA AS TYPE_PREPA  	,MAG_PREPA AS MAG_PREPA  	,TYPE_LIVRAISON AS TYPE_LIVRAISON  	,MAG_DISTRIB AS MAG_DISTRIB  	,DATMOD AS DATMOD  	,STATUT AS STATUT  FROM \"+context.ORACLE_ODS_Schema+\".BI_FAICDE_OMNI  WHERE 1=1  	AND DATMOD > (TO_DATE('\"+ ((String)globalMap.get(\"P_VAR_DATE_DERN_EXEC\")) + \"','DD/MM/YYYY HH24:MI:SS') - 5/1440)  \"");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("USE_CURSOR" + " = " + "true");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("CURSOR_SIZE" + " = " + "10000");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CODMAGUR_CONTACT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MAG_CONTACT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODTPSCDE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATION_TIME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NO_CMDE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NO_CAISSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NO_LIGNE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODINTART")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUST_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("QUANTITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PV_TTC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEVISE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ANNULE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE_PREPA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MAG_PREPA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE_LIVRAISON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MAG_DISTRIB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATMOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("STATUT")+"}]");
                log4jParamters_tOracleInput_3.append(" | ");
                    log4jParamters_tOracleInput_3.append("NO_NULL_VALUES" + " = " + "false");
                log4jParamters_tOracleInput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tOracleInput_3 - "  + log4jParamters_tOracleInput_3 );
	


	
		    int nb_line_tOracleInput_3 = 0;
		    java.sql.Connection conn_tOracleInput_3 = null;
		        conn_tOracleInput_3 = (java.sql.Connection)globalMap.get("conn_tOracleConnection_1");
				
				if(conn_tOracleInput_3 != null) {
					if(conn_tOracleInput_3.getMetaData() != null) {
						
						log.info("tOracleInput_3 - Uses an existing connection with username '" + conn_tOracleInput_3.getMetaData().getUserName() + "'. Connection URL: " + conn_tOracleInput_3.getMetaData().getURL() + ".");
						
					}
				}
			
				if(((oracle.jdbc.OracleConnection)conn_tOracleInput_3).getSessionTimeZone() == null){
					java.sql.Statement stmtGetTZ_tOracleInput_3 = conn_tOracleInput_3.createStatement();
					java.sql.ResultSet rsGetTZ_tOracleInput_3 = stmtGetTZ_tOracleInput_3.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tOracleInput_3 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tOracleInput_3.next()) {
						sessionTimezone_tOracleInput_3 = rsGetTZ_tOracleInput_3.getString(1);
					}
					((oracle.jdbc.OracleConnection)conn_tOracleInput_3).setSessionTimeZone(sessionTimezone_tOracleInput_3);
				}
			
		    
			java.sql.Statement stmt_tOracleInput_3 = conn_tOracleInput_3.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tOracleInput_3.setFetchSize(10000);


		    String dbquery_tOracleInput_3 = "\nSELECT\n	CODMAGUR_CONTACT AS CODMAGUR_CONTACT\n	,MAG_CONTACT AS MAG_CONTACT\n	,CODTPSCDE AS CODTPSCDE\n	,CREATION_TIME AS CREATION_TIME\n	,NO_CMDE AS NO_CMDE\n	,NO_CAISSE AS NO_CAISSE\n	,NO_LIGNE AS NO_LIGNE\n	,CODINTART AS CODINTART\n	,CUST_ID AS CUST_ID\n	,QUANTITE AS QUANTITE\n	,PV_TTC AS PV_TTC\n	,DEVISE AS DEVISE\n	,ANNULE AS ANNULE\n	,TYPE_PREPA AS TYPE_PREPA\n	,MAG_PREPA AS MAG_PREPA\n	,TYPE_LIVRAISON AS TYPE_LIVRAISON\n	,MAG_DISTRIB AS MAG_DISTRIB\n	,DATMOD AS DATMOD\n	,STATUT AS STATUT\nFROM "+context.ORACLE_ODS_Schema+".BI_FAICDE_OMNI\nWHERE 1=1\n	AND DATMOD > (TO_DATE('"+ ((String)globalMap.get("P_VAR_DATE_DERN_EXEC")) + "','DD/MM/YYYY HH24:MI:SS') - 5/1440)\n";
			
                log.info("tOracleInput_3 - Executing the query: '"+dbquery_tOracleInput_3+"'.");
			

                       globalMap.put("tOracleInput_3_QUERY",dbquery_tOracleInput_3);

		    java.sql.ResultSet rs_tOracleInput_3 = null;
		try{
		    rs_tOracleInput_3 = stmt_tOracleInput_3.executeQuery(dbquery_tOracleInput_3);
		    java.sql.ResultSetMetaData rsmd_tOracleInput_3 = rs_tOracleInput_3.getMetaData();
		    int colQtyInRs_tOracleInput_3 = rsmd_tOracleInput_3.getColumnCount();

		    String tmpContent_tOracleInput_3 = null;
		    
		    
		    	log.info("tOracleInput_3 - Retrieving records from the database.");
		    
		    while (rs_tOracleInput_3.next()) {
		        nb_line_tOracleInput_3++;
		        
							if(colQtyInRs_tOracleInput_3 < 1) {
								row1.CODMAGUR_CONTACT = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(1) != null) {
						row1.CODMAGUR_CONTACT = rs_tOracleInput_3.getBigDecimal(1);
					} else {
				
						row1.CODMAGUR_CONTACT = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 2) {
								row1.MAG_CONTACT = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(2);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.MAG_CONTACT = tmpContent_tOracleInput_3;
			        } else {
			            row1.MAG_CONTACT = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 3) {
								row1.CODTPSCDE = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(3) != null) {
						row1.CODTPSCDE = rs_tOracleInput_3.getBigDecimal(3);
					} else {
				
						row1.CODTPSCDE = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 4) {
								row1.CREATION_TIME = null;
							} else {
										
					if(rs_tOracleInput_3.getTimestamp(4) != null) {
					    row1.CREATION_TIME = new java.util.Date(rs_tOracleInput_3.getTimestamp(4).getTime());
					} else {
					    row1.CREATION_TIME =  null;
					}
				
		                    }
							if(colQtyInRs_tOracleInput_3 < 5) {
								row1.NO_CMDE = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(5);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.NO_CMDE = tmpContent_tOracleInput_3;
			        } else {
			            row1.NO_CMDE = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 6) {
								row1.NO_CAISSE = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(6) != null) {
						row1.NO_CAISSE = rs_tOracleInput_3.getBigDecimal(6);
					} else {
				
						row1.NO_CAISSE = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 7) {
								row1.NO_LIGNE = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(7) != null) {
						row1.NO_LIGNE = rs_tOracleInput_3.getBigDecimal(7);
					} else {
				
						row1.NO_LIGNE = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 8) {
								row1.CODINTART = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(8) != null) {
						row1.CODINTART = rs_tOracleInput_3.getBigDecimal(8);
					} else {
				
						row1.CODINTART = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 9) {
								row1.CUST_ID = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(9);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.CUST_ID = tmpContent_tOracleInput_3;
			        } else {
			            row1.CUST_ID = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 10) {
								row1.QUANTITE = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(10) != null) {
						row1.QUANTITE = rs_tOracleInput_3.getBigDecimal(10);
					} else {
				
						row1.QUANTITE = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 11) {
								row1.PV_TTC = null;
							} else {
		                          
					if(rs_tOracleInput_3.getObject(11) != null) {
						row1.PV_TTC = rs_tOracleInput_3.getBigDecimal(11);
					} else {
				
						row1.PV_TTC = null;
					}
		                    }
							if(colQtyInRs_tOracleInput_3 < 12) {
								row1.DEVISE = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(12);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.DEVISE = tmpContent_tOracleInput_3;
			        } else {
			            row1.DEVISE = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 13) {
								row1.ANNULE = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(13);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.ANNULE = tmpContent_tOracleInput_3;
			        } else {
			            row1.ANNULE = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 14) {
								row1.TYPE_PREPA = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(14);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.TYPE_PREPA = tmpContent_tOracleInput_3;
			        } else {
			            row1.TYPE_PREPA = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 15) {
								row1.MAG_PREPA = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(15);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.MAG_PREPA = tmpContent_tOracleInput_3;
			        } else {
			            row1.MAG_PREPA = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 16) {
								row1.TYPE_LIVRAISON = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(16);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.TYPE_LIVRAISON = tmpContent_tOracleInput_3;
			        } else {
			            row1.TYPE_LIVRAISON = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 17) {
								row1.MAG_DISTRIB = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(17);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.MAG_DISTRIB = tmpContent_tOracleInput_3;
			        } else {
			            row1.MAG_DISTRIB = null;
			        }
		                    }
							if(colQtyInRs_tOracleInput_3 < 18) {
								row1.DATMOD = null;
							} else {
										
					if(rs_tOracleInput_3.getTimestamp(18) != null) {
					    row1.DATMOD = new java.util.Date(rs_tOracleInput_3.getTimestamp(18).getTime());
					} else {
					    row1.DATMOD =  null;
					}
				
		                    }
							if(colQtyInRs_tOracleInput_3 < 19) {
								row1.STATUT = null;
							} else {
	                         		
			 	    tmpContent_tOracleInput_3 = rs_tOracleInput_3.getString(19);
			        if(tmpContent_tOracleInput_3 != null) {
			            row1.STATUT = tmpContent_tOracleInput_3;
			        } else {
			            row1.STATUT = null;
			        }
		                    }
					
						log.debug("tOracleInput_3 - Retrieving the record " + nb_line_tOracleInput_3 + ".");
					




 



/**
 * [tOracleInput_3 begin ] stop
 */
	
	/**
	 * [tOracleInput_3 main ] start
	 */

	

	
	
	currentComponent="tOracleInput_3";

	

 


	tos_count_tOracleInput_3++;

/**
 * [tOracleInput_3 main ] stop
 */

	
	/**
	 * [tSybaseOutputBulk_1 main ] start
	 */

	

	
	
	currentComponent="tSybaseOutputBulk_1";

	
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

    				
	    				if(row1.CODMAGUR_CONTACT != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.CODMAGUR_CONTACT)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.MAG_CONTACT != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.MAG_CONTACT
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.CODTPSCDE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.CODTPSCDE)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.CREATION_TIME != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								FormatterUtils.format_Date(row1.CREATION_TIME, "yyyy-MM-dd HH:mm:ss")
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.NO_CMDE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.NO_CMDE
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.NO_CAISSE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.NO_CAISSE)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.NO_LIGNE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.NO_LIGNE)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.CODINTART != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.CODINTART)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.CUST_ID != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.CUST_ID
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.QUANTITE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.QUANTITE)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.PV_TTC != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								String.valueOf(row1.PV_TTC)
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.DEVISE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.DEVISE
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.ANNULE != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.ANNULE
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.TYPE_PREPA != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.TYPE_PREPA
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.MAG_PREPA != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.MAG_PREPA
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.TYPE_LIVRAISON != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.TYPE_LIVRAISON
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.MAG_DISTRIB != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.MAG_DISTRIB
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.DATMOD != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								FormatterUtils.format_Date(row1.DATMOD, "yyyy-MM-dd HH:mm:ss")
							);
	    				} 
										
							outtSybaseOutputBulk_1.write(OUT_DELIM_tSybaseOutputBulk_1);   				
	    				if(row1.STATUT != null) {
    				
    						outtSybaseOutputBulk_1.write(
    				
								row1.STATUT
							);
	    				} 
					
    			outtSybaseOutputBulk_1.write(OUT_DELIM_ROWSEP_tSybaseOutputBulk_1);
    			nb_line_tSybaseOutputBulk_1++;
    			
    				log.debug("tSybaseOutputBulk_1 - Writing the record " + nb_line_tSybaseOutputBulk_1 + ".");
    			

 


	tos_count_tSybaseOutputBulk_1++;

/**
 * [tSybaseOutputBulk_1 main ] stop
 */



	
	/**
	 * [tOracleInput_3 end ] start
	 */

	

	
	
	currentComponent="tOracleInput_3";

	

}
}finally{
stmt_tOracleInput_3.close();

}

globalMap.put("tOracleInput_3_NB_LINE",nb_line_tOracleInput_3);
	    		log.info("tOracleInput_3 - Retrieved records count: "+nb_line_tOracleInput_3 + " .");
			
 
                if(log.isInfoEnabled())
            log.info("tOracleInput_3 - "  + "Done." );

ok_Hash.put("tOracleInput_3", true);
end_Hash.put("tOracleInput_3", System.currentTimeMillis());




/**
 * [tOracleInput_3 end ] stop
 */

	
	/**
	 * [tSybaseOutputBulk_1 end ] start
	 */

	

	
	
	currentComponent="tSybaseOutputBulk_1";

	

	outtSybaseOutputBulk_1.close();
	resourceMap.put("finish_tSybaseOutputBulk_1", true); 
	globalMap.put("tSybaseOutputBulk_1_NB_LINE",nb_line_tSybaseOutputBulk_1);

	
				log.info("tSybaseOutputBulk_1 - Written records count: " + nb_line_tSybaseOutputBulk_1 + " .");
			

 
                if(log.isInfoEnabled())
            log.info("tSybaseOutputBulk_1 - "  + "Done." );

ok_Hash.put("tSybaseOutputBulk_1", true);
end_Hash.put("tSybaseOutputBulk_1", System.currentTimeMillis());

				tSybaseIQBulkExec_1Process(globalMap);



/**
 * [tSybaseOutputBulk_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tOracleInput_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tOracleRow_1Process(globalMap); 
						



	
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
	 * [tOracleInput_3 finally ] start
	 */

	

	
	
	currentComponent="tOracleInput_3";

	

 



/**
 * [tOracleInput_3 finally ] stop
 */

	
	/**
	 * [tSybaseOutputBulk_1 finally ] start
	 */

	

	
	
	currentComponent="tSybaseOutputBulk_1";

	
	if(resourceMap.get("finish_tSybaseOutputBulk_1") == null){
		if(resourceMap.get("outtSybaseOutputBulk_1") != null){
			((java.io.BufferedWriter)resourceMap.get("outtSybaseOutputBulk_1")).close();
		}
	}

 



/**
 * [tSybaseOutputBulk_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tOracleInput_3_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseIQBulkExec_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseIQBulkExec_1_SUBPROCESS_STATE", 0);

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
	 * [tSybaseIQBulkExec_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseIQBulkExec_1", false);
		start_Hash.put("tSybaseIQBulkExec_1", System.currentTimeMillis());
		
	
	currentComponent="tSybaseIQBulkExec_1";

	
		int tos_count_tSybaseIQBulkExec_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseIQBulkExec_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseIQBulkExec_1 = new StringBuilder();
            log4jParamters_tSybaseIQBulkExec_1.append("Parameters:");
                    log4jParamters_tSybaseIQBulkExec_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("CONNECTION" + " = " + "tSybaseConnection_2");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("TABLE" + " = " + "\"TMP_BI_FAICDE_OMNI\"");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("TABLE_ACTION" + " = " + "DROP_IF_EXISTS_AND_CREATE");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("FILENAME" + " = " + "context.P_VAR_DEC_DIR + \"/\" + jobName + \"/BULK/BI_FAICDE_OMNI.bcp\"");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("USE_INSERT_LOCATION_SYNTAX" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("LINES_TERMINATED_BY" + " = " + "\"#²\"");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("FIELDS_TERMINATED_BY" + " = " + "\"|\"");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("ENCLOSED" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("FIXED_LENGTH" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_1.append("INCLUDEHEADER" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseIQBulkExec_1 - "  + log4jParamters_tSybaseIQBulkExec_1 );


	java.sql.Connection conn_tSybaseIQBulkExec_1 = (java.sql.Connection)globalMap.get("conn_tSybaseConnection_2");
	String dbschema_tSybaseIQBulkExec_1= (String)globalMap.get("dbschema_tSybaseConnection_2");
	String dbUser_tSybaseIQBulkExec_1 = (String)globalMap.get("user_tSybaseConnection_2");
				if(conn_tSybaseIQBulkExec_1 != null) {
					if(conn_tSybaseIQBulkExec_1.getMetaData() != null) {
						
						log.info("tSybaseIQBulkExec_1 - Uses an existing connection with username '" + conn_tSybaseIQBulkExec_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tSybaseIQBulkExec_1.getMetaData().getURL() + ".");
						
					}
				}
			

	String tableName_tSybaseIQBulkExec_1 = dbUser_tSybaseIQBulkExec_1 + "." + "TMP_BI_FAICDE_OMNI";
	if(dbschema_tSybaseIQBulkExec_1 != null && dbschema_tSybaseIQBulkExec_1.trim().length() != 0) {
		tableName_tSybaseIQBulkExec_1 = dbschema_tSybaseIQBulkExec_1 + "." + "TMP_BI_FAICDE_OMNI";
	}
int deletedCount_tSybaseIQBulkExec_1 = 0;
				java.sql.DatabaseMetaData dbMetaData_tSybaseIQBulkExec_1 = conn_tSybaseIQBulkExec_1.getMetaData();
				java.sql.ResultSet rsTable_tSybaseIQBulkExec_1 = dbMetaData_tSybaseIQBulkExec_1.getTables(null, null, null, new String[]{"TABLE"});
				boolean whetherExist_tSybaseIQBulkExec_1 = false;
				while(rsTable_tSybaseIQBulkExec_1.next()) {
					String table_tSybaseIQBulkExec_1 = rsTable_tSybaseIQBulkExec_1.getString("TABLE_NAME");
					String schema_tSybaseIQBulkExec_1 = rsTable_tSybaseIQBulkExec_1.getString("TABLE_SCHEM");
					if(table_tSybaseIQBulkExec_1.equalsIgnoreCase("TMP_BI_FAICDE_OMNI")
						&& (schema_tSybaseIQBulkExec_1.equalsIgnoreCase(dbschema_tSybaseIQBulkExec_1) || dbschema_tSybaseIQBulkExec_1.trim().length() ==0)) {
						whetherExist_tSybaseIQBulkExec_1 = true;
						break;
					}
				}
				rsTable_tSybaseIQBulkExec_1.close();
			
				if(whetherExist_tSybaseIQBulkExec_1) {
					java.sql.Statement stmtDrop_tSybaseIQBulkExec_1 = conn_tSybaseIQBulkExec_1.createStatement();
					
						log.info("tSybaseIQBulkExec_1 - Droping table " + tableName_tSybaseIQBulkExec_1 + ".");
					
					stmtDrop_tSybaseIQBulkExec_1.execute("DROP TABLE " + tableName_tSybaseIQBulkExec_1 + "");
					
						log.info("tSybaseIQBulkExec_1 - Drop table " + tableName_tSybaseIQBulkExec_1 + " has succeeded.");
					
					stmtDrop_tSybaseIQBulkExec_1.close();
				}
				java.sql.Statement stmtCreate_tSybaseIQBulkExec_1 = conn_tSybaseIQBulkExec_1.createStatement();
				
					log.info("tSybaseIQBulkExec_1 - Creating table " + tableName_tSybaseIQBulkExec_1 + "." );
				
				stmtCreate_tSybaseIQBulkExec_1.execute("CREATE TABLE " + tableName_tSybaseIQBulkExec_1 + "(CODMAGUR_CONTACT DECIMAL(30,0)   null ,MAG_CONTACT VARCHAR(64)   null ,CODTPSCDE DECIMAL(30,0)   null ,CREATION_TIME DATE  null ,NO_CMDE VARCHAR(25)   null ,NO_CAISSE DECIMAL(30,0)   null ,NO_LIGNE DECIMAL(30,0)   null ,CODINTART DECIMAL(30,0)   null ,CUST_ID VARCHAR(32)   null ,QUANTITE DECIMAL(30,0)   null ,PV_TTC DECIMAL(30,0)   null ,DEVISE VARCHAR(5)   null ,ANNULE VARCHAR(1)   null ,TYPE_PREPA VARCHAR(1)   null ,MAG_PREPA VARCHAR(64)   null ,TYPE_LIVRAISON VARCHAR(18)   null ,MAG_DISTRIB VARCHAR(64)   null ,DATMOD DATE  null ,STATUT VARCHAR(40)   null )");
				
					log.info("tSybaseIQBulkExec_1 - Create table " + tableName_tSybaseIQBulkExec_1 + " has succeeded.");
				
				stmtCreate_tSybaseIQBulkExec_1.close();
			
		//in mysql when autoCommit=true don't commit.
		if (! conn_tSybaseIQBulkExec_1.getAutoCommit()) {
			conn_tSybaseIQBulkExec_1.commit();
		}
	

		StringBuilder loadingCols_tSybaseIQBulkExec_1 = new StringBuilder();
    	loadingCols_tSybaseIQBulkExec_1.append("(");
        loadingCols_tSybaseIQBulkExec_1.append("CODMAGUR_CONTACT" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("MAG_CONTACT" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("CODTPSCDE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("CREATION_TIME" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("NO_CMDE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("NO_CAISSE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("NO_LIGNE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("CODINTART" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("CUST_ID" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("QUANTITE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("PV_TTC" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("DEVISE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("ANNULE" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("TYPE_PREPA" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("MAG_PREPA" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("TYPE_LIVRAISON" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("MAG_DISTRIB" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("DATMOD" + " ");
        loadingCols_tSybaseIQBulkExec_1.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_1.append("STATUT" + " ");
        	loadingCols_tSybaseIQBulkExec_1.append("'" + "#²" + "'");
    loadingCols_tSybaseIQBulkExec_1.append(")");

    java.sql.Statement stmt_tSybaseIQBulkExec_1=conn_tSybaseIQBulkExec_1.createStatement();
    stmt_tSybaseIQBulkExec_1.execute("SET TEMPORARY OPTION ESCAPE_CHARACTER='ON'");

    //stmt_tSybaseIQBulkExec_1.execute("SET TEMPORARY OPTION ALLOW_READ_CLIENT_FILE='ON'");//sybaseIQ 15 whether is set?

    String strSQL_tSybaseIQBulkExec_1 = "LOAD TABLE " + tableName_tSybaseIQBulkExec_1 + loadingCols_tSybaseIQBulkExec_1.toString() ;
		strSQL_tSybaseIQBulkExec_1 +=" from '" + context.P_VAR_DEC_DIR + "/" + jobName + "/BULK/BI_FAICDE_OMNI.bcp" + "' ";

	strSQL_tSybaseIQBulkExec_1=strSQL_tSybaseIQBulkExec_1 + " quotes off ";
    strSQL_tSybaseIQBulkExec_1 =strSQL_tSybaseIQBulkExec_1 + " escapes off ";

		log.info("tSybaseIQBulkExec_1 - Bulk load SQL:"+strSQL_tSybaseIQBulkExec_1+".");
		log.info("tSybaseIQBulkExec_1 - Bulk loading data into " + tableName_tSybaseIQBulkExec_1 + "." );
	

    stmt_tSybaseIQBulkExec_1.execute(strSQL_tSybaseIQBulkExec_1);

	    		log.info("tSybaseIQBulkExec_1 - Bulk load has finished.");
			

 



/**
 * [tSybaseIQBulkExec_1 begin ] stop
 */
	
	/**
	 * [tSybaseIQBulkExec_1 main ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_1";

	

 


	tos_count_tSybaseIQBulkExec_1++;

/**
 * [tSybaseIQBulkExec_1 main ] stop
 */
	
	/**
	 * [tSybaseIQBulkExec_1 end ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_1";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseIQBulkExec_1 - "  + "Done." );

ok_Hash.put("tSybaseIQBulkExec_1", true);
end_Hash.put("tSybaseIQBulkExec_1", System.currentTimeMillis());

				tSybaseRow_1Process(globalMap);



/**
 * [tSybaseIQBulkExec_1 end ] stop
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
	 * [tSybaseIQBulkExec_1 finally ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_1";

	

 



/**
 * [tSybaseIQBulkExec_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseIQBulkExec_1_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseRow_1_SUBPROCESS_STATE", 0);

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
	 * [tSybaseRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseRow_1", false);
		start_Hash.put("tSybaseRow_1", System.currentTimeMillis());
		
	
	currentComponent="tSybaseRow_1";

	
		int tos_count_tSybaseRow_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseRow_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseRow_1 = new StringBuilder();
            log4jParamters_tSybaseRow_1.append("Parameters:");
                    log4jParamters_tSybaseRow_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("CONNECTION" + " = " + "tSybaseConnection_2");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("IDENTITY_INSERT" + " = " + "false");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("QUERY" + " = " + "\"  DELETE FROM \"+context.SYBASE_DEC_Schema+\".BI_FAICDE_OMNI BF  WHERE 1=1  	AND EXISTS (  		SELECT  			1  		FROM \"+context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema+\".TMP_BI_FAICDE_OMNI TMP  		WHERE 1=1  				AND BF.CODMAGUR_CONTACT = TMP.CODMAGUR_CONTACT  				AND BF.CODTPSCDE = TMP.CODTPSCDE  				AND BF.NO_CMDE = TMP.NO_CMDE  	)  \"");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("DIE_ON_ERROR" + " = " + "true");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("PROPAGATE_RECORD_SET" + " = " + "false");
                log4jParamters_tSybaseRow_1.append(" | ");
                    log4jParamters_tSybaseRow_1.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                log4jParamters_tSybaseRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseRow_1 - "  + log4jParamters_tSybaseRow_1 );

	java.sql.Connection conn_tSybaseRow_1 = null;
	String query_tSybaseRow_1 = "";
	boolean whetherReject_tSybaseRow_1 = false;
				conn_tSybaseRow_1 = (java.sql.Connection)globalMap.get("conn_tSybaseConnection_2");
			
				if(conn_tSybaseRow_1 != null) {
					if(conn_tSybaseRow_1.getMetaData() != null) {
						
						log.info("tSybaseRow_1 - Uses an existing connection with username '" + conn_tSybaseRow_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tSybaseRow_1.getMetaData().getURL() + ".");
						
					}
				}
			
		java.sql.Statement stmt_tSybaseRow_1 = conn_tSybaseRow_1.createStatement();
	


 



/**
 * [tSybaseRow_1 begin ] stop
 */
	
	/**
	 * [tSybaseRow_1 main ] start
	 */

	

	
	
	currentComponent="tSybaseRow_1";

	

	    		log.info("tSybaseRow_1 - Executing the query: '" + "  DELETE FROM "+context.SYBASE_DEC_Schema+".BI_FAICDE_OMNI BF  WHERE 1=1  	AND EXISTS (  		SELECT  			1  		FROM "+context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema+".TMP_BI_FAICDE_OMNI TMP  		WHERE 1=1  				AND BF.CODMAGUR_CONTACT = TMP.CODMAGUR_CONTACT  				AND BF.CODTPSCDE = TMP.CODTPSCDE  				AND BF.NO_CMDE = TMP.NO_CMDE  	)  " + "'.");
			
query_tSybaseRow_1 = "\nDELETE FROM "+context.SYBASE_DEC_Schema+".BI_FAICDE_OMNI BF\nWHERE 1=1\n	AND EXISTS (\n		SELECT\n			1\n		FROM "+context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema+".TMP_BI_FAICDE_OMNI TMP\n		WHERE 1=1\n				AND BF.CODMAGUR_CONTACT = TMP.CODMAGUR_CONTACT\n				AND BF.CODTPSCDE = TMP.CODTPSCDE\n				AND BF.NO_CMDE = TMP.NO_CMDE\n	)\n";
whetherReject_tSybaseRow_1 = false;
globalMap.put("tSybaseRow_1_QUERY",query_tSybaseRow_1);
try {
		stmt_tSybaseRow_1.execute(query_tSybaseRow_1);
		
	    		log.info("tSybaseRow_1 - Execute the query: '" + "\nDELETE FROM "+context.SYBASE_DEC_Schema+".BI_FAICDE_OMNI BF\nWHERE 1=1\n	AND EXISTS (\n		SELECT\n			1\n		FROM "+context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema+".TMP_BI_FAICDE_OMNI TMP\n		WHERE 1=1\n				AND BF.CODMAGUR_CONTACT = TMP.CODMAGUR_CONTACT\n				AND BF.CODTPSCDE = TMP.CODTPSCDE\n				AND BF.NO_CMDE = TMP.NO_CMDE\n	)\n" + "' has finished.");
			
	} catch (java.lang.Exception e) {
		whetherReject_tSybaseRow_1 = true;
		
			throw(e);
			
	}
	
	if(!whetherReject_tSybaseRow_1) {
		
	}
	

 


	tos_count_tSybaseRow_1++;

/**
 * [tSybaseRow_1 main ] stop
 */
	
	/**
	 * [tSybaseRow_1 end ] start
	 */

	

	
	
	currentComponent="tSybaseRow_1";

	

	
	stmt_tSybaseRow_1.close();	

 
                if(log.isInfoEnabled())
            log.info("tSybaseRow_1 - "  + "Done." );

ok_Hash.put("tSybaseRow_1", true);
end_Hash.put("tSybaseRow_1", System.currentTimeMillis());

				tSybaseIQBulkExec_2Process(globalMap);



/**
 * [tSybaseRow_1 end ] stop
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
	 * [tSybaseRow_1 finally ] start
	 */

	

	
	
	currentComponent="tSybaseRow_1";

	

 



/**
 * [tSybaseRow_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseRow_1_SUBPROCESS_STATE", 1);
	}
	

public void tSybaseIQBulkExec_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSybaseIQBulkExec_2_SUBPROCESS_STATE", 0);

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
	 * [tSybaseIQBulkExec_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSybaseIQBulkExec_2", false);
		start_Hash.put("tSybaseIQBulkExec_2", System.currentTimeMillis());
		
	
	currentComponent="tSybaseIQBulkExec_2";

	
		int tos_count_tSybaseIQBulkExec_2 = 0;
		
                if(log.isInfoEnabled())
            log.info("tSybaseIQBulkExec_2 - "  + "Start to work." );
            StringBuilder log4jParamters_tSybaseIQBulkExec_2 = new StringBuilder();
            log4jParamters_tSybaseIQBulkExec_2.append("Parameters:");
                    log4jParamters_tSybaseIQBulkExec_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("CONNECTION" + " = " + "tSybaseConnection_1");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("TABLE" + " = " + "\"BI_FAICDE_OMNI\"");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("TABLE_ACTION" + " = " + "NONE");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("FILENAME" + " = " + "context.P_VAR_DEC_DIR + \"/\" + jobName + \"/BULK/BI_FAICDE_OMNI.bcp\"");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("USE_INSERT_LOCATION_SYNTAX" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("LINES_TERMINATED_BY" + " = " + "\"#²\"");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("FIELDS_TERMINATED_BY" + " = " + "\"|\"");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("ENCLOSED" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("FIXED_LENGTH" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                    log4jParamters_tSybaseIQBulkExec_2.append("INCLUDEHEADER" + " = " + "false");
                log4jParamters_tSybaseIQBulkExec_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSybaseIQBulkExec_2 - "  + log4jParamters_tSybaseIQBulkExec_2 );


	java.sql.Connection conn_tSybaseIQBulkExec_2 = (java.sql.Connection)globalMap.get("conn_tSybaseConnection_1");
	String dbschema_tSybaseIQBulkExec_2= (String)globalMap.get("dbschema_tSybaseConnection_1");
	String dbUser_tSybaseIQBulkExec_2 = (String)globalMap.get("user_tSybaseConnection_1");
				if(conn_tSybaseIQBulkExec_2 != null) {
					if(conn_tSybaseIQBulkExec_2.getMetaData() != null) {
						
						log.info("tSybaseIQBulkExec_2 - Uses an existing connection with username '" + conn_tSybaseIQBulkExec_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tSybaseIQBulkExec_2.getMetaData().getURL() + ".");
						
					}
				}
			

	String tableName_tSybaseIQBulkExec_2 = dbUser_tSybaseIQBulkExec_2 + "." + "BI_FAICDE_OMNI";
	if(dbschema_tSybaseIQBulkExec_2 != null && dbschema_tSybaseIQBulkExec_2.trim().length() != 0) {
		tableName_tSybaseIQBulkExec_2 = dbschema_tSybaseIQBulkExec_2 + "." + "BI_FAICDE_OMNI";
	}
int deletedCount_tSybaseIQBulkExec_2 = 0;

		StringBuilder loadingCols_tSybaseIQBulkExec_2 = new StringBuilder();
    	loadingCols_tSybaseIQBulkExec_2.append("(");
        loadingCols_tSybaseIQBulkExec_2.append("CODMAGUR_CONTACT" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("MAG_CONTACT" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("CODTPSCDE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("CREATION_TIME" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("NO_CMDE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("NO_CAISSE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("NO_LIGNE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("CODINTART" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("CUST_ID" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("QUANTITE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("PV_TTC" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("DEVISE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("ANNULE" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("TYPE_PREPA" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("MAG_PREPA" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("TYPE_LIVRAISON" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("MAG_DISTRIB" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("DATMOD" + " ");
        loadingCols_tSybaseIQBulkExec_2.append("'" + "|" + "'" + ",");
        loadingCols_tSybaseIQBulkExec_2.append("STATUT" + " ");
        	loadingCols_tSybaseIQBulkExec_2.append("'" + "#²" + "'");
    loadingCols_tSybaseIQBulkExec_2.append(")");

    java.sql.Statement stmt_tSybaseIQBulkExec_2=conn_tSybaseIQBulkExec_2.createStatement();
    stmt_tSybaseIQBulkExec_2.execute("SET TEMPORARY OPTION ESCAPE_CHARACTER='ON'");

    //stmt_tSybaseIQBulkExec_2.execute("SET TEMPORARY OPTION ALLOW_READ_CLIENT_FILE='ON'");//sybaseIQ 15 whether is set?

    String strSQL_tSybaseIQBulkExec_2 = "LOAD TABLE " + tableName_tSybaseIQBulkExec_2 + loadingCols_tSybaseIQBulkExec_2.toString() ;
		strSQL_tSybaseIQBulkExec_2 +=" from '" + context.P_VAR_DEC_DIR + "/" + jobName + "/BULK/BI_FAICDE_OMNI.bcp" + "' ";

	strSQL_tSybaseIQBulkExec_2=strSQL_tSybaseIQBulkExec_2 + " quotes off ";
    strSQL_tSybaseIQBulkExec_2 =strSQL_tSybaseIQBulkExec_2 + " escapes off ";

		log.info("tSybaseIQBulkExec_2 - Bulk load SQL:"+strSQL_tSybaseIQBulkExec_2+".");
		log.info("tSybaseIQBulkExec_2 - Bulk loading data into " + tableName_tSybaseIQBulkExec_2 + "." );
	

    stmt_tSybaseIQBulkExec_2.execute(strSQL_tSybaseIQBulkExec_2);

	    		log.info("tSybaseIQBulkExec_2 - Bulk load has finished.");
			

 



/**
 * [tSybaseIQBulkExec_2 begin ] stop
 */
	
	/**
	 * [tSybaseIQBulkExec_2 main ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_2";

	

 


	tos_count_tSybaseIQBulkExec_2++;

/**
 * [tSybaseIQBulkExec_2 main ] stop
 */
	
	/**
	 * [tSybaseIQBulkExec_2 end ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_2";

	

 
                if(log.isInfoEnabled())
            log.info("tSybaseIQBulkExec_2 - "  + "Done." );

ok_Hash.put("tSybaseIQBulkExec_2", true);
end_Hash.put("tSybaseIQBulkExec_2", System.currentTimeMillis());




/**
 * [tSybaseIQBulkExec_2 end ] stop
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
	 * [tSybaseIQBulkExec_2 finally ] start
	 */

	

	
	
	currentComponent="tSybaseIQBulkExec_2";

	

 



/**
 * [tSybaseIQBulkExec_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSybaseIQBulkExec_2_SUBPROCESS_STATE", 1);
	}
	

public void tOracleRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tOracleRow_1_SUBPROCESS_STATE", 0);

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
	 * [tOracleRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tOracleRow_1", false);
		start_Hash.put("tOracleRow_1", System.currentTimeMillis());
		
	
	currentComponent="tOracleRow_1";

	
		int tos_count_tOracleRow_1 = 0;
		
                if(log.isInfoEnabled())
            log.info("tOracleRow_1 - "  + "Start to work." );
            StringBuilder log4jParamters_tOracleRow_1 = new StringBuilder();
            log4jParamters_tOracleRow_1.append("Parameters:");
                    log4jParamters_tOracleRow_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("CONNECTION" + " = " + "tOracleConnection_1");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("QUERY" + " = " + "\"  UPDATE \"+context.ORACLE_ODS_Schema+\".PARAM_SCENAR  	SET VAL = '\"+((String)globalMap.get(\"P_VAR_DATE_EXEC\"))+\"'  WHERE 1=1  	AND SCE = '\"+jobName+\"'  	AND VAR = 'IDG_DATE_DER_EXEC'  \"");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("USE_NB_LINE" + " = " + "NB_LINE_UPDATED");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("DIE_ON_ERROR" + " = " + "true");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("PROPAGATE_RECORD_SET" + " = " + "false");
                log4jParamters_tOracleRow_1.append(" | ");
                    log4jParamters_tOracleRow_1.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                log4jParamters_tOracleRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tOracleRow_1 - "  + log4jParamters_tOracleRow_1 );

	java.sql.Connection conn_tOracleRow_1 = null;
	String query_tOracleRow_1 = "";
	boolean whetherReject_tOracleRow_1 = false;
				conn_tOracleRow_1 = (java.sql.Connection)globalMap.get("conn_tOracleConnection_1");
			
				if(conn_tOracleRow_1 != null) {
					if(conn_tOracleRow_1.getMetaData() != null) {
						
						log.info("tOracleRow_1 - Uses an existing connection with username '" + conn_tOracleRow_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tOracleRow_1.getMetaData().getURL() + ".");
						
					}
				}
			
		java.sql.Statement stmt_tOracleRow_1 = conn_tOracleRow_1.createStatement();
	
				int nb_line_update_tOracleRow_1 = 0;
			

 



/**
 * [tOracleRow_1 begin ] stop
 */
	
	/**
	 * [tOracleRow_1 main ] start
	 */

	

	
	
	currentComponent="tOracleRow_1";

	

	    		log.info("tOracleRow_1 - Executing the query: '" + "  UPDATE "+context.ORACLE_ODS_Schema+".PARAM_SCENAR  	SET VAL = '"+((String)globalMap.get("P_VAR_DATE_EXEC"))+"'  WHERE 1=1  	AND SCE = '"+jobName+"'  	AND VAR = 'IDG_DATE_DER_EXEC'  " + "'.");
			
query_tOracleRow_1 = "\nUPDATE "+context.ORACLE_ODS_Schema+".PARAM_SCENAR\n	SET VAL = '"+((String)globalMap.get("P_VAR_DATE_EXEC"))+"'\nWHERE 1=1\n	AND SCE = '"+jobName+"'\n	AND VAR = 'IDG_DATE_DER_EXEC'\n";
whetherReject_tOracleRow_1 = false;
globalMap.put("tOracleRow_1_QUERY",query_tOracleRow_1);
try {
		stmt_tOracleRow_1.execute(query_tOracleRow_1);
		
	    		log.info("tOracleRow_1 - Execute the query: '" + "\nUPDATE "+context.ORACLE_ODS_Schema+".PARAM_SCENAR\n	SET VAL = '"+((String)globalMap.get("P_VAR_DATE_EXEC"))+"'\nWHERE 1=1\n	AND SCE = '"+jobName+"'\n	AND VAR = 'IDG_DATE_DER_EXEC'\n" + "' has finished.");
			
		nb_line_update_tOracleRow_1 += stmt_tOracleRow_1.getUpdateCount();
	} catch (java.lang.Exception e) {
		whetherReject_tOracleRow_1 = true;
		
			throw(e);
			
	}
	

 


	tos_count_tOracleRow_1++;

/**
 * [tOracleRow_1 main ] stop
 */
	
	/**
	 * [tOracleRow_1 end ] start
	 */

	

	
	
	currentComponent="tOracleRow_1";

	

	
	stmt_tOracleRow_1.close();	

	    		log.info("tOracleRow_1 - Has updated "+nb_line_update_tOracleRow_1+" records.");
			
    globalMap.put("tOracleRow_1_NB_LINE_UPDATED",nb_line_update_tOracleRow_1);
 
                if(log.isInfoEnabled())
            log.info("tOracleRow_1 - "  + "Done." );

ok_Hash.put("tOracleRow_1", true);
end_Hash.put("tOracleRow_1", System.currentTimeMillis());




/**
 * [tOracleRow_1 end ] stop
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
	 * [tOracleRow_1 finally ] start
	 */

	

	
	
	currentComponent="tOracleRow_1";

	

 



/**
 * [tOracleRow_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tOracleRow_1_SUBPROCESS_STATE", 1);
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
                    log4jParamters_tSetGlobalVar_1.append("VARIABLES" + " = " + "[{VALUE="+("TalendDate.getDate(\"DD/MM/CCYY hh:mm:ss\")")+", KEY="+("\"P_VAR_DATE_EXEC\"")+"}]");
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

	

globalMap.put("P_VAR_DATE_EXEC", TalendDate.getDate("DD/MM/CCYY hh:mm:ss"));

 


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




/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tSetGlobalVar_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
							tOracleInput_2Process(globalMap); 
						



	
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
        final IDG_DEC_ODS_OMNICANAL IDG_DEC_ODS_OMNICANALClass = new IDG_DEC_ODS_OMNICANAL();

        int exitCode = IDG_DEC_ODS_OMNICANALClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'IDG_DEC_ODS_OMNICANAL' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
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
        	log.info("TalendJob: 'IDG_DEC_ODS_OMNICANAL' - Start.");
    	

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
            java.io.InputStream inContext = IDG_DEC_ODS_OMNICANAL.class.getClassLoader().getResourceAsStream("idg_dec/idg_dec_ods_omnicanal_0_2/contexts/"+contextStr+".properties");
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
                context.ORACLE_ODS_AdditionalParams=(String) context.getProperty("ORACLE_ODS_AdditionalParams");
                context.ORACLE_ODS_Login=(String) context.getProperty("ORACLE_ODS_Login");
            		String pwd_ORACLE_ODS_Password_value = context.getProperty("ORACLE_ODS_Password");
            		context.ORACLE_ODS_Password = null;
            		if(pwd_ORACLE_ODS_Password_value!=null) {
            			if(context_param.containsKey("ORACLE_ODS_Password")) {//no need to decrypt if it come from program argument or parent job runtime
            				context.ORACLE_ODS_Password = pwd_ORACLE_ODS_Password_value;
            			} else if (!pwd_ORACLE_ODS_Password_value.isEmpty()) {
            				try {
            					context.ORACLE_ODS_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_ORACLE_ODS_Password_value);
            					context.put("ORACLE_ODS_Password",context.ORACLE_ODS_Password);
            				} catch (java.lang.RuntimeException e) {
            					//do nothing
            				}
            			}
            		}
                context.ORACLE_ODS_Port=(String) context.getProperty("ORACLE_ODS_Port");
                context.ORACLE_ODS_Schema=(String) context.getProperty("ORACLE_ODS_Schema");
                context.ORACLE_ODS_Server=(String) context.getProperty("ORACLE_ODS_Server");
                context.ORACLE_ODS_ServiceName=(String) context.getProperty("ORACLE_ODS_ServiceName");
                context.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams");
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Login=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Login");
            		String pwd_ORACLE_ODS_SRC_WORK_SCHEMA_Password_value = context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Password");
            		context.ORACLE_ODS_SRC_WORK_SCHEMA_Password = null;
            		if(pwd_ORACLE_ODS_SRC_WORK_SCHEMA_Password_value!=null) {
            			if(context_param.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Password")) {//no need to decrypt if it come from program argument or parent job runtime
            				context.ORACLE_ODS_SRC_WORK_SCHEMA_Password = pwd_ORACLE_ODS_SRC_WORK_SCHEMA_Password_value;
            			} else if (!pwd_ORACLE_ODS_SRC_WORK_SCHEMA_Password_value.isEmpty()) {
            				try {
            					context.ORACLE_ODS_SRC_WORK_SCHEMA_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_ORACLE_ODS_SRC_WORK_SCHEMA_Password_value);
            					context.put("ORACLE_ODS_SRC_WORK_SCHEMA_Password",context.ORACLE_ODS_SRC_WORK_SCHEMA_Password);
            				} catch (java.lang.RuntimeException e) {
            					//do nothing
            				}
            			}
            		}
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Port=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Port");
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Schema=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Schema");
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Server=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_Server");
                context.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName=(String) context.getProperty("ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName");
                context.SYBASE_DEC_AdditionalParams=(String) context.getProperty("SYBASE_DEC_AdditionalParams");
                context.SYBASE_DEC_Login=(String) context.getProperty("SYBASE_DEC_Login");
            		String pwd_SYBASE_DEC_Password_value = context.getProperty("SYBASE_DEC_Password");
            		context.SYBASE_DEC_Password = null;
            		if(pwd_SYBASE_DEC_Password_value!=null) {
            			if(context_param.containsKey("SYBASE_DEC_Password")) {//no need to decrypt if it come from program argument or parent job runtime
            				context.SYBASE_DEC_Password = pwd_SYBASE_DEC_Password_value;
            			} else if (!pwd_SYBASE_DEC_Password_value.isEmpty()) {
            				try {
            					context.SYBASE_DEC_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_SYBASE_DEC_Password_value);
            					context.put("SYBASE_DEC_Password",context.SYBASE_DEC_Password);
            				} catch (java.lang.RuntimeException e) {
            					//do nothing
            				}
            			}
            		}
                context.SYBASE_DEC_Port=(String) context.getProperty("SYBASE_DEC_Port");
                context.SYBASE_DEC_Schema=(String) context.getProperty("SYBASE_DEC_Schema");
                context.SYBASE_DEC_Server=(String) context.getProperty("SYBASE_DEC_Server");
                context.SYBASE_DEC_Sid=(String) context.getProperty("SYBASE_DEC_Sid");
                context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams");
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Login=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Login");
            		String pwd_SYBASE_DEC_SRC_WORK_SCHEMA_Password_value = context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Password");
            		context.SYBASE_DEC_SRC_WORK_SCHEMA_Password = null;
            		if(pwd_SYBASE_DEC_SRC_WORK_SCHEMA_Password_value!=null) {
            			if(context_param.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Password")) {//no need to decrypt if it come from program argument or parent job runtime
            				context.SYBASE_DEC_SRC_WORK_SCHEMA_Password = pwd_SYBASE_DEC_SRC_WORK_SCHEMA_Password_value;
            			} else if (!pwd_SYBASE_DEC_SRC_WORK_SCHEMA_Password_value.isEmpty()) {
            				try {
            					context.SYBASE_DEC_SRC_WORK_SCHEMA_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_SYBASE_DEC_SRC_WORK_SCHEMA_Password_value);
            					context.put("SYBASE_DEC_SRC_WORK_SCHEMA_Password",context.SYBASE_DEC_SRC_WORK_SCHEMA_Password);
            				} catch (java.lang.RuntimeException e) {
            					//do nothing
            				}
            			}
            		}
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Port=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Port");
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Schema");
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Server=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Server");
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid=(String) context.getProperty("SYBASE_DEC_SRC_WORK_SCHEMA_Sid");
                context.P_VAR_DEC_DIR=(String) context.getProperty("P_VAR_DEC_DIR");
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }


        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("contextDir")) {
                context.contextDir = (String) parentContextMap.get("contextDir");
            }if (parentContextMap.containsKey("ORACLE_ODS_AdditionalParams")) {
                context.ORACLE_ODS_AdditionalParams = (String) parentContextMap.get("ORACLE_ODS_AdditionalParams");
            }if (parentContextMap.containsKey("ORACLE_ODS_Login")) {
                context.ORACLE_ODS_Login = (String) parentContextMap.get("ORACLE_ODS_Login");
            }if (parentContextMap.containsKey("ORACLE_ODS_Password")) {
                context.ORACLE_ODS_Password = (java.lang.String) parentContextMap.get("ORACLE_ODS_Password");
            }if (parentContextMap.containsKey("ORACLE_ODS_Port")) {
                context.ORACLE_ODS_Port = (String) parentContextMap.get("ORACLE_ODS_Port");
            }if (parentContextMap.containsKey("ORACLE_ODS_Schema")) {
                context.ORACLE_ODS_Schema = (String) parentContextMap.get("ORACLE_ODS_Schema");
            }if (parentContextMap.containsKey("ORACLE_ODS_Server")) {
                context.ORACLE_ODS_Server = (String) parentContextMap.get("ORACLE_ODS_Server");
            }if (parentContextMap.containsKey("ORACLE_ODS_ServiceName")) {
                context.ORACLE_ODS_ServiceName = (String) parentContextMap.get("ORACLE_ODS_ServiceName");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_AdditionalParams");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Login")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Login = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_Login");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Password")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Password = (java.lang.String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_Password");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Port")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Port = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_Port");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Schema")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Schema = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_Schema");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_Server")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_Server = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_Server");
            }if (parentContextMap.containsKey("ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName")) {
                context.ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName = (String) parentContextMap.get("ORACLE_ODS_SRC_WORK_SCHEMA_ServiceName");
            }if (parentContextMap.containsKey("SYBASE_DEC_AdditionalParams")) {
                context.SYBASE_DEC_AdditionalParams = (String) parentContextMap.get("SYBASE_DEC_AdditionalParams");
            }if (parentContextMap.containsKey("SYBASE_DEC_Login")) {
                context.SYBASE_DEC_Login = (String) parentContextMap.get("SYBASE_DEC_Login");
            }if (parentContextMap.containsKey("SYBASE_DEC_Password")) {
                context.SYBASE_DEC_Password = (java.lang.String) parentContextMap.get("SYBASE_DEC_Password");
            }if (parentContextMap.containsKey("SYBASE_DEC_Port")) {
                context.SYBASE_DEC_Port = (String) parentContextMap.get("SYBASE_DEC_Port");
            }if (parentContextMap.containsKey("SYBASE_DEC_Schema")) {
                context.SYBASE_DEC_Schema = (String) parentContextMap.get("SYBASE_DEC_Schema");
            }if (parentContextMap.containsKey("SYBASE_DEC_Server")) {
                context.SYBASE_DEC_Server = (String) parentContextMap.get("SYBASE_DEC_Server");
            }if (parentContextMap.containsKey("SYBASE_DEC_Sid")) {
                context.SYBASE_DEC_Sid = (String) parentContextMap.get("SYBASE_DEC_Sid");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_AdditionalParams");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Login")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Login = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Login");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Password")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Password = (java.lang.String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Password");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Port")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Port = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Port");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Schema")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Schema = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Schema");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Server")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Server = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Server");
            }if (parentContextMap.containsKey("SYBASE_DEC_SRC_WORK_SCHEMA_Sid")) {
                context.SYBASE_DEC_SRC_WORK_SCHEMA_Sid = (String) parentContextMap.get("SYBASE_DEC_SRC_WORK_SCHEMA_Sid");
            }if (parentContextMap.containsKey("P_VAR_DEC_DIR")) {
                context.P_VAR_DEC_DIR = (String) parentContextMap.get("P_VAR_DEC_DIR");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("ORACLE_ODS_Password");
			parametersToEncrypt.add("ORACLE_ODS_SRC_WORK_SCHEMA_Password");
			parametersToEncrypt.add("SYBASE_DEC_Password");
			parametersToEncrypt.add("SYBASE_DEC_SRC_WORK_SCHEMA_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));




	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tSetGlobalVar_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tSetGlobalVar_1) {
globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", -1);

e_tSetGlobalVar_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : IDG_DEC_ODS_OMNICANAL");
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
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tOracleConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tSybaseConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tSybaseConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }

		









    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tOracleConnection_1", globalMap.get("conn_tOracleConnection_1"));
            connections.put("conn_tSybaseConnection_1", globalMap.get("conn_tSybaseConnection_1"));
            connections.put("conn_tSybaseConnection_2", globalMap.get("conn_tSybaseConnection_2"));






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
 *     233657 characters generated by Talend Data Services Platform 
 *     on the 8 septembre 2020 14:59:16 CEST
 ************************************************************************************************/