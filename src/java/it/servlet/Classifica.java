package it.servlet;

import com.mysql.cj.xdevapi.SqlDataResult;
import it.Context;
import it.controllers.ControllerClassifiche;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Classifiche")
public class Classifica extends HttpServlet {
    private ControllerClassifiche controllerClassifiche;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.controllerClassifiche= Context.getInstance().getControllerClassifiche();

             //da richiamare classifica e basta!!

    }
}
