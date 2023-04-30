package com.springcore.annotationAutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//there are 3 ways to use autowire here, 1 is to use it on referencedvaraibel, other on setter function, and 3rd on constructor.
public class Emp {
 private int empId;
 private String empName;
 @Autowired
 @Qualifier("empAddress2")
 private Address empAddress;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Address getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(Address empAddress) {
	this.empAddress = empAddress;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
}
 
 
}
