package com.itgenius;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		// เขียนคำสั่ง วนลูป ตัวเลขจำนวน 1-20
		/*
		for (int num = 20; num >= 1; --num) {
			System.out.print(num+" ");
		}
		
		
		for (int num = 1; num <= 300; num++) {
			if(num % 10 == 0) {
				System.out.println(String.format("%03d", num));
			}else {
				System.out.print(String.format("%03d ", num));
			}
		}
		
		
		
		// หาผลรวมด้วย loop for
		int sum = 0;
		for(int num = 1; num <= 10; num++) {
			sum += num;
		}
		
		System.out.println(sum);
		
		*/
		
		// รับค่าจาก ผู้ใช้ต่อเนื่อง 5 ครั้ง
		int sum = 0;
		for(int num = 1; num <= 5; num++) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number "+ num+ ": ");
			int data = input.nextInt();
			
			sum += data;
		}
		
		System.out.println("ผลรวมเท่ากับ " + sum);
		

	}

}
