package com.itgenius;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		// ��¹����� ǹ�ٻ ����Ţ�ӹǹ 1-20
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
		
		
		
		// �Ҽ�������� loop for
		int sum = 0;
		for(int num = 1; num <= 10; num++) {
			sum += num;
		}
		
		System.out.println(sum);
		
		*/
		
		// �Ѻ��Ҩҡ ����������ͧ 5 ����
		int sum = 0;
		for(int num = 1; num <= 5; num++) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number "+ num+ ": ");
			int data = input.nextInt();
			
			sum += data;
		}
		
		System.out.println("�������ҡѺ " + sum);
		

	}

}
