/**
 * StudentSystemServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adelaide.uni.student.system.ws;

public class StudentSystemServiceImplServiceLocator extends org.apache.axis.client.Service implements com.adelaide.uni.student.system.ws.StudentSystemServiceImplService {

    public StudentSystemServiceImplServiceLocator() {
    }


    public StudentSystemServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentSystemServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentSystemServiceImpl
    private java.lang.String StudentSystemServiceImpl_address = "http://server.adelaide.edu.au/student/webservice";

    public java.lang.String getStudentSystemServiceImplAddress() {
        return StudentSystemServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentSystemServiceImplWSDDServiceName = "StudentSystemServiceImpl";

    public java.lang.String getStudentSystemServiceImplWSDDServiceName() {
        return StudentSystemServiceImplWSDDServiceName;
    }

    public void setStudentSystemServiceImplWSDDServiceName(java.lang.String name) {
        StudentSystemServiceImplWSDDServiceName = name;
    }

    public com.adelaide.uni.student.system.ws.StudentSystemServiceImpl getStudentSystemServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentSystemServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentSystemServiceImpl(endpoint);
    }

    public com.adelaide.uni.student.system.ws.StudentSystemServiceImpl getStudentSystemServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.adelaide.uni.student.system.ws.StudentSystemServiceImplSoapBindingStub _stub = new com.adelaide.uni.student.system.ws.StudentSystemServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getStudentSystemServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentSystemServiceImplEndpointAddress(java.lang.String address) {
        StudentSystemServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.adelaide.uni.student.system.ws.StudentSystemServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.adelaide.uni.student.system.ws.StudentSystemServiceImplSoapBindingStub _stub = new com.adelaide.uni.student.system.ws.StudentSystemServiceImplSoapBindingStub(new java.net.URL(StudentSystemServiceImpl_address), this);
                _stub.setPortName(getStudentSystemServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StudentSystemServiceImpl".equals(inputPortName)) {
            return getStudentSystemServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.adelaide.edu.au", "StudentSystemServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.adelaide.edu.au", "StudentSystemServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentSystemServiceImpl".equals(portName)) {
            setStudentSystemServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
