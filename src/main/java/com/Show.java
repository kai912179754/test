package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

/**
 * Created by Administrator on 2017/6/6.
 */
@WebServlet("/show")
public class Show extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset-utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"utf-8\">");
        out.print("<title>home</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h3>kaikaikaikaikai123</h3>");
        out.print("</body>");
        out.print("</html>");
        out.flush();
    }
}
