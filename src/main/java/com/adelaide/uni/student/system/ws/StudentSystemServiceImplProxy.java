package com.adelaide.uni.student.system.ws;

public class StudentSystemServiceImplProxy implements com.adelaide.uni.student.system.ws.StudentSystemServiceImpl {
  private String _endpoint = null;
  private com.adelaide.uni.student.system.ws.StudentSystemServiceImpl studentSystemServiceImpl = null;
  
  public StudentSystemServiceImplProxy() {
    _initStudentSystemServiceImplProxy();
  }
  
  public StudentSystemServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentSystemServiceImplProxy();
  }
  
  private void _initStudentSystemServiceImplProxy() {
    try {
      studentSystemServiceImpl = (new com.adelaide.uni.student.system.ws.StudentSystemServiceImplServiceLocator()).getStudentSystemServiceImpl();
      if (studentSystemServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentSystemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentSystemServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentSystemServiceImpl != null)
      ((javax.xml.rpc.Stub)studentSystemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.adelaide.uni.student.system.ws.StudentSystemServiceImpl getStudentSystemServiceImpl() {
    if (studentSystemServiceImpl == null)
      _initStudentSystemServiceImplProxy();
    return studentSystemServiceImpl;
  }
  
  public com.adelaide.uni.student.system.ws.SearchStudentResponse searchStudent(com.adelaide.uni.student.system.ws.SearchStudentRequest searchStudentRequest) throws java.rmi.RemoteException{
    if (studentSystemServiceImpl == null)
      _initStudentSystemServiceImplProxy();
    return studentSystemServiceImpl.searchStudent(searchStudentRequest);
  }
  
  public com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryResponse searchStudentEnrollmentHistory(com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryRequest searchStudentEnrollmentHistoryRequest) throws java.rmi.RemoteException{
    if (studentSystemServiceImpl == null)
      _initStudentSystemServiceImplProxy();
    return studentSystemServiceImpl.searchStudentEnrollmentHistory(searchStudentEnrollmentHistoryRequest);
  }
  
  public com.adelaide.uni.student.system.ws.LinkTestResponse linkTest(com.adelaide.uni.student.system.ws.LinkTestRequest linkTestRequest) throws java.rmi.RemoteException{
    if (studentSystemServiceImpl == null)
      _initStudentSystemServiceImplProxy();
    return studentSystemServiceImpl.linkTest(linkTestRequest);
  }
  
  
}