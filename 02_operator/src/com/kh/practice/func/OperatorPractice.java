package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = num >= 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);		
	}	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");	//삼항연산자의 중첩을 활용
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원을 정하세요 : ");
		int hNum = sc.nextInt();
		
		System.out.print("사탕 개수를 정하세요 : ");
		int sNum = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (sNum/hNum));
		System.out.println("남은 사탕 개수 : " + (sNum%hNum));		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int Class = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char ch = sc.next().charAt(0);
		String gender = ch == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double grade = sc.nextDouble();
		
		System.out.println(year + "학년 " + Class + "반 " + number + "번 " + name
				+ " " + gender + "의 성적은 " + grade +"점입니다.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();			// age <= 어린이, 
		String result = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.print(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어성적을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학성적을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;	// 세과목의 합산
		double av = sum/3.0;			//세과목의 합산을 과목 수로 나눈 평균
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + av);
		
	//	num1,2, 3이 모두 > 40, av>60 이면 합격 or불합격//
		String result = num1 >= 40 && num2 >= 40 && num3 >= 40 && av >= 60? "합격" : "불합격";
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-) : ");
		char ch = sc.next().charAt(7);
		String result = ch == '1' ? "남자" : "여자";	//중요한 점은 ch는 문자이기 때문에 ''을 사용해야 숫자를 문자로 인지할 수 있음.
		System.out.println(result);	
		
	/*	강사님 풀이
	 * 	System.out.print("주민번호를 입력하세요(-) : ");
	 * 	String pId = sc.nextLine(); // 123456-2123456
	 *  char gender = pId.charAt(7);
	 *  String result = (gender == '1' || gender == '3') ? "남자"
	 *  	 : ((gender == '2' || gender == '4'); ? "여자" : "잘못 입력하셨습니다"); 
	 * 	System.out.prinln(result);		*/
											
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("비교할 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result = num3 > num2 || num3 <= num1; // num1이하거나 num2를 초과하면 true //둘다 만족못하면 boolean의 특성으로 자동 false
		System.out.println(result);		
		
	  /* 강사님 풀이
		 System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 || input > num2;	
		System.out.println(result); */ 
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수3을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
			//쉽지만 직관적으로 생각하는게 좋은 문제 비교연산자는 두 개의 항을 가지므로 두 개로 묶어서 해주기
		System.out.print(result);
		
	/* 강사님 풀이
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 ==  num2) && (num2 == num3);
		System.out.print(result);	*/
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int am = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int bm = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int cm = sc.nextInt();
		
		double ami = am + (am*0.4);
		double bmi = bm + (bm*0);
		double cmi = cm + (cm*0.15);		// 0.15의 실제 값과 1.15의 실제값이 조금 다르기 때문에 오차 발생가능.
											// 부동소수점  float 실수 = 부호bit 1bit 지수부 7bit 가수부 23bit
											// 고정소수점 

			  
		String resulta = ami >= 3000 ? "3000이상" : "3000미만" ;
		String resultb = bmi >= 3000 ? "3000이상" : "3000미만" ;
		String resultc = cmi >= 3000 ? "3000이상" : "3000미만" ;
		
		System.out.println("A사원의 연봉/연봉+a : " + am + "/" + ami + "\n" + resulta);
		System.out.println("B사원의 연봉/연봉+a : " + bm + "/" + bmi + "\n" + resultb);
		System.out.println("C사원의 연봉/연봉+a : " + cm + "/" + cmi + "\n" + resultc);

	/* 강사님 풀이
	 * System.out.print("A사원의 연봉 : ")
	 * int a = sc.nextInt();
	 * System.out.print("B사원의 연봉 : ")
	 * int b = sc.nextInt();
	 * System.out.print("C사원의 연봉 : ")
	 * int c = sc.nextInt();
	   
	   double aIncen = a * 1.4;
	   double bIncen = b;
	   double cIncen = c * 1.15;
	   
	   String result1 = "3000 이상";
	   String result2 = "3000 미만";
	   
	   System.out.println("A사원 연봉/연봉+a : " + a + "/" + aIncen);
	   System.out.println(aIncen >= 3000 ? result1 : result2);
	   System.out.println("B사원 연봉/연봉+a : " + b + "/" + bIncen);
	   System.out.println(bIncen >= 3000 ? result1 : result2);
	   System.out.println("C사원 연봉/연봉+a : " + c + "/" + cIncen);
	   System.out.println(cIncen >= 3000 ? result1 : result2);
	 	
	 	*/
		
	}
	
/*	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));	*/
		
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		
		String str = sc.nextLine();

		
								//i < n 를 만족하는 i와 n번째를 조절하는법 공부하기
								//배열의 범위 조정하기
		for(int i = 0; i < 10; i++) {
			
			System.out.println((i+1) + "번째 문자 : " + str.charAt(i));
			
			
		}
	}
}
