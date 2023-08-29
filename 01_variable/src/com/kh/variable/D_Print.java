package com.kh.variable;

public class D_Print {
	public void printlnEx() {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		
	}
	public void printEx() {
		System.out.print("안녕하세요.");
		System.out.print("반갑습니다.");
		
	}

	public void printfEx1() {
		String str1 = "안녕하세요";	 	//변수 선언
		String str2 = "반갑습니다";		//변수 선언
		//안녕하세요, 임화진입니다. 반갑습니다. 를 출력하고 싶다면?
		System.out.println("안녕하세요, 임화진입니다. 반갑습니다.");

			System.out.printf("%s, 임화진입니다. %s.", str1, str2);
					// %s 는 문자열을 넣는 구멍을 뚫어놓는거라고 이해하면 좋다.)
					// %s 첫번째 구멍에 str1을 넣고 %s 두번째 구멍에 str2를 넣어주세요 라는 해석
					//printf 는 줄바꿈이 안된다. 하고싶다면 밑에 예제처럼 중간에 %n을 넣어주자
			System.out.printf("%s, 임화진입니다. %s.%n", str1, str2);
					
	}
	
	public void printfEx2() {  
		String StudentName = "임화진";
		String str1 = "안녕하세요 ";	 	//변수 선언
		String str2 = "반갑습니다";		//변수 선언
		String str3 = (StudentName+"입니다.");
		
			System.out.println(str1 + str3 + str2 + ".");	//변수를 활용한 출력문
			
			
			System.out.printf(str1, str3, str2 +"."); 
			// 이 코드를 출력하면 str1 밖에 출력 안된다. printf라는 메소드의 형식을 맞춰서 값을 넣어줘야하는데
			// 그렇지 않고 임의대로 넣는다면 위 코드와 같이 맨 앞만 읽히거나 아예 오류가 뜰 수 있다.
			// 뒷 값은 무시된거라고 생각하면 될듯.
			
		//안녕하세요, 임화진입니다. 반갑습니다.
//		System.out.println("안녕하세요, 임화진입니다. 반갑습니다.");
		
	}
}
