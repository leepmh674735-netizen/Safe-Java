package com.library.example;

// 프로그램의 시작점이 되는 '실행' 클래스입니다.
public class MainApp {
    
    // JVM(자바 가상 머신)이 프로그램을 실행할 때 이 main 메소드를 가장 먼저 찾습니다.
    public static void main(String[] args) {
        System.out.println("--- 계산기 프로그램을 시작합니다 ---");
        
        // 💡 라이브러리 클래스를 객체(부품)로 생성하여 사용합니다.
        Calculator cal = new Calculator();
        
        int sum = cal.add(10, 20);
        int diff = cal.subtract(50, 30);
        
        System.out.println("더하기 결과: " + sum);
        System.out.println("빼기 결과: " + diff);
        
        System.out.println("--- 프로그램이 종료되었습니다 ---");
    }
}