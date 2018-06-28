package com.onlineshopping.po;

public class GoodsType {
	int tID;
	String tName;
	
	public GoodsType(){
		
	}
	
	public GoodsType(int tID, String tName) {
		this.tID = tID;
		this.tName = tName;
	}

	public int gettID() {
		return tID;
	}

	public void settID(int tID) {
		this.tID = tID;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return "GoodsType [tID=" + tID + ", tName=" + tName + "]";
	}
	
	
}
