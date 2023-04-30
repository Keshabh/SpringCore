package com.springcore.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Manager {
	@Value("201")
	private int mId;
	private Emp emp;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", emp=" + emp + "]";
	}
	
}
