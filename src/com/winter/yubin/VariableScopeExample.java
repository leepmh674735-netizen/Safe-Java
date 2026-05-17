package com.winter.yubin;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0; // 💡 수정: if문 밖에서도 v2를 사용할 수 있도록 미리 선언 및 초기화
		
		if (v1 > 10) {
			v2 = v1 - 10; // if문 안에서는 값만 변경합니다.
		}
		
		// 💡 수정: 변수 스코프가 해결되어 이제 v2를 정상적으로 사용할 수 있습니다.
		// v1(15) + v2(5) + 5 = 25가 v3에 저장됩니다.
		int v3 = v1 + v2 + 5; 
		
		// 출력해서 결과 확인
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
	}
}