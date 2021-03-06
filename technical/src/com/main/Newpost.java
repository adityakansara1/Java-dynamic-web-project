package com.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/newpost")
public class Newpost extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String postContent[]=new String[12];
		for(int i=1;i<=10;i++) {
			postContent[i-1]=request.getParameter("content"+i);
		}
		postContent[10]=request.getParameter("title");
		String title=request.getParameter("title");
		postContent[11]=request.getParameter("slug");
		String sql="insert into posts(content1,content2,content3,content4,content5,content6,content7,content8,content9,content10,title,slug)values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			//Connecting to database
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/technicalblogs" ,"root" ,"");
			PreparedStatement pstm = con.prepareStatement(sql);
			for(int i=0;i<=9;i++) {
				pstm.setString(i+1, postContent[i]);
			}
			pstm.setString(11, postContent[10]);
			pstm.setString(12, postContent[11]);
			int rs = pstm.executeUpdate();
			
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
