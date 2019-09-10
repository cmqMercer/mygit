package com.example.demo.entities;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8495110355150434687L;
	public String fname_l2;
	public String fid;
	public String fpassword;
	private String fnumber;
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFpassword() {
		return fpassword;
	}
	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}
	public String getFname_l2() {
		return fname_l2;
	}
	public void setFname_l2(String fname_l2) {
		this.fname_l2 = fname_l2;
	}


	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
}
