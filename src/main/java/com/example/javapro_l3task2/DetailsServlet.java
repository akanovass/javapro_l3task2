package com.example.javapro_l3task2;

import bd.DBManager;
import bd.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id=Long.parseLong(request.getParameter("id"));
        Student student = DBManager.getStudent(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("/details.jsp").forward(request,response);
    }
}
