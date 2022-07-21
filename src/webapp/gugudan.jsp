<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.ll.exam.Rq"%>
<meta charset="UTF-8">
<%
    request.setCharacterEncoding("utf-8");
    Rq rq = new Rq(request,response);
    int dan = rq.getIntParam("dan",9);
    int limit = rq.getIntParam("limit",9);
%>
    <h1><%=dan%>단</h1>
<%  for (int i = 1; i <= limit; i++){   %>
<h2><%=dan%> * <%=i%> = <%=dan*i%></h2>
<%  }   %>