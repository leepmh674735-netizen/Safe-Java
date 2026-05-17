package ch06.sec07.exam02;

// 💡 부모 클래스 (일반 비행기) 정의
class Airplane {
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
}

// ==========================================

// 💡 수정 1: 클래스 이름 오타 수정 및 부모 클래스 상속(extends Airplane) 추가
public class SupersonicAirplane extends Airplane {
	
	// 상태를 나타내는 상수 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 기본 비행 모드는 일반 비행(NORMAL)으로 설정
	public int flyMode = NORMAL;
	
	// 💡 부모 클래스의 fly() 메소드를 재정의(Override)
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			// 💡 부모 클래스(Airplane)의 fly() 메소드를 호출
			super.fly();
		}
	} // 💡 수정 2: 하단에 무작위로 복사되어 있던 중복 중괄호(})들을 깔끔하게 정리했습니다.
}