package com.winter.waste;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
			
	    String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secodNum = ssn.substring(7);
		System.out.println(secodNum);
	}
}
