package ch06.sec07.exam02;

// 💡 Korean 객체를 만들기 위한 설계도 클래스 정의
class Korean {
	// 필드(속성) 선언
	String nation = "대한민국"; // 국적은 기본값으로 고정
	String name;
	String ssn;

	// 💡 매개변수가 있는 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

// ==========================================

public class KorExample {
	public static void main(String[] args) {
		// 1. 첫 번째 Korean 객체(k1) 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		
		// k1 객체 데이터 읽기 및 출력
		System.out.println("k1.nation : " + k1.nation); // 💡 오타 수정: 맨 뒤 괄호 제거
		System.out.println("k1.name : " + k1.name);     // 💡 수정: 이름 출력 추가
		System.out.println("k1.ssn : " + k1.ssn);       // 💡 추가: 주민번호 출력
		System.out.println();
		
		// --------------------------------------------------
		// 2. 💡 요청하신 '또 다른 Korean 객체(k2)' 생성 코드
		// --------------------------------------------------
		Korean k2 = new Korean("김이썬", "980512-2345678");
		
		// k2 객체 데이터 읽기 및 출력
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}  