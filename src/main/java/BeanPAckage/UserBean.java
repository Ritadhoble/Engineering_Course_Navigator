package BeanPAckage;

import java.io.*;

@SuppressWarnings("serial")
public class UserBean implements Serializable {
	private String fName,lName,eMail,pWd,Addr;
	private long phNo;

	public UserBean() {
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getpWd() {
		return pWd;
	}

	public void setpWd(String pWd) {
		this.pWd = pWd;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	
}