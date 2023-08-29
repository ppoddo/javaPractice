package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void input1() {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("문자열을 입력해주세요 : ");
		String str = sc.next(); 		//sc.next가 문자열로써 사용자의 입력 값을 받고나서 str이라는 메소드에 값을 저장
			System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();		
										//	long num1 = sc.nextInt();   //int 에서 long으로 자동형변환 된거다.
										//String str2 = sc.nextInt(); // 틀린 예제, 같은 자료형이 아니므로 자동형변환이 안된다
		
			System.out.printf("%s, %d", str, num);
	}
	

}
