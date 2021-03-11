package com.ltts.serveletproject.model;

public class Auction {
private int Auctionid;
private int playerid;
private int teamid;
private int year;
private int amount;

public Auction() {
	super();
	// TODO Auto-generated constructor stub
}

public Auction(int auctionid, int playerid, int teamid, int year, int amount) {
	super();
	Auctionid = auctionid;
	this.playerid = playerid;
	this.teamid = teamid;
	this.year = year;
	this.amount = amount;
}

public int getAuctionid() {
	return Auctionid;
}

public void setAuctionid(int auctionid) {
	Auctionid = auctionid;
}

public int getPlayerid() {
	return playerid;
}

public void setPlayerid(int playerid) {
	this.playerid = playerid;
}

public int getTeamid() {
	return teamid;
}

public void setTeamid(int teamid) {
	this.teamid = teamid;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "Auction [Auctionid=" + Auctionid + ", playerid=" + playerid + ", teamid=" + teamid + ", year=" + year
			+ ", amount=" + amount + "]";
}


}
