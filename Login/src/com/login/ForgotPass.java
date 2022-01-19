package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
// Import Database Connection Class file
import com.login.DatabaseConnection;

// Servlet Name
@WebServlet("/ForgotPass")
public class ForgotPass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		
		
		try {
			String email = request.getParameter("email");
			Connection con = DatabaseConnection.initializeDatabase();
			Statement st = con.createStatement();
			String s = "SELECT password FROM demo WHERE email = '" + email + "';";
			
			ResultSet rs = st.executeQuery(s);
			
			rs.next();
			String forgpass = rs.getString("password");  
            //String nm = rs.getString("p");  
            //int s = rs.getInt("sal");   
            //System.out.println(n);    
            //System.out.println("</table>");  
            //System.out.println("</html></body>"); 
			
			HttpSession session = request.getSession();
			session.setAttribute("forgpass", forgpass);
			
            con.close();
            
            response.sendRedirect("ForgotPassGiver.jsp");
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
		