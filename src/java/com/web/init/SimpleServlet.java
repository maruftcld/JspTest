package com.web.init;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class SimpleServlet implements Servlet{

    public void init(ServletConfig config) throws ServletException {
        System.out.println("hello init method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    //service - request method
    //dynamic html - no page
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/edit.jsp");
        rd.forward(req, res);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy method");
    }
     
}