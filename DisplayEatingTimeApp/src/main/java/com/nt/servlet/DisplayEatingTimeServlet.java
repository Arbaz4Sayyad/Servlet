package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayEatingTimeServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get printwriter
		PrintWriter pw = res.getWriter();
		
		//set content type
		res.setContentType("text/html");
		
		//write b.logic
		LocalDateTime ldt = LocalDateTime.now();
		pw.println("<h1 style='color:red; text-align:center'>"+ldt.toString()+"</h1>");
		int hour = ldt.getHour();
		if(hour<10 && hour>8)
			pw.println("<h1 style='color:red; text-align:center'>BreakFast Time</h1>");
		
		else if(hour<2 && hour>12)
			pw.println("<h1 style='color:red; text-align:center'>Lunch Time</h1>");
		
		else if(hour<6 && hour>4)
			pw.println("<h1 style='color:red; text-align:center'>Snack Time</h1>");
		
		else
			pw.println("<h1 style='color:red; text-align:center'>Dinner Time</h1>");
		
		pw.println("<br><a href='http://localhost:3030/DisplayEatingTimeApp/page.html>Home</a>");
		
		//close the stream
		pw.close();
	}
}
