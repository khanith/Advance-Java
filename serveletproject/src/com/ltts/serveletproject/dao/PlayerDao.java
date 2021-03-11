package com.ltts.serveletproject.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.serveletproject.configure.MyConnection;
import com.ltts.serveletproject.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?)");
		ps.setInt(1, p.getPno());
		ps.setString(2, p.getPname());
		ps.setString(3, p.getPcountry());
		ps.setDate(4,(Date) p.getDate());
		return ps.execute();

		
		//return false;

		
	}
	
	
	
	
	
	
	
	

}