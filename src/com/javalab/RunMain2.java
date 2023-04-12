package com.javalab;

import java.util.Scanner;

/**
 * 콘솔 메뉴 if문 사용
 */
public class RunMain2 {

	public static void main(String[] args) {

		// 키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		int option;
		
		while (true) {
			System.out.println("Enter your choice 1.덧셈   2.뺄셈   3.나눗셈   4.곱셈");
			option = Integer.parseInt(in.next());	// 문자열이 들어오면 정수로 변환시켜준다.
			
			switch (option) {
			case 1 :
				System.out.println("1. 덧셈");
				break;
			}
		}
	} // main e

	private static void askForNumbers() {
		System.out.println("두 개의 숫자를 입력하세요.");
		System.out.println();
	}
} // class e
