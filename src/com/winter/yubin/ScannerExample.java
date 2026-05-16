package com.winter.yubin;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("y 값 입력: ");
		String styY = scanner.nextLine();
		int x = Integer.parseInt(styY);
		
		System.out.println("값");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y " + result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열");
			String data = scanner.nextLine();
			if (data.equals("q")) {
				break;
			}
			 System.out.println("풀력 문자열: " + data);
		    System.out.println();
		  }
		    
		   System.out.println("종료");
	}
}
