/**
 * TopupReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nms.iwebservice;

public class TopupReq  implements java.io.Serializable {
	private static final long serialVersionUID = -5879010959853763530L;

	private java.lang.Long agentId;

    private java.lang.Double amount;

    private java.lang.String description;

    private java.lang.String isdn;

    private java.lang.Long partnerId;

    private java.lang.String password;

    private java.lang.String requestDate;

    private java.lang.Long requestId;

    public TopupReq() {
    }

    public TopupReq(
           java.lang.Long agentId,
           java.lang.Double amount,
           java.lang.String description,
           java.lang.String isdn,
           java.lang.Long partnerId,
           java.lang.String password,
           java.lang.String requestDate,
           java.lang.Long requestId) {
           this.agentId = agentId;
           this.amount = amount;
           this.description = description;
           this.isdn = isdn;
           this.partnerId = partnerId;
           this.password = password;
           this.requestDate = requestDate;
           this.requestId = requestId;
    }


    /**
     * Gets the agentId value for this TopupReq.
     * 
     * @return agentId
     */
    public java.lang.Long getAgentId() {
        return agentId;
    }


    /**
     * Sets the agentId value for this TopupReq.
     * 
     * @param agentId
     */
    public void setAgentId(java.lang.Long agentId) {
        this.agentId = agentId;
    }


    /**
     * Gets the amount value for this TopupReq.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TopupReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this TopupReq.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TopupReq.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isdn value for this TopupReq.
     * 
     * @return isdn
     */
    public java.lang.String getIsdn() {
        return isdn;
    }


    /**
     * Sets the isdn value for this TopupReq.
     * 
     * @param isdn
     */
    public void setIsdn(java.lang.String isdn) {
        this.isdn = isdn;
    }


    /**
     * Gets the partnerId value for this TopupReq.
     * 
     * @return partnerId
     */
    public java.lang.Long getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this TopupReq.
     * 
     * @param partnerId
     */
    public void setPartnerId(java.lang.Long partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the password value for this TopupReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TopupReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the requestDate value for this TopupReq.
     * 
     * @return requestDate
     */
    public java.lang.String getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this TopupReq.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.lang.String requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the requestId value for this TopupReq.
     * 
     * @return requestId
     */
    public java.lang.Long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this TopupReq.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.Long requestId) {
        this.requestId = requestId;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupReq)) return false;
        TopupReq other = (TopupReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentId==null && other.getAgentId()==null) || 
             (this.agentId!=null &&
              this.agentId.equals(other.getAgentId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isdn==null && other.getIsdn()==null) || 
             (this.isdn!=null &&
              this.isdn.equals(other.getIsdn()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId())));
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
        if (getAgentId() != null) {
            _hashCode += getAgentId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsdn() != null) {
            _hashCode += getIsdn().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRequestDate() != null) {
            _hashCode += getRequestDate().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iwebservice.nms.com", "TopupReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "agentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "isdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "requestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
    @SuppressWarnings("rawtypes")
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
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
