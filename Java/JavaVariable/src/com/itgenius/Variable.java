package com.itgenius;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// การประกาศตัวแปร
		int age = 35; // ตัวแปรเก็บข้อมูลแบบตัวเลขจำนวนเต็ม
		byte vat = 7; // เลขจำนวนเต็มไม่เกิน 127
		long data = 23908930893903L; // เก็บข้อมูลขนาดยาว
		short number = 379; // เก็บข้อมูล 32,000
		float price = 300.50f; // เก็บทศนิยม
		double total = 1200.75; // เก็บทศนิยมแบบยาว
		char text = 'A'; // เก็บตัวอักษรเพียง  1 อักษร
		String name = "Samit Koyom"; // เก็บตัวอักษรขนาดยาวไม่จำกัด
		boolean status = false; // เก็บข้อมูลแบบจริง/เท็จ true / false
		
		// แสดงผลตัวแปร
		System.out.println(age);
		System.out.println(vat);
		System.out.println(data);
		System.out.println(number);
		System.out.println(price);
		System.out.println(total);
		System.out.println(text);
		System.out.println(name);
		System.out.println(status);
		
	}

}
