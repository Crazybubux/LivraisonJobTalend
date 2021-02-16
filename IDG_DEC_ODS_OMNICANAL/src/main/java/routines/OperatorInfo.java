/**
 * OperatorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OperatorInfo  implements java.io.Serializable {
    private java.lang.String idOperatorDisabled;

    private java.lang.String nameOperatorDisabled;

    public OperatorInfo() {
    }

    public OperatorInfo(
           java.lang.String idOperatorDisabled,
           java.lang.String nameOperatorDisabled) {
           this.idOperatorDisabled = idOperatorDisabled;
           this.nameOperatorDisabled = nameOperatorDisabled;
    }


    /**
     * Gets the idOperatorDisabled value for this OperatorInfo.
     * 
     * @return idOperatorDisabled
     */
    public java.lang.String getIdOperatorDisabled() {
        return idOperatorDisabled;
    }


    /**
     * Sets the idOperatorDisabled value for this OperatorInfo.
     * 
     * @param idOperatorDisabled
     */
    public void setIdOperatorDisabled(java.lang.String idOperatorDisabled) {
        this.idOperatorDisabled = idOperatorDisabled;
    }


    /**
     * Gets the nameOperatorDisabled value for this OperatorInfo.
     * 
     * @return nameOperatorDisabled
     */
    public java.lang.String getNameOperatorDisabled() {
        return nameOperatorDisabled;
    }


    /**
     * Sets the nameOperatorDisabled value for this OperatorInfo.
     * 
     * @param nameOperatorDisabled
     */
    public void setNameOperatorDisabled(java.lang.String nameOperatorDisabled) {
        this.nameOperatorDisabled = nameOperatorDisabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatorInfo)) return false;
        OperatorInfo other = (OperatorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idOperatorDisabled==null && other.getIdOperatorDisabled()==null) || 
             (this.idOperatorDisabled!=null &&
              this.idOperatorDisabled.equals(other.getIdOperatorDisabled()))) &&
            ((this.nameOperatorDisabled==null && other.getNameOperatorDisabled()==null) || 
             (this.nameOperatorDisabled!=null &&
              this.nameOperatorDisabled.equals(other.getNameOperatorDisabled())));
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
        if (getIdOperatorDisabled() != null) {
            _hashCode += getIdOperatorDisabled().hashCode();
        }
        if (getNameOperatorDisabled() != null) {
            _hashCode += getNameOperatorDisabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "OperatorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOperatorDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdOperatorDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOperatorDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "NameOperatorDisabled"));
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
