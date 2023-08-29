package com.kh.example.chap03.branch;

import java.util.Scanner;

public class Break {
	public void method() {
		//	문자열을 입력 받아 글자 개수 출력
		//	end가 입력되면 반복 종료
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("end")) {
				break;
			}
			System.out.print(str + "의 개수는 " + str.length());
		}
	}
}
