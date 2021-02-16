/**
 * CustomerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class CustomerInfo  implements java.io.Serializable {
    private routines.ContactInfo contact;

    private java.util.Calendar endValidityPointsDate;

    private java.lang.Integer idCust;

    private java.lang.Integer pointsCount;

    private java.util.Calendar updatingPointsDate;

    public CustomerInfo() {
    }

    public CustomerInfo(
           routines.ContactInfo contact,
           java.util.Calendar endValidityPointsDate,
           java.lang.Integer idCust,
           java.lang.Integer pointsCount,
           java.util.Calendar updatingPointsDate) {
           this.contact = contact;
           this.endValidityPointsDate = endValidityPointsDate;
           this.idCust = idCust;
           this.pointsCount = pointsCount;
           this.updatingPointsDate = updatingPointsDate;
    }


    /**
     * Gets the contact value for this CustomerInfo.
     * 
     * @return contact
     */
    public routines.ContactInfo getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CustomerInfo.
     * 
     * @param contact
     */
    public void setContact(routines.ContactInfo contact) {
        this.contact = contact;
    }


    /**
     * Gets the endValidityPointsDate value for this CustomerInfo.
     * 
     * @return endValidityPointsDate
     */
    public java.util.Calendar getEndValidityPointsDate() {
        return endValidityPointsDate;
    }


    /**
     * Sets the endValidityPointsDate value for this CustomerInfo.
     * 
     * @param endValidityPointsDate
     */
    public void setEndValidityPointsDate(java.util.Calendar endValidityPointsDate) {
        this.endValidityPointsDate = endValidityPointsDate;
    }


    /**
     * Gets the idCust value for this CustomerInfo.
     * 
     * @return idCust
     */
    public java.lang.Integer getIdCust() {
        return idCust;
    }


    /**
     * Sets the idCust value for this CustomerInfo.
     * 
     * @param idCust
     */
    public void setIdCust(java.lang.Integer idCust) {
        this.idCust = idCust;
    }


    /**
     * Gets the pointsCount value for this CustomerInfo.
     * 
     * @return pointsCount
     */
    public java.lang.Integer getPointsCount() {
        return pointsCount;
    }


    /**
     * Sets the pointsCount value for this CustomerInfo.
     * 
     * @param pointsCount
     */
    public void setPointsCount(java.lang.Integer pointsCount) {
        this.pointsCount = pointsCount;
    }


    /**
     * Gets the updatingPointsDate value for this CustomerInfo.
     * 
     * @return updatingPointsDate
     */
    public java.util.Calendar getUpdatingPointsDate() {
        return updatingPointsDate;
    }


    /**
     * Sets the updatingPointsDate value for this CustomerInfo.
     * 
     * @param updatingPointsDate
     */
    public void setUpdatingPointsDate(java.util.Calendar updatingPointsDate) {
        this.updatingPointsDate = updatingPointsDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInfo)) return false;
        CustomerInfo other = (CustomerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.endValidityPointsDate==null && other.getEndValidityPointsDate()==null) || 
             (this.endValidityPointsDate!=null &&
              this.endValidityPointsDate.equals(other.getEndValidityPointsDate()))) &&
            ((this.idCust==null && other.getIdCust()==null) || 
             (this.idCust!=null &&
              this.idCust.equals(other.getIdCust()))) &&
            ((this.pointsCount==null && other.getPointsCount()==null) || 
             (this.pointsCount!=null &&
              this.pointsCount.equals(other.getPointsCount()))) &&
            ((this.updatingPointsDate==null && other.getUpdatingPointsDate()==null) || 
             (this.updatingPointsDate!=null &&
              this.updatingPointsDate.equals(other.getUpdatingPointsDate())));
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
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getEndValidityPointsDate() != null) {
            _hashCode += getEndValidityPointsDate().hashCode();
        }
        if (getIdCust() != null) {
            _hashCode += getIdCust().hashCode();
        }
        if (getPointsCount() != null) {
            _hashCode += getPointsCount().hashCode();
        }
        if (getUpdatingPointsDate() != null) {
            _hashCode += getUpdatingPointsDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "CustomerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "ContactInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endValidityPointsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "EndValidityPointsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "PointsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatingPointsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "UpdatingPointsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
