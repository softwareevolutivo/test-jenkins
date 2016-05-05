package ec.com.se.business;

import java.io.IOException;

/**
 * Created by pazfernando on 5/4/16.
 */
public class Atacar extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Hit hit = new Hit();
        Integer life = new Integer(Integer.valueOf(request.getParameter("life")).intValue() - hit.pushPunch());
        request.setAttribute("life", life);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
