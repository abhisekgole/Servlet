package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MarriageServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		
		PrintWriter pw=null;
		String name=null,tage=null,gen=null;
		int age=0;
		//from html variable
		String pname=null,page=null,pgen=null;
		
		
		//get PrintWriter
		pw=res.getWriter();
		//set ContentType
		res.setContentType("text/html");
	   //get request parameter value(from data)
		name=req.getParameter("pname");
		gen=req.getParameter("gen");
		tage=req.getParameter("page");
		age=Integer.parseInt(tage);
		
		//write request processing logic
		if(gen.equalsIgnoreCase("f")) {
			if(age>=18) {
				pw.println("<h1 style='color:green'> mrs."+name+" you are eligible for marriage find out your rich pathner");
			}
			else
				pw.println("<h1 style='color:green'> mrs."+name+" you are not eligible for marriage.Wait! for"+(18-age)+"yr");
		}//main if
		
		else {
			if(age>=21) {
				pw.println("<h1 style='color:green'> mr."+name+" you are eligible for marriage but think twice");
			}
			else {
				pw.println("<h1 style='color:green'> mr."+name+" you are not eligible for marriage.Wait! for"+(21-age)+"yr. Now you are make your Phisic");

			}
			
		}//main else
			
		//generate the hyperlink
		pw.println("<br><a href='input.html'><img src='marriage1.jpg' weith='100' height='100'></a>");

		
		//close stream
		pw.close();
		
		

	}//doGet(-,-)

}//class
