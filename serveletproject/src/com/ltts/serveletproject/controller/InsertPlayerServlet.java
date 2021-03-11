package com.ltts.serveletproject.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.serveletproject.dao.PlayerDao;
import com.ltts.serveletproject.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int pno=Integer.parseInt(request.getParameter("pno"));
		String  pname=request.getParameter("pname");
		String pcountry=request.getParameter("pcountry");
		String date1 =request.getParameter("date");
		Date d=Date.valueOf(date1);
		Player p=new Player(pno,pname,pcountry,d);
		
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}