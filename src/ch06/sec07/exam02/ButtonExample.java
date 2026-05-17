package ch06.sec07.exam02;

// 💡 1. 중첩 인터페이스를 가진 Button 클래스 정의
class Button {
	// 중첩 인터페이스 정의 (버튼을 클릭했을 때 실행될 규칙)
	public static interface ClickListener {
		void onClick();
	}
	
	// 필드 선언 (인터페이스 타입)
	private ClickListener clickListener;
	
	// 메소드: Setter (외부에서 구현 객체를 받아옴)
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 메소드: 버튼이 클릭되는 동작을 시뮬레이션
	public void click() {
		if (this.clickListener != null) {
			this.clickListener.onClick(); // 연결된 객체의 onClick 실행
		}
	}
}

// ==========================================

// 💡 2. 실행 클래스
public class ButtonExample {
	public static void main(String[] args) {
		
		// --------------------------------------------------
		// [OK 버튼 구현 작업]
		// --------------------------------------------------
		// 1. OK 버튼 객체 생성
		Button btnOk = new Button();
		
		// 2. OK 버튼 클릭 이벤트를 처리할 로컬 클래스 정의
		class OkListener implements Button.ClickListener {
			@Override 
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}		
		}
		
		// 3. OK 버튼에 리스너 객체 주입 및 클릭 테스트
		btnOk.setClickListener(new OkListener());
		btnOk.click(); // 💡 수정: 대소문자 통일 (btnOK -> btnOk)
		
		
		// --------------------------------------------------
		// [Cancel 버튼 구현 작업]
		// --------------------------------------------------
		// 1. 💡 수정: 누락되었던 취소 버튼 객체를 생성합니다.
		Button btnCancel = new Button();
		
		// 2. Cancel 버튼 클릭 이벤트를 처리할 로컬 클래스 정의
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		} // 💡 수정: 메소드와 클래스의 중괄호를 여기서 정확히 닫아줍니다.
		
		// 3. 💡 수정: 메소드 내부에서 탈출시켜 메인 흐름에서 버튼 세팅 및 클릭을 수행합니다.
		btnCancel.setClickListener(new CancelListener()); // 오타 교정
		btnCancel.click();
	}
}