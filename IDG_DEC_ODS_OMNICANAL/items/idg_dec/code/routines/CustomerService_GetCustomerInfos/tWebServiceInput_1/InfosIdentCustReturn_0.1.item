/**
 * InfosIdentCustReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class InfosIdentCustReturn  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private java.lang.Integer idContact;

    private java.lang.Integer idCust;

    public InfosIdentCustReturn() {
    }

    public InfosIdentCustReturn(
           java.lang.String cardNumber,
           java.lang.Integer idContact,
           java.lang.Integer idCust) {
           this.cardNumber = cardNumber;
           this.idContact = idContact;
           this.idCust = idCust;
    }


    /**
     * Gets the cardNumber value for this InfosIdentCustReturn.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this InfosIdentCustReturn.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the idContact value for this InfosIdentCustReturn.
     * 
     * @return idContact
     */
    public java.lang.Integer getIdContact() {
        return idContact;
    }


    /**
     * Sets the idContact value for this InfosIdentCustReturn.
     * 
     * @param idContact
     */
    public void setIdContact(java.lang.Integer idContact) {
        this.idContact = idContact;
    }


    /**
     * Gets the idCust value for this InfosIdentCustReturn.
     * 
     * @return idCust
     */
    public java.lang.Integer getIdCust() {
        return idCust;
    }


    /**
     * Sets the idCust value for this InfosIdentCustReturn.
     * 
     * @param idCust
     */
    public void setIdCust(java.lang.Integer idCust) {
        this.idCust = idCust;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfosIdentCustReturn)) return false;
        InfosIdentCustReturn other = (InfosIdentCustReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.idContact==null && other.getIdContact()==null) || 
             (this.idContact!=null &&
              this.idContact.equals(other.getIdContact()))) &&
            ((this.idCust==null && other.getIdCust()==null) || 
             (this.idCust!=null &&
              this.idCust.equals(other.getIdCust())));
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
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getIdContact() != null) {
            _hashCode += getIdContact().hashCode();
        }
        if (getIdCust() != null) {
            _hashCode += getIdCust().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfosIdentCustReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "InfosIdentCustReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "CardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Generix.WSAgil.Contracts.Dto.Customer", "IdCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
