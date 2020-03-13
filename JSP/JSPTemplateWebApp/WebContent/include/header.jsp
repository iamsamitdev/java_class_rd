<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header">
    <div class="menu">
        <ul>
            <li><a href="mainpage.jsp">Home</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="service.jsp">Service</a></li>
            <li><a href="contact.jsp">Contact</a></li>
        </ul>
    </div>
    <div class="searchbox">
        <input type="text" placeholder="ป้อนคำค้นหา">
        <button>ค้นหา</button>
        
        <%
            out.println("<span class='profile'>"+session.getAttribute("session_login")+"</span>");
        %>
        
        <a href="logout.jsp" class="btn-logout">Logout</a>
        
    </div>
</div>