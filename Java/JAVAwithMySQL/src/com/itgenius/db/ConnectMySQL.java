package com.itgenius.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {

	public static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String host = "localhost";
		String user = "root";
		String pass = "1234";
		String dbname = "javadb";
		String port = "3306";
		
		String url = "jdbc:mysql://"+host+":"+port+"/"+dbname+"?serverTimezone=UTC&useSSL=false";
		
		Connection connect = DriverManager.getConnection(url, user, pass);
		return connect;
	}

}


