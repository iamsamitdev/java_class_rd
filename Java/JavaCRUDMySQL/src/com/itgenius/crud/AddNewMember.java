package com.itgenius.crud;

import java.sql.Statement;

import com.itgenius.db.ConnectMySQL;

public class AddNewMember {

	public static void main(String[] args) {
		
		try {
			// ���¡��ҹ class connect mysql
			ConnectMySQL db = new ConnectMySQL();
			
			// ���ҧ����� statement ����Ѻ�����¹ sql
			Statement stm = db.connect().createStatement();
			
			// ��¹����� sql ����������ŧ���ҧ members
			String sql = "INSERT INTO members(fullname,email,tel) VALUES('���Ե� ���','smkss@gmail.com','087555555')";
			
			// ����觺ѹ�֡ŧ���ҧ
			int result = stm.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("������¡���������º����");
			}else {
				System.out.println("�������ö�������������");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
