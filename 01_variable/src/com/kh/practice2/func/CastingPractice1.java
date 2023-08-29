package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String str = sc.nextLine();
		//int unicode = Integer.parseInt(str);// = 잘못된 접근
		char ch = str.charAt(0);
		System.out.println(ch + " unicode : " + (int)ch);
		
						
	}
	
	
	
}
