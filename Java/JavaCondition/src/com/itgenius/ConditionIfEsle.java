package com.itgenius;

public class ConditionIfEsle {

	public static void main(String[] args) {

		boolean permission = true;
		String username = "admin";
		String password = "1234";
		String type = "admin";

		// ��¹���͹䢵�Ǩ�ͺ username �Ѻ password
		if (username == "admin" && password == "1234") {

			// ��Ǩ������Ѻ͹حҵ������ҹ�����ѧ
			if (permission) {
				// ��Ǩ���͹������ user ���� admin �¡���� type ����˹����
				if (type == "admin") {
					System.out.println("Your are Administrator");
				} else {
					System.out.println("Your are normal user");
				}
			} else {
				System.out.println("Your are not permission");
			}

		} else {
			System.out.println("Login fail! Username or Password Wrong.");
		}

	}

}
