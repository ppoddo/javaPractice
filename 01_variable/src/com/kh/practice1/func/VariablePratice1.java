package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePratice1 {
	public void method() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("이름을 입력하세요 : ");
	 String name = sc.nextLine();
	 
	 System.out.print("성별을 입력하세요(남/여) : ");
	 char gender = sc.nextLine().charAt(0);
				
	 System.out.print("나이를 입력하세요 : ");
	 int age = sc.nextInt();
	 
	 System.out.print("키를 입력하세요(cm) : ");
	 double rangth = sc.nextDouble();
	 
	 	System.out.println("키" + rangth + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 ^^");
		
		
		
		
	}
	
}
