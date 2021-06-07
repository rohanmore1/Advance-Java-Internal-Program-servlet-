/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class Welcome1 extends HttpServlet {

   

 public void doPost(HttpServletRequest request , HttpServletResponse response)
         throws ServletException ,IOException
 {
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     
     String session  =  request.getParameter("ession_id");
     String username = request.getParameter("Login");
     out.println("<h1>"+"id:501" +session+"</h1>");
     out.println("<h1>"+"Welcome ROHAN MORE"+" </h1>");
     
 }
}
