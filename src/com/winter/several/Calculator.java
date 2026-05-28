package com.winter.several;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calculator class started");
	}
	public int add(int a, int b) {
		return a+b;
}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public int add(int num1, int num2) {
		int sum;
		sum=num1 + num2;
		return sum;
	}
	
	public int addAll(int num1, int num2, int num3) {
		int sum;
		sum=num1 + num2 + num3 ;
		return sum;
	}
}
