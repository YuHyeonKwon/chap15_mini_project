package com.javalab;

import java.util.Scanner;

/**
 * 콘솔 계산기
 */
public class RunMain3 {

	public static void main(String[] args) {

		// 키보드에서 입력을 받아들이는 객체 생성
		Scanner in = new Scanner(System.in);
		int option;
		int number1, number2;	// 키보드에서 받아들일 두 숫자 저장용 변수
		
		while(true) {
			System.out.println("Enter your choice 1.덧셈   2.뺄셈   3.나눗셈   4.곱셈");
			option = Integer.parseInt(in.next());	// 입력 문자 읽기
			
			if(option ==1) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 + number2;
				System.out.println("덧셈 결과: " + sum);
			}else if(option ==2) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double minus = number1 - number2;
				System.out.println("뺄셈 결과: " + minus);
			}else if(option ==3) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double division = number1 / number2;
				System.out.println("나눗셈 결과: " + division);
			}else if(option ==4) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double multiplication = number1 * number2;
				System.out.println("곱셈 결과: " + multiplication);
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 0-정상적으로 종료
				break;
			}
		} // end while 
		
		in.close();
	} // main e

	private static void askForNumbers() {
		System.out.println("두 개의 숫자를 입력하세요.");
		System.out.println();
	}

} // class e
