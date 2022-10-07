package com.simplilearn.datecalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		System.out.println("Current Date is :"+ sft.format(date));
		
	}

}
