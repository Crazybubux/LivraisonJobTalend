/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public interface CustomerService extends javax.xml.rpc.Service {
    public java.lang.String getBasicHttpBinding_ICustomerServiceAddress();

    public routines.ICustomerService getBasicHttpBinding_ICustomerService() throws javax.xml.rpc.ServiceException;

    public routines.ICustomerService getBasicHttpBinding_ICustomerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}