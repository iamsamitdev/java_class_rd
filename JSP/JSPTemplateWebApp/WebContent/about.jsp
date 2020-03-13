<%@include file="include/authen.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <!-- Column Left-->
            <%@include file="include/sidemenu.jsp" %>

            <!-- Column Right-->
            <div class="right-content">
                <%@include file="include/header.jsp" %>
                
                <!-- Content-->
                <div class="content">
                    <h1>This is about page</h1>
                    <p>Place to content here...</p>
                </div>
                
            </div>
            
            <!--Footer-->
            <%@include file="include/footer.jsp" %>
            
        </div> <!--container-->
    </body>
</html>
