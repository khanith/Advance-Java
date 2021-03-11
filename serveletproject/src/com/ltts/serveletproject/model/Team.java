package com.ltts.serveletproject.model;

public class Team {
	private int teamid;
	private String tname;
	private String oname;
	private String cname;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamid, String tname, String oname, String cname) {
		super();
		this.teamid = teamid;
		this.tname = tname;
		this.oname = oname;
		this.cname = cname;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", tname=" + tname + ", oname=" + oname + ", cname=" + cname + "]";
	}
	
	
}
