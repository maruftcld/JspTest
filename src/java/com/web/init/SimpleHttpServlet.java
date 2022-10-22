package com.web.init;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/create")
public class SimpleHttpServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("inside get method");
        System.out.println(req.getRequestURI());
        System.out.println(req.getPathInfo());
        //req.getRequestDispatcher("new.jsp").forward(req, res);
        String name = "Mr. ABC";
        req.setAttribute("sname", name);
        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/create.jsp");
        rd.forward(req, res);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("inside post method");
    }  
}