package com.itgenius;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		int num = 1;
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		
		// Infinity loop
		int num = 100;
		while(true) {
			if(num % 10 == 0) {
				System.out.println(String.format("%03d", num));
			}else {
				System.out.print(String.format("%03d ", num));
			}
			num++;
		}
		 */
		
		// Game guese lucky number
		int lucky_number = 68;
		
		while(true) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("��͹����Ţ���⪤�� :");
			int data = input.nextInt();
			
			// ��¹���͹䢵�Ǩ��ҷ�������ҵ���Ţ�� �ѹ�ҡ�������͹��¡����Ţ lucky_number
			if(data < lucky_number) {
				System.out.println("�Ţ����ѹ����� �ͧ������");
			}else if(data > lucky_number) {
				System.out.println("�Ţ����ѹ�ҡ� �ͧ������");
			}else if(data == lucky_number) { 
				System.out.println("������� �١��ͧ���� �س��ͼ��⪤��");
				break; // �͡�ҡ loop
			}
			
		}
		
		
	}

}
