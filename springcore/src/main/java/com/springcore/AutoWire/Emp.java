package com.springcore.AutoWire;

public class Emp {
 private int empId;
 private String empName;
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
