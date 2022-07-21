package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Rq rq = new Rq(request,response);

        int dan = rq.getIntParam("dan",9);
        int limit = rq.getIntParam("limit",9);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }
    }
}


//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html; charset=utf-8");
//
//        int dan = Integer.parseInt(request.getParameter("dan"));
//        int limit = Integer.parseInt(request.getParameter("limit"));
//
//        response.getWriter().append("<h1>%d단</h1>\n".formatted(dan));
//
//        for (int i = 1; i <= limit; i++) {
//        response.getWriter().write("<div>%d * %d = %d</div>\n".formatted(dan,i,dan*i));