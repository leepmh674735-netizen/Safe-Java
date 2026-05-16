package com.winter.waste;

public class NullPointExceptionExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] =  10;    //NullPointerException
		
		String str = null;
		//System.out.pritln("총 문자 수: " + str.length() );//NullPointerException
	}
}