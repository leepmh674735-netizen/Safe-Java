package ch06.sec07.exam02;

// 💡 1. 부모 역할을 하는 인터페이스 선언
interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

// 💡 2. 인터페이스를 구현한 Television 클래스
class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() { System.out.println("TV를 켭니다."); }

	@Override
	public void turnOff() { System.out.println("TV를 끕니다."); }

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME) this.volume = MIN_VOLUME;
		else this.volume = volume;
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}

// 💡 3. 인터페이스를 구현한 Audio 클래스
class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() { System.out.println("Audio를 켭니다."); }

	@Override
	public void turnOff() { System.out.println("Audio를 끕니다."); }

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME) this.volume = MIN_VOLUME;
		else this.volume = volume;
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}

// ==========================================
// 💡 4. 제시해주신 실행 클래스 (파일명과 일치해야 하므로 public 장착)
public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println(); // 구분을 위한 줄바꿈
		
		// Audio 객체를 생성하고 동일한 인터페이스 변수에 갈아끼우기 (다형성)
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}