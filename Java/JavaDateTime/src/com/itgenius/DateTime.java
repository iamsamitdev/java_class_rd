package com.itgenius;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		// Class ����Ѻ�֧�ѹ���������Ңͧ����ͧ
		Date date_now = new Date();
		// �ʴ����ѹ����������
		System.out.println(date_now);
		
		// �Ѵ�ٻẺ�ѹ����������ҵ�ͧ���
		// String  pattern = "dd/MM/yyyy";
		String  pattern = "EEEEE dd/MM/yyyy HH:mm:sss";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		System.out.println(sf.format(date_now));
		

	}

}
