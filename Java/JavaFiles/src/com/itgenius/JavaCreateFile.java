package com.itgenius;

import java.io.File;

public class JavaCreateFile {

	public static void main(String[] args) {
		
		// �����¹�������ҹ path �Ѩ��ѹ
		String current_path = System.getProperty("user.dir");
		
		// System.out.println(current_path);
		
		// ���ҧ���ŧ� folder ���� java
		try {
			File file = new File(current_path+"/datafile/data.txt");
			if(file.createNewFile()) {
				System.out.println("File Create Success");
			}else {
				System.out.println("Error file already exists");
			}
		} catch (Exception e) {
			// System.out.println("�բ�ͼԴ��Ҵ������");
			e.printStackTrace();
		}
		

	}

}
