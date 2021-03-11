package com.ltts.serveletproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.serveletproject.configure.MyConnection;
import com.ltts.serveletproject.model.Auction;
import com.ltts.serveletproject.model.Player;

public class AuctionDao {
	
	public boolean insertPlayer(Auction c) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?,?)");
		ps.setInt(1, c.getAuctionid());
		ps.setInt(2, c.getPlayerid());
		ps.setInt(3, c.getTeamid());
		ps.setInt(4, c.getYear());
		ps.setInt(5, c.getAmount());
		return ps.execute();

		
		//return false;

		
	}
}