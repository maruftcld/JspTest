package com.web.init;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Mr. A", 200.32, "HR");
        Employee e2 = new Employee("Mr. B", 300.32, "IT");
        Employee e3 = new Employee("Mr. C", 400.32, "FIN");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        req.setAttribute("emp", employees);
        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/create.jsp");
        rd.forward(req, res);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("inside post method");
    }  
}