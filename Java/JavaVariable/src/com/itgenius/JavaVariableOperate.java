package com.itgenius;

public class JavaVariableOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 200;
		int vat = 7;
		int total_price = price + (price * vat / 100);
		System.out.println("�Ҥ��Թ��� = " + price);
		System.out.println("Vat = " + vat + "%");
		System.out.println("�Ҥ���� Vat = "+ total_price);
	}

}
