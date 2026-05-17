package com.winter.yubin;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		int var6 = 128; // 💡 수정: 128을 담을 수 있도록 int 타입으로 변경
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6); // 💡 추가: var6 출력문 누락된 부분 보완
	}
}