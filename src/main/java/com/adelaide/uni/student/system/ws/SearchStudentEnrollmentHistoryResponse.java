/**
 * SearchStudentEnrollmentHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adelaide.uni.student.system.ws;

public class SearchStudentEnrollmentHistoryResponse  implements java.io.Serializable {
    private java.lang.String degree;

    private java.lang.String status;

    private java.lang.String dateGraduated;

    public SearchStudentEnrollmentHistoryResponse() {
    }

    public SearchStudentEnrollmentHistoryResponse(
           java.lang.String degree,
           java.lang.String status,
           java.lang.String dateGraduated) {
           this.degree = degree;
           this.status = status;
           this.dateGraduated = dateGraduated;
    }


    /**
     * Gets the degree value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @return degree
     */
    public java.lang.String getDegree() {
        return degree;
    }


    /**
     * Sets the degree value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @param degree
     */
    public void setDegree(java.lang.String degree) {
        this.degree = degree;
    }


    /**
     * Gets the status value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the dateGraduated value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @return dateGraduated
     */
    public java.lang.String getDateGraduated() {
        return dateGraduated;
    }


    /**
     * Sets the dateGraduated value for this SearchStudentEnrollmentHistoryResponse.
     * 
     * @param dateGraduated
     */
    public void setDateGraduated(java.lang.String dateGraduated) {
        this.dateGraduated = dateGraduated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchStudentEnrollmentHistoryResponse)) return false;
        SearchStudentEnrollmentHistoryResponse other = (SearchStudentEnrollmentHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.degree==null && other.getDegree()==null) || 
             (this.degree!=null &&
              this.degree.equals(other.getDegree()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dateGraduated==null && other.getDateGraduated()==null) || 
             (this.dateGraduated!=null &&
              this.dateGraduated.equals(other.getDateGraduated())));
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
        if (getDegree() != null) {
            _hashCode += getDegree().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDateGraduated() != null) {
            _hashCode += getDateGraduated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchStudentEnrollmentHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.adelaide.edu.au", ">searchStudentEnrollmentHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "degree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateGraduated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "dateGraduated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
