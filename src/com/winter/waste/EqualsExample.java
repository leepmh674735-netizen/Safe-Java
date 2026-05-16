package com.winter.waste;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = " pleasant";
		String strVar2 = "Jisu";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 첨조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("Pleasant");
		String strVar4 = new String("Jisu");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 stVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	 }
  }