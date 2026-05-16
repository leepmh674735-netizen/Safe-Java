package com.winter.yubin;

public class PrintExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품 가격", value);
		System.out.printf("상품 가격", value);
		System.out.printf("상품 가격", value);
		System.out.printf("상품 가격", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 원의 넓이");
		
		String name = "지수";
		String job = "도적";
		System.out.printf("%6nd : %10s : %10s\n", 1, name, job);
	}
 }