package com.example.Tomcat_EE_App;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        System.out.println("the GET request has been made to /hello-servlet");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>This is a paragraph tag.</p>");
        out.println("</body></html>");


        response.getWriter().println("<h2>Here is a line</h2>");
        response.getWriter().println("<h3>Here is another line</h3>");

        response.getWriter().println("");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("the POST request has been made to /hello-servlet");

    }

    public void destroy() {
    }
}