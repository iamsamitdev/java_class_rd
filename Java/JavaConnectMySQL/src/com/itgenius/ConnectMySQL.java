package com.itgenius;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {

	public static void main(String[] args) {
		
		try {
			// Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load driver succcess");
			// Connect Database
			String host = "localhost";
			String user = "root";
			String pass = "1234";
			String dbname = "javadbdemo";
			String port = "3306";
			
			String url = "jdbc:mysql://"+host+":"+port+"/"+dbname+"?serverTimezone=UTC&useSSL=false";
			Connection connect = DriverManager.getConnection(url, user, pass);
			if(connect != null) {
				System.out.println("Connect database success");
			}else {
				System.out.println("Connect database fail");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
