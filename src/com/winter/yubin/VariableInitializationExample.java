package com.winter.yubin;

public class VariableInitializationExample {
	public static void main(String[] args) {
		// 💡 수정: 변수 value를 선언하면서 동시에 30으로 초기화합니다.
		int value = 30; 
		
		// 이제 value에 30이 들어있으므로 정상적으로 10이 더해집니다.
		int result = value + 10;
		
		// 출력 결과: 40
		System.out.println(result);
	}
}