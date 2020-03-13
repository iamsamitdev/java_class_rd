package com.itgenius;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	
	// �ѧ��ѹ���ͺ Load JDBC Driver
	public static void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load driver success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �ѧ��ѹ�������Ͱҹ������ MySQL
	public static void connectmysql() {
		String host = "localhost";
		String user = "root";
		String pass = "1234";
		String dbname = "javadb";
		String port = "3306";
		
		String url = "jdbc:mysql://"+host+":"+port+"/"+dbname+"?serverTimezone=UTC&useSSL=false";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			if(conn != null) {
				System.out.println("Connnect database successful");
			}else {
				System.out.println("Fail! to connection");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connection();
		connectmysql();
	}

}
