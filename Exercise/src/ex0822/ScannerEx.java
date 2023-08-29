package ex0822;

import java.util.Scanner;

public class ScannerEx {
	public void Cv1() {
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	
		System.out.print("닉네임을 입력해주세요. : ");
	String User = sc.next();
	
		System.out.print("대화를 입력해주세요. : ");
//		sc.skip("\r\n");		//c스타일의 코딩 = 엔터를 스킵하라
	String Con = sc2.nextLine();
		
		System.out.print("청자를 입력해주세요. : ");
	String Ob = sc.next();
	
		System.out.printf("%s님의 대화 %n%s %n대상 : %s", User, Con, Ob);
	}
	
}
