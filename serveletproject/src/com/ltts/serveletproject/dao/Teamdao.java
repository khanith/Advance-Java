package com.ltts.serveletproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.serveletproject.configure.MyConnection;
import com.ltts.serveletproject.model.Player;
import com.ltts.serveletproject.model.Team;

public class Teamdao {
	
	public boolean insertTeam(Team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?)");
		ps.setInt(1, t.getTeamid());
		ps.setString(2, t.getTname());
		ps.setString(3, t.getOname());
		ps.setString(4, t.getCname());
		return ps.execute();

		
		//return false;

		
	}
}