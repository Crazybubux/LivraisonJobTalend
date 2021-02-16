/**
 * InactiveCardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class InactiveCardInfo  implements java.io.Serializable {
    private java.lang.String idStrDisabled;

    private routines.OperatorInfo operator;

    private routines.Reason reasonDisabled;

    private java.util.Calendar refDateDisabled;

    private java.lang.String refTimeDisabled;

    public InactiveCardInfo() {
    }

    public InactiveCardInfo(
           java.lang.String idStrDisabled,
           routines.OperatorInfo operator,
           routines.Reason reasonDisabled,
           java.util.Calendar refDateDisabled,
           java.lang.String refTimeDisabled) {
           this.idStrDisabled = idStrDisabled;
           this.operator = operator;
           this.reasonDisabled = reasonDisabled;
           this.refDateDisabled = refDateDisabled;
           this.refTimeDisabled = refTimeDisabled;
    }


    /**
     * Gets the idStrDisabled value for this InactiveCardInfo.
     * 
     * @return idStrDisabled
     */
    public java.lang.String getIdStrDisabled() {
        return idStrDisabled;
    }


    /**
     * Sets the idStrDisabled value for this InactiveCardInfo.
     * 
     * @param idStrDisabled
     */
    public void setIdStrDisabled(java.lang.String idStrDisabled) {
        this.idStrDisabled = idStrDisabled;
    }


    /**
     * Gets the operator value for this InactiveCardInfo.
     * 
     * @return operator
     */
    public routines.OperatorInfo getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this InactiveCardInfo.
     * 
     * @param operator
     */
    public void setOperator(routines.OperatorInfo operator) {
        this.operator = operator;
    }


    /**
     * Gets the reasonDisabled value for this InactiveCardInfo.
     * 
     * @return reasonDisabled
     */
    public routines.Reason getReasonDisabled() {
        return reasonDisabled;
    }


    /**
     * Sets the reasonDisabled value for this InactiveCardInfo.
     * 
     * @param reasonDisabled
     */
    public void setReasonDisabled(routines.Reason reasonDisabled) {
        this.reasonDisabled = reasonDisabled;
    }


    /**
     * Gets the refDateDisabled value for this InactiveCardInfo.
     * 
     * @return refDateDisabled
     */
    public java.util.Calendar getRefDateDisabled() {
        return refDateDisabled;
    }


    /**
     * Sets the refDateDisabled value for this InactiveCardInfo.
     * 
     * @param refDateDisabled
     */
    public void setRefDateDisabled(java.util.Calendar refDateDisabled) {
        this.refDateDisabled = refDateDisabled;
    }


    /**
     * Gets the refTimeDisabled value for this InactiveCardInfo.
     * 
     * @return refTimeDisabled
     */
    public java.lang.String getRefTimeDisabled() {
        return refTimeDisabled;
    }


    /**
     * Sets the refTimeDisabled value for this InactiveCardInfo.
     * 
     * @param refTimeDisabled
     */
    public void setRefTimeDisabled(java.lang.String refTimeDisabled) {
        this.refTimeDisabled = refTimeDisabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InactiveCardInfo)) return false;
        InactiveCardInfo other = (InactiveCardInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idStrDisabled==null && other.getIdStrDisabled()==null) || 
             (this.idStrDisabled!=null &&
              this.idStrDisabled.equals(other.getIdStrDisabled()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.reasonDisabled==null && other.getReasonDisabled()==null) || 
             (this.reasonDisabled!=null &&
              this.reasonDisabled.equals(other.getReasonDisabled()))) &&
            ((this.refDateDisabled==null && other.getRefDateDisabled()==null) || 
             (this.refDateDisabled!=null &&
              this.refDateDisabled.equals(other.getRefDateDisabled()))) &&
            ((this.refTimeDisabled==null && other.getRefTimeDisabled()==null) || 
             (this.refTimeDisabled!=null &&
              this.refTimeDisabled.equals(other.getRefTimeDisabled())));
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
        if (getIdStrDisabled() != null) {
            _hashCode += getIdStrDisabled().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getReasonDisabled() != null) {
            _hashCode += getReasonDisabled().hashCode();
        }
        if (getRefDateDisabled() != null) {
            _hashCode += getRefDateDisabled().hashCode();
        }
        if (getRefTimeDisabled() != null) {
            _hashCode += getRefTimeDisabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InactiveCardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "InactiveCardInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStrDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdStrDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "Operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "OperatorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "ReasonDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDateDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "RefDateDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refTimeDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "RefTimeDisabled"));
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
