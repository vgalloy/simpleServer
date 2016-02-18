package com.vgalloy.tag.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/02/16.
 */
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("value", 2);
        req.getRequestDispatcher("WEB-INF/view/simple.jsp").forward(req, resp);
    }
}
