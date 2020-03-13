<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Clear session login
    session.removeAttribute("session_login");
    // Redirect กลับหน้า login
    response.sendRedirect("login.jsp");
%>