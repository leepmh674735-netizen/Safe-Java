package ch06.sec07.exam02;

// 💡 1. 부모 클래스 (사람) 정의
class Person {
	public String name;

	// 생성자
	public Person(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println(name + "이(가) 걷습니다.");
	}
}

// 💡 2. 자식 클래스 (학생) 정의
class Student extends Person {
	public int studentNo;

	// 생성자 (부모 생성자 호출)
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	public void study() {
		System.out.println(name + " 학생이 공부를 합니다.");
	}
}

// ==========================================

public class InstanExample {
	// 매개변수로 들어온 객체가 어떤 클래스로 만들어졌는지 확인하는 메소드
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		// 💡 자바 14부터 지원하는 편리한 instanceof 패턴 매칭 문법입니다.
		// person이 Student 타입이 맞다면 자동으로 student 변수에 대입해 줍니다.
		if (person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		// 💡 수정: 소문자 person을 대문자 Person으로 고치고 끝에 세미콜론(;)을 붙였습니다.
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		// Student 객체를 부모 타입인 Person 변수에 대입 (다형성)
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	} // 💡 수정: 하단의 찌꺼기 중괄호를 깔끔하게 정리했습니다.
}