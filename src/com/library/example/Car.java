package com.library.example;

// 💡 수정: Car 클래스에서 사용할 부품 클래스들을 먼저 정의해 줍니다.
class Body { }
class Engine { }
class Tire { }

public class Car {
	// 💡 수정: main 메소드에서 사용할 Car 클래스의 '필드(데이터 저장 공간)'들을 선언합니다.
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	int rpm;
	
	// 부품을 담을 필드 선언
	Body body;
	Engine engine;
	Tire tire;

	// 프로그램의 시작점
	public static void main(String[] args) {
		// 1. Car 클래스를 이용해서 실제 자동차 객체(myCar) 생성
		Car myCar = new Car();
		
		// 2. 부품 객체들도 생성해서 myCar에 조립하기
		myCar.body = new Body();
		myCar.engine = new Engine();
		myCar.tire = new Tire();
		
		// 3. 고유 데이터 및 상태 데이터 필드에 값 저장하기
		myCar.company = "현대자동차";
		myCar.model = "아이오닉 6";
		myCar.color = "화이트";
		myCar.maxSpeed = 185;
		
		myCar.speed = 60; // 현재 주행 속도
		myCar.rpm = 2000; // 현재 RPM
		
		// 4. 필드에 저장된 값들을 출력해서 확인하기
		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed + " km/h");
		System.out.println("-------------------------");
		System.out.println("현재속도: " + myCar.speed + " km/h");
		System.out.println("현재 RPM: " + myCar.rpm);
	}
}