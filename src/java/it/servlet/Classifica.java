package it.servlet;

import it.Context;
import it.controllers.ControllerClassifiche;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Classifica")
public class Classifica extends HttpServlet {
    private ControllerClassifiche controllerClassifiche;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Sono nel doGet di CLassifica");
        this.controllerClassifiche= Context.getInstance().getControllerClassifiche();
        this.controllerClassifiche.classificaUser();
             //da richiamare classifica e basta!!

    }
}
