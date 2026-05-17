package ch05.sec12;

// 💡 1. 사용자 정의 예외 클래스 선언 (잔고 부족 예외)
class InsufficientException extends Exception {
	public InsufficientException() { }
	public InsufficientException(String message) {
		super(message); // 부모 Exception 클래스로 에러 메시지 전달
	}
}

// ==========================================

// 💡 2. 은행 계좌 클래스 (설계도)
class Account {
	private long balance; // 잔고

	public long getBalance() {
		return balance;
	}

	// 예금하기
	public void deposit(int money) {
		balance += money;
	}

	// 출금하기 (잔고가 부족하면 예외를 던짐/throws)
	public void withdraw(int money) throws InsufficientException {
		if (balance < money) {
			// 💡 잔고가 부족하면 내가 만든 예외를 강제로 발생시킵니다.
			throw new InsufficientException("잔고 부족: " + (money - balance) + "원이 모자랍니다.");
		}
		balance -= money;
	}
}

// ==========================================

// 💡 3. 실행 클래스
public class AccountExample { // 💡 수정: 클래스명 오타 수정 (Accout -> Account)
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(1000);
		System.out.println("예금액: " + account.getBalance()); // 💡 수정: 변수명 오타 수정 (accout -> account)
		
		// 출금하기 시도
		try {
			account.withdraw(3000); // 1000원밖에 없는데 3000원 출금 시도 (예외 발생!)
			System.out.println("출금 성공!"); // 예외가 발생하면 이 줄은 실행되지 않고 바로 catch로 넘어갑니다.
		} catch (InsufficientException e) { // 💡 수정: 누락되었던 catch 블록을 바르게 구현했습니다.
			// 예외 처리 코드 실행
			System.out.println(e.getMessage()); // 위에서 throw할 때 넣은 에러 메시지가 출력됩니다.
		}
	}
}