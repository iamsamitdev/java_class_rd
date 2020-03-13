package com.itgenius.crud;

import java.sql.Statement;

import com.itgenius.db.ConnectMySQL;

public class AddNewMember {

	public static void main(String[] args) {
		
		try {
			// เรียกใช้งาน class connect mysql
			ConnectMySQL db = new ConnectMySQL();
			
			// สร้างตัวแปร statement สำหรับไว้เขียน sql
			Statement stm = db.connect().createStatement();
			
			// เขียนคำสั่ง sql เพิ่มข้อมูลลงตาราง members
			String sql = "INSERT INTO members(fullname,email,tel) VALUES('สามิตร โกยม','smkss@gmail.com','087555555')";
			
			// คำสั่งบันทึกลงตาราง
			int result = stm.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("เพิ่มรายการใหม่เรียบร้อย");
			}else {
				System.out.println("ไม่สามารถเพิ่มรายใหม่ได้");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
