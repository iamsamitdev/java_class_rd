<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(request.getParameter("submit") != null){
        // การรับค่าจากฟอร์ม
        // request.getParameter("input_name");

        String getUsername = request.getParameter("username");
        String getPassword = request.getParameter("password");

        //out.println("Username is "+getUsername);
        // out.println("Password is "+getPassword);
        // เขียนเงื่อนไขตรวจว่า username / password ถูกหรือไม่
        if (getUsername.equals("admin") && getPassword.equals("1234")) {
            out.println("Login success");
            // ทำการส่งไปหน้า mainpage.jsp
            response.sendRedirect("mainpage.jsp");
            // เก็บข้อมูลการ login ลงตัวแปรประเภท session
            session.setAttribute("session_login", getUsername);
        } else {
            out.println("Login fail !!");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style type="text/css">
            .container{
                width: 400px;
                margin-left: auto;
                margin-right: auto;
            }

            h1{
                text-align: center;
                margin-top: 150px;
            }

            form{
                border:1px solid grey;
                padding: 40px;
            }

            .form-group{
                margin-bottom: 10px;
            }

            label{
                display: inline-block;
                width: 100px;
            }

            input[type=text],input[type=password]{
                width: 200px;
                padding: 5px;
                font-size: 18px;
            }

            input[type=submit]{
                padding: 5px;
                font-size: 18px;
            }
        </style>
    </head>
    <body>

        <div class="container">
            <h1>Login to backend</h1>
            <form name="loginform" method="post" action="login.jsp">
                <div class="form-group">
                    <label>Username: </label>
                    <input type="text" name="username">
                </div>

                <div class="form-group">
                    <label>Password: </label>
                    <input type="password" name="password">
                </div>

                <div class="form-group">
                    <label></label>
                    <input type="submit" name="submit" value="Login">
                </div>
            </form>
        </div>

    </body>
</html>
