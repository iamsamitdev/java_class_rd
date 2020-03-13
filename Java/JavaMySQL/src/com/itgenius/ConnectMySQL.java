package com.itgenius;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {

	public static void main(String[] args) {
		
		try {
			
			// Step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load driver success");
			
			// Step 2: Connect MySQL
			// ��˹����������Ѻ����������Ͱҹ������
			String host = "localhost";
			String user = "root";
			String pass = "1234";
			String dbname = "javadb";
			String port = "3306";
			
			String url = "jdbc:mysql://"+host+":"+port+"/"+dbname+"?serverTimezone=UTC";
			Connection connect = DriverManager.getConnection(url,user,pass);
			System.out.println("Connect database success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
