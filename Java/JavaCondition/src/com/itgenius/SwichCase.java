package com.itgenius;

import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {

		// �Ѻ��������Ţ��鹨ҡ user
		Scanner reader = new Scanner(System.in);
		System.out.print("What's floor do you want to go ? : ");
		String floor = reader.nextLine();

		// System.out.println(floor);

		// ��¹���͹䢵�Ǩ�ͺ�Ţ��������͹�����
		switch (floor.toUpperCase()) {
			case "G":
				System.out.println("Elevator is going to ground floor");
				break;
			case "1":
				System.out.println("Elevator is going to first floor");
				break;
			case "2":
				System.out.println("Elevator is going to second floor");
				break;
			case "3":
				System.out.println("Elevator is going to third floor");
				break;
			default:
				System.out.println("Elevator don't know where to go");
				break;
		}
	}

}
