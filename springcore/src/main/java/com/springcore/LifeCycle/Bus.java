package com.springcore.LifeCycle;

//prperties are set, then init method is called.
//at the end , destroy.
public class Bus {
  private int busId;
  private String busNumber;
public int getBusId() {
	return busId;
}
public void setBusId(int busId) {
	System.out.println("Setting property");
	this.busId = busId;
}
public String getBusNumber() {
	return busNumber;
}
public void setBusNumber(String busNumber) {
	this.busNumber = busNumber;
}
public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Bus [busId=" + busId + ", busNumber=" + busNumber + "]";
}
  
//init and destroy can be renamed into anything, but needs to be changed in bean too.
public void init()
{
	System.out.println("Init method");
}

public void destroy()
{
	System.out.println("Destroy method");
}
  

}
