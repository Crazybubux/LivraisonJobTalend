/**
 * ICustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public interface ICustomerService extends java.rmi.Remote {
    public routines.CustomerInfo getCustomerInfos(java.lang.String idMag, java.lang.Integer idType, java.lang.String idValue) throws java.rmi.RemoteException, routines.ServiceFaultList, routines.BusinessFault, routines.TechnicalFault;
    public void updateCustomerPoints(java.lang.String idMag, java.lang.String idTpv, java.lang.Integer idType, java.lang.String idValue, java.util.Calendar updatePointsDate, java.lang.String updatePointsTime, java.lang.Integer changeType, java.lang.Integer points, java.lang.String receiptNumber) throws java.rmi.RemoteException, routines.ServiceFaultList, routines.BusinessFault, routines.TechnicalFault;
    public routines.InfosIdentCustReturn addOrUpdateContact(java.lang.String idMag, java.lang.String cardNumber, java.lang.Integer idCust, java.lang.Integer idContact, java.util.Calendar refDate, java.lang.String refTime, java.lang.Boolean manageDynInfoInactive, routines.InfoCustGeneral infoCust, routines.InfoDyn[] listInfoDynCustomer, int[] listCustGroup, routines.InfoContactGeneral infoContact, routines.InfoDyn[] listInfoDynContact) throws java.rmi.RemoteException, routines.BusinessFault, routines.TechnicalFault;
    public void deleteContact(java.lang.String idMag, java.lang.Integer idContact) throws java.rmi.RemoteException, routines.BusinessFault, routines.TechnicalFault;
    public void addOrUpdateCard(java.lang.String idMag, java.lang.Integer idContact, java.lang.String cardNumber, java.util.Calendar refDateTime, java.util.Calendar beginValidityDate, java.util.Calendar endValidityDate) throws java.rmi.RemoteException, routines.BusinessFault, routines.TechnicalFault;
    public void deactivateCard(java.lang.String idMag, java.lang.String cardNumber, java.util.Calendar refDateTime, java.util.Calendar endValidityDate, java.lang.String idReasonDisabled) throws java.rmi.RemoteException, routines.BusinessFault, routines.TechnicalFault;
    public java.lang.String contactCardAttribute(java.lang.String idMag, java.lang.String idTpv) throws java.rmi.RemoteException, routines.BusinessFault, routines.TechnicalFault;
}
