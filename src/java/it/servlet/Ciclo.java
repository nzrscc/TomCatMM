package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Ciclo")
public class Ciclo extends HttpServlet {
    public static int contatore=0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        contatore++;
        if(contatore<=3)
        {
            request.getRequestDispatcher("jsp/game.jsp").include(request,response);
        }else
        {
            System.out.println("Hai finito i tentativi!");
        }
    }
}
