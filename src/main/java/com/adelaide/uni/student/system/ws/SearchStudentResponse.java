/**
 * SearchStudentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adelaide.uni.student.system.ws;

public class SearchStudentResponse  implements java.io.Serializable {
    private com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors;

    private java.lang.String studentId;

    private java.lang.String firstName;

    private java.lang.String preferredFirstName;

    private java.lang.String lastName;

    private java.lang.String familyName;

    private java.lang.String dateOfBirth;

    public SearchStudentResponse() {
    }

    public SearchStudentResponse(
           com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors,
           java.lang.String studentId,
           java.lang.String firstName,
           java.lang.String preferredFirstName,
           java.lang.String lastName,
           java.lang.String familyName,
           java.lang.String dateOfBirth) {
           this.listOfErrors = listOfErrors;
           this.studentId = studentId;
           this.firstName = firstName;
           this.preferredFirstName = preferredFirstName;
           this.lastName = lastName;
           this.familyName = familyName;
           this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the listOfErrors value for this SearchStudentResponse.
     * 
     * @return listOfErrors
     */
    public com.adelaide.uni.student.system.ws.ErrorVO[] getListOfErrors() {
        return listOfErrors;
    }


    /**
     * Sets the listOfErrors value for this SearchStudentResponse.
     * 
     * @param listOfErrors
     */
    public void setListOfErrors(com.adelaide.uni.student.system.ws.ErrorVO[] listOfErrors) {
        this.listOfErrors = listOfErrors;
    }


    /**
     * Gets the studentId value for this SearchStudentResponse.
     * 
     * @return studentId
     */
    public java.lang.String getStudentId() {
        return studentId;
    }


    /**
     * Sets the studentId value for this SearchStudentResponse.
     * 
     * @param studentId
     */
    public void setStudentId(java.lang.String studentId) {
        this.studentId = studentId;
    }


    /**
     * Gets the firstName value for this SearchStudentResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SearchStudentResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the preferredFirstName value for this SearchStudentResponse.
     * 
     * @return preferredFirstName
     */
    public java.lang.String getPreferredFirstName() {
        return preferredFirstName;
    }


    /**
     * Sets the preferredFirstName value for this SearchStudentResponse.
     * 
     * @param preferredFirstName
     */
    public void setPreferredFirstName(java.lang.String preferredFirstName) {
        this.preferredFirstName = preferredFirstName;
    }


    /**
     * Gets the lastName value for this SearchStudentResponse.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SearchStudentResponse.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the familyName value for this SearchStudentResponse.
     * 
     * @return familyName
     */
    public java.lang.String getFamilyName() {
        return familyName;
    }


    /**
     * Sets the familyName value for this SearchStudentResponse.
     * 
     * @param familyName
     */
    public void setFamilyName(java.lang.String familyName) {
        this.familyName = familyName;
    }


    /**
     * Gets the dateOfBirth value for this SearchStudentResponse.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this SearchStudentResponse.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchStudentResponse)) return false;
        SearchStudentResponse other = (SearchStudentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listOfErrors==null && other.getListOfErrors()==null) || 
             (this.listOfErrors!=null &&
              java.util.Arrays.equals(this.listOfErrors, other.getListOfErrors()))) &&
            ((this.studentId==null && other.getStudentId()==null) || 
             (this.studentId!=null &&
              this.studentId.equals(other.getStudentId()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.preferredFirstName==null && other.getPreferredFirstName()==null) || 
             (this.preferredFirstName!=null &&
              this.preferredFirstName.equals(other.getPreferredFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.familyName==null && other.getFamilyName()==null) || 
             (this.familyName!=null &&
              this.familyName.equals(other.getFamilyName()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth())));
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
        if (getStudentId() != null) {
            _hashCode += getStudentId().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getPreferredFirstName() != null) {
            _hashCode += getPreferredFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFamilyName() != null) {
            _hashCode += getFamilyName().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchStudentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.adelaide.edu.au", ">searchStudentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "listOfErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "ErrorVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "errorVO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "studentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "preferredFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "familyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "dateOfBirth"));
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
