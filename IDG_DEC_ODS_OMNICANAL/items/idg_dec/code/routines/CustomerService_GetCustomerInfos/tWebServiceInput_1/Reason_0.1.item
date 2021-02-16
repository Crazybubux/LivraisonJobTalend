/**
 * Reason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class Reason  implements java.io.Serializable {
    private java.lang.String idReasonDisabled;

    private java.lang.String reasonDisabled;

    public Reason() {
    }

    public Reason(
           java.lang.String idReasonDisabled,
           java.lang.String reasonDisabled) {
           this.idReasonDisabled = idReasonDisabled;
           this.reasonDisabled = reasonDisabled;
    }


    /**
     * Gets the idReasonDisabled value for this Reason.
     * 
     * @return idReasonDisabled
     */
    public java.lang.String getIdReasonDisabled() {
        return idReasonDisabled;
    }


    /**
     * Sets the idReasonDisabled value for this Reason.
     * 
     * @param idReasonDisabled
     */
    public void setIdReasonDisabled(java.lang.String idReasonDisabled) {
        this.idReasonDisabled = idReasonDisabled;
    }


    /**
     * Gets the reasonDisabled value for this Reason.
     * 
     * @return reasonDisabled
     */
    public java.lang.String getReasonDisabled() {
        return reasonDisabled;
    }


    /**
     * Sets the reasonDisabled value for this Reason.
     * 
     * @param reasonDisabled
     */
    public void setReasonDisabled(java.lang.String reasonDisabled) {
        this.reasonDisabled = reasonDisabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reason)) return false;
        Reason other = (Reason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idReasonDisabled==null && other.getIdReasonDisabled()==null) || 
             (this.idReasonDisabled!=null &&
              this.idReasonDisabled.equals(other.getIdReasonDisabled()))) &&
            ((this.reasonDisabled==null && other.getReasonDisabled()==null) || 
             (this.reasonDisabled!=null &&
              this.reasonDisabled.equals(other.getReasonDisabled())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdReasonDisabled() != null) {
            _hashCode += getIdReasonDisabled().hashCode();
        }
        if (getReasonDisabled() != null) {
            _hashCode += getReasonDisabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "Reason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReasonDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdReasonDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "ReasonDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
