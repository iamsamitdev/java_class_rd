package com.itgenius;

import java.sql.Statement;

import com.itgenius.db.ConnectMySQL;

public class AddnewMember {

	public static void main(String[] args) {
		try {
			// ���¡��ҹ class connect mysql
			ConnectMySQL db = new ConnectMySQL();
			
            // ���ҧ����� statement ����Ѻ�����¹ sql
			Statement stm = db.connect().createStatement();
			
			// ��¹����� sql select form member
            String sql = "INSERT INTO members(fullname,email,tel) " +
                    "VALUES('John Deo','john@gmail.com','0737982922')";
            
         // Query data from table member
            int result = stm.executeUpdate(sql);
            
            if(result ==1){
                System.out.println("Add member success");
            }else{
                System.out.println("Add member fail");
            }
            
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
