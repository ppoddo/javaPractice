package Example0823;

import java.util.Scanner;

public class ScannerEx2 {
	
	public void input2() {
		// 이름, 나이, 주소
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
	/*	int age = sc.nextInt();
		
		System.out.print("주소를 입력하세요 : ");		
		String address = sc.nextLine(); */
		
		/* 1. 주소를 next()로 받기
		int age = sc.nextInt();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.next(); */
		
		
		/* 2. nextLine() 추가
		int age = sc.nextInt();
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine();		//nextLine()추가해서 줄바꿈을 제거해주기
		String address = sc.nextLine(); */
		
		// 3. 나이를 문자열로 받은 후 파싱하기 파싱 : 문자열을 기본자료형으로 바꾸는걸 뜻함
		String strAge = sc.nextLine();		//strAge를 문자열로 선언
		int age = Integer.parseInt(strAge); // 선언한 strAge를 int로 형변환
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		System.out.print("성별을 입력하세요(M/F) : ");	//자료를 뽑	아오는 방법 charAt 사용
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);				//컴퓨터의 서순은 zero-base 시작이다.
														//-> 입력한 값의 0번째 문자를 가져와라 라는 해석
		
		
		
		
		
		
			
		System.out.printf("%s(%d세, %c)님이 사시는 곳은 %s입니다.", name, age, gender, address);
		
	}
}
