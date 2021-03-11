package com.ltts.serveletproject.model;

import java.util.Date;

public class Player {
	private  int pno;
	private String pname;
	private String pcountry;
    private Date date;
	public Player(int pno, String pname, String pcountry, Date date) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pcountry = pcountry;
		this.date = date;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", pcountry=" + pcountry + ", date=" + date + "]";
	} 
	 

}
	