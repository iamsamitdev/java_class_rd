package com.itgenius;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		// Class สำหรับดึงวันที่และเวลาของเครื่อง
		Date date_now = new Date();
		// แสดงผลวันที่และเวลา
		System.out.println(date_now);
		
		// จัดรูปแบบวันที่ตามที่เราต้องการ
		// String  pattern = "dd/MM/yyyy";
		String  pattern = "EEEEE dd/MM/yyyy HH:mm:sss";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		System.out.println(sf.format(date_now));
		

	}

}
