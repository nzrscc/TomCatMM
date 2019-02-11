package it.servlet;

import it.Context;
import it.controllers.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Game")
public class Game extends HttpServlet {
    private Controller controller;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute("username");
        String combination = request.getParameter("numero1");
        combination += "," + request.getParameter("numero2");
        combination += "," + request.getParameter("numero3");
        if(Ciclo.contatore == 1 ) {
            controller = Context.getInstance().getController();
            controller.setUsername(username);
            controller.creaCombinazione();
        }
        controller.verificaInput(combination);
        controller.verificaCombinazione();
        request.setAttribute("PosEsa", controller.getEsito()[0]);
        request.setAttribute("PosErr", controller.getEsito()[1]);
        if(controller.getEsito()[0]<3)
        {
            request.getRequestDispatcher("jsp/result.jsp").forward(request,response);
        }else
        {
            request.getRequestDispatcher("jsp/vittoria.jsp").forward(request,response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("scelta").equals("SI"))
        {
            response.sendRedirect("Ciclo");
        }else if(request.getParameter("scelta").equals("NO"))
        {
            response.sendRedirect("Saluti");

        }
    }
}
