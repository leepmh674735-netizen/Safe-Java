package ch06.sec07.exam02;

// 💡 Calculator 객체를 만들기 위한 설계도 클래스 정의
class Calculator {
	// 💡 정사각형의 넓이를 구하는 메소드 (매개변수 1개)
	double areaRectangle(double width) {
		return width * width;
	}

	// 💡 직사각형의 넓이를 구하는 메소드 (매개변수 2개 - 메소드 오버로딩)
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

// ==========================================

public class CalculatorExample {
	public static void main(String[] args) {
		// 객체 생성
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		// 💡 수정: 오타가 있던 메소드명을 areaRectangle로 바르게 고쳤습니다.
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2); // 💡 수정: 누락되었던 + 연산자를 추가했습니다.
	}
}