/**
 * StudentSystemServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adelaide.uni.student.system.ws;

public interface StudentSystemServiceImpl extends java.rmi.Remote {
    public com.adelaide.uni.student.system.ws.SearchStudentResponse searchStudent(com.adelaide.uni.student.system.ws.SearchStudentRequest searchStudentRequest) throws java.rmi.RemoteException;
    public com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryResponse searchStudentEnrollmentHistory(com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryRequest searchStudentEnrollmentHistoryRequest) throws java.rmi.RemoteException;
    public com.adelaide.uni.student.system.ws.LinkTestResponse linkTest(com.adelaide.uni.student.system.ws.LinkTestRequest linkTestRequest) throws java.rmi.RemoteException;
}
