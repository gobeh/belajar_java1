package com.ahmad.sofwan.belajar.java1;

import org.joda.time.DateTime;

public class DemoJodaTime{

	public static void main (String[] x){
		DateTime sekarang = new DateTime();
		DateTime tigaBulanLagi = sekarang.plusMonths(3);

		System.out.println("Tiga bulan dari sekarang :"+tigaBulanLagi);
	}
}