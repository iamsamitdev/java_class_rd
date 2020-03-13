package com.itgenius;

import java.io.File;

public class JavaCreateFile {

	public static void main(String[] args) {
		
		// การเขียนคำสั่งอ่าน path ปัจจบัน
		String current_path = System.getProperty("user.dir");
		
		// System.out.println(current_path);
		
		// สร้างไฟล์ลงใน folder ด้วย java
		try {
			File file = new File(current_path+"/datafile/data.txt");
			if(file.createNewFile()) {
				System.out.println("File Create Success");
			}else {
				System.out.println("Error file already exists");
			}
		} catch (Exception e) {
			// System.out.println("มีข้อผิดพลาดในโปรแกรม");
			e.printStackTrace();
		}
		

	}

}
