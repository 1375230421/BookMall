package com.onlineshopping.po;

import java.util.Date;

public class User {
	public int uID;
	public String uName;
	public String uPwd;
	public String uPhone;
	public String uBirth;
	public Date uRegTiem;
	public String uImage;
	public String uEmail;
	public String uSex;
	public int uPpwd;

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuBirth() {
		return uBirth;
	}

	public void setuBirth(String uBirth) {
		this.uBirth = uBirth;
	}

	public Date getuRegTiem() {
		return uRegTiem;
	}

	public void setuRegTiem(Date uRegTiem) {
		this.uRegTiem = uRegTiem;
	}

	public String getuImage() {
		return uImage;
	}

	public void setuImage(String uImage) {
		this.uImage = uImage;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public int getuPpwd() {
		return uPpwd;
	}

	public void setuPpwd(int uPpwd) {
		this.uPpwd = uPpwd;
	}

	@Override
	public String toString() {
		return "User [uID=" + uID + ", uName=" + uName + ", uPwd=" + uPwd + ", uPhone=" + uPhone + ", uBirth=" + uBirth
				+ ", uRegTiem=" + uRegTiem + ", uImage=" + uImage + ", uEmail=" + uEmail + ", uSex=" + uSex + ", uPpwd="
				+ uPpwd + "]";
	}

}
