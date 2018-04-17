/**
 * LinkTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adelaide.uni.student.system.ws;

public class LinkTestResponse  implements java.io.Serializable {
    private java.lang.Boolean success;

    private com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors;

    public LinkTestResponse() {
    }

    public LinkTestResponse(
           java.lang.Boolean success,
           com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors) {
           this.success = success;
           this.listOfErrors = listOfErrors;
    }


    /**
     * Gets the success value for this LinkTestResponse.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this LinkTestResponse.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the listOfErrors value for this LinkTestResponse.
     * 
     * @return listOfErrors
     */
    public com.adelaide.uni.student.system.ws.ErrorVO[] getListOfErrors() {
        return listOfErrors;
    }


    /**
     * Sets the listOfErrors value for this LinkTestResponse.
     * 
     * @param listOfErrors
     */
    public void setListOfErrors(com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors) {
        this.listOfErrors = listOfErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkTestResponse)) return false;
        LinkTestResponse other = (LinkTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.listOfErrors==null && other.getListOfErrors()==null) || 
             (this.listOfErrors!=null &&
              java.util.Arrays.equals(this.listOfErrors, other.getListOfErrors())));
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
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getListOfErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.adelaide.edu.au", ">LinkTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "listOfErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "ErrorVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "errorVO"));
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
