/**
 * ScratchCardReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nms.iwebservice;

public class ScratchCardReq  implements java.io.Serializable {
	private static final long serialVersionUID = 4663646252718621869L;

	private java.lang.Long agentId;

    private java.lang.String description;

    private java.lang.Long partnerId;

    private java.lang.String password;

    private java.lang.String requestDate;

    private java.lang.Long requestId;

    private java.lang.String secretCode;

    private java.lang.String serial;

    public ScratchCardReq() {
    }

    public ScratchCardReq(
           java.lang.Long agentId,
           java.lang.String description,
           java.lang.Long partnerId,
           java.lang.String password,
           java.lang.String requestDate,
           java.lang.Long requestId,
           java.lang.String secretCode,
           java.lang.String serial) {
           this.agentId = agentId;
           this.description = description;
           this.partnerId = partnerId;
           this.password = password;
           this.requestDate = requestDate;
           this.requestId = requestId;
           this.secretCode = secretCode;
           this.serial = serial;
    }


    /**
     * Gets the agentId value for this ScratchCardReq.
     * 
     * @return agentId
     */
    public java.lang.Long getAgentId() {
        return agentId;
    }


    /**
     * Sets the agentId value for this ScratchCardReq.
     * 
     * @param agentId
     */
    public void setAgentId(java.lang.Long agentId) {
        this.agentId = agentId;
    }


    /**
     * Gets the description value for this ScratchCardReq.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ScratchCardReq.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the partnerId value for this ScratchCardReq.
     * 
     * @return partnerId
     */
    public java.lang.Long getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this ScratchCardReq.
     * 
     * @param partnerId
     */
    public void setPartnerId(java.lang.Long partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the password value for this ScratchCardReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ScratchCardReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the requestDate value for this ScratchCardReq.
     * 
     * @return requestDate
     */
    public java.lang.String getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this ScratchCardReq.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.lang.String requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the requestId value for this ScratchCardReq.
     * 
     * @return requestId
     */
    public java.lang.Long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ScratchCardReq.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.Long requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the secretCode value for this ScratchCardReq.
     * 
     * @return secretCode
     */
    public java.lang.String getSecretCode() {
        return secretCode;
    }


    /**
     * Sets the secretCode value for this ScratchCardReq.
     * 
     * @param secretCode
     */
    public void setSecretCode(java.lang.String secretCode) {
        this.secretCode = secretCode;
    }


    /**
     * Gets the serial value for this ScratchCardReq.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ScratchCardReq.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScratchCardReq)) return false;
        ScratchCardReq other = (ScratchCardReq) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
              this.requestId.equals(other.getRequestId()))) &&
            ((this.secretCode==null && other.getSecretCode()==null) || 
             (this.secretCode!=null &&
              this.secretCode.equals(other.getSecretCode()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getSecretCode() != null) {
            _hashCode += getSecretCode().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScratchCardReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iwebservice.nms.com", "ScratchCardReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "agentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "secretCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://iwebservice.nms.com", "serial"));
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
