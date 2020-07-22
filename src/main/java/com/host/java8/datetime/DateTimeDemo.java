package com.host.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.TimeZone;


public class DateTimeDemo {

	public static void main(String[] args) {
		
		//1. Same Date class in two pacakages in java.sql and java.util
		//Date date = new Date();
		
		//2. Formatting of date by using java.text.*;
		
		//3. Date classes are not thread safe 
		
		
		//JDK 8 Date TIme API
		
		//New Date time api is thread safe and support time zones 
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1991, Month.JULY, 1);
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		LocalTime pstTime = LocalTime.now(ZoneId.of("PST8PDT"));
		System.out.println("PST Time Zone "+pstTime);
		
		LocalDateTime pstDateTime = LocalDateTime.now(ZoneId.of("PST8PDT"));
		System.out.println("PST Date Time Zone "+pstDateTime);
	}

}
