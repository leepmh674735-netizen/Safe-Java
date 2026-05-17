package ch06.sec07.exam02;

// 💡 1. 부모 역할을 하는 RemoteControl 인터페이스 정의
interface RemoteControl {
	// 상수 필드 (인터페이스 상수는 public static final이 자동 생략됨)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드 (구현 클래스에서 반드시 @Override 해야 함)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

// ==========================================

// 💡 2. 인터페이스를 구현한 Television 클래스
public class Television implements RemoteControl {
	// 필드 선언
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// 💡 수정: 누락된 중괄호와 최소 볼륨(MIN_VOLUME) 제한 로직을 바르게 추가했습니다.
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; // 최대값 제한
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME; // 최소값 제한
		} else {
			this.volume = volume; // 정상 범위일 때 값 대입
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
} 