package com.neuedu.lvcity.model;

public class Articaltype {
    
	private int atid;
	private String atype;
	public Articaltype(){
		super();
	}
	
	public Articaltype(int atid,String atype){
		super();
		this.atid = atid;
		this.atype = atype;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	
	public int getAtid() {
		return atid;
	}
	public void setAtid(int atid) {
		this.atid = atid;
	}
	
	
}
