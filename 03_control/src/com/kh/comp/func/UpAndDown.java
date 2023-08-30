package com.kh.comp.func;

import java.util.Scanner;

public class UpAndDown {
	public void upDown() {
		Scanner sc = new Scanner(System.in);
				// 0<1 사이의 실수를 갖는다면 *100 + 1 로 1<101 가능
				// 정수값을 원하므로 형변환 해야함.
		int target = (int)(Math.random()*100+1);
		int trynum =  0;
				
		System.out.println("1부터 100사이의 숫자를 맞춰보세요!!");
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int usernum = sc.nextInt();
			trynum++;
			
			if(usernum < target) {
				System.out.println("더 큰 숫자를 입력하세요. ");
				System.out.println("up!!");
			} else if(usernum > target) {
				System.out.println("더 작은 숫자를 입력하세요.");
				System.out.println("down!!");
			} else {
				System.out.println("축하합니다! 정답입니다.");
				System.out.println("시도 횟수 : " + trynum);
				break;
			}
		}
	}
}
