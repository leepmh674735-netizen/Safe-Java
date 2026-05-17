package ch06.sec07.exam02;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언하고 구현 객체 대입 (다형성)
		RemoteControl rc = new Television();
		
		// 인터페이스에 선언된 메소드 호출 -> Television의 메소드가 실행됨
		rc.turnOn();
		
		// 볼륨 조절 테스트
		rc.setVolume(5);   // 출력: 현재 TV 볼륨: 5
		rc.setVolume(12);  // 출력: 현재 TV 볼륨: 10 (최대치 제한 작동)
		rc.setVolume(-3);  // 출력: 현재 TV 볼륨: 0  (최소치 제한 작동)
		
		rc.turnOff();
	}
}