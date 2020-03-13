<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
// เขียนตรวจว่ามี session จากการ login มาหรือไม่
if(session.getAttribute("session_login") == null){
    // ส่งกลับไปหน้า login
    response.sendRedirect("login.jsp");
}

%>
