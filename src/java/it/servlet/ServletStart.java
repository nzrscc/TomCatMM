package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Start")
public class ServletStart extends HttpServlet {
    private static final long serialVersionUID=1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setUsername(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void setUsername(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
        String username=request.getParameter("username");
        String scelta=request.getParameter("scelta");
        request.getSession().setAttribute("username", username);
        System.out.println("Scelta= "+scelta);
        //request.getSession().setAttribute("scelta", scelta);
        if(scelta.equals("MasterMind"))
        {
            response.sendRedirect("Ciclo");
        }else if(scelta.equals("Classifica"))
        {
            response.sendRedirect("Classifica");
        }
    }
}
