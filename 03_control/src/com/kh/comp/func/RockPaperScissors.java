package com.kh.comp.func;

import java.util.Random;		//util 기능이라서 스캐너와 같이 임포트 해줘야함
import java.util.Scanner;

public class RockPaperScissors {
	public void rps() {
		//가위 : 0 바위 : 1  보 : 2
		Scanner sc = new Scanner(System.in);
		Random random = new Random();		//Math.random 은 범위를 지정해서 하는데 탁월하지만
										//범위를 지정하지 않는 랜덤 난수는 Random클래스를 사용.
		int totalGame = 0;
		int userWin = 0;				// 필요한 정수 초기화
		int computerWin = 0;
		int tie = 0;
	
		System.out.print("가위바위보 게임에 오신걸 환영합니다.");
		System.out.print("닉네임을 입력하세요 : ");
		String userName = sc.nextLine();
		
		System.out.println("게임을 시작합니다.");
		System.out.println("종료를 원하시면 exit를 입력해주세요.");
		
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 입력해주세요 : ");
			String userPlay = sc.nextLine();
			
			if(userPlay.equals("exit")) {		//종료 문구
				break;
			}
					
			int computerPlay = random.nextInt(3);	//0,1,2의 난수를 임의의 값이라고 정해서 사용하자
			System.out.println(userName + " : " + userPlay);
			System.out.println("컴퓨터 : " + computerPlayPattern(computerPlay));	//
			int result = whoWinner(userPlay, computerPlay);
			
			//가위 바위 보! 누가 이겼다! 비교해야함
			
			if(result == 0) {
				System.out.println("비겼습니다.");
				tie++;		//무승부 카운트 증가
			} else if(result == 1) {
				System.out.println(userName + "님이 이겼습니다.");
				userWin++;	// 승리 증가
			} else if(result == -1) {
				System.out.println("컴퓨터가 이겼습니다. ㅋㅋ");
				computerWin++;	//	패배 증가
			} else {
				System.out.println("잘못입력했습니다.");
			}
			
			if(result != 999) {	// 잘못입력했을 때는 총 게임 수 증가x
				totalGame++; // 게임 수 증가 후 와일문으로 다시 고고
			}
		} 
		
		System.out.println("====게임 결과====");
		System.out.println("총 게임 실행 횟수 : " + totalGame);
		System.out.println(userName + " 승리 : " + userWin);
		System.out.println(userName + " 패배 : " + computerWin);
		System.out.println("무승부 : " + tie);
	}
	
    public static String computerPlayPattern(int play) {
        if (play == 0) {				//가위 : 0, 바위 : 1, 보 : 2
            return "가위";
        } else if (play == 1) {
            return "바위";
        } else {
            return "보";
        }
    }
    			// 사용자의 입력에 따라 삼항연산자를 사용해서 컴퓨터의 난수가 정해졌을때 값을 리턴해준다.
    public static int whoWinner(String userPlay, int computerPlay) {
        if (userPlay.equals("가위")) {
            return computerPlay == 0 ? 0 : (computerPlay == 1 ? -1 : 1);
        } else if (userPlay.equals("바위")) {
            return computerPlay == 0 ? 1 : (computerPlay == 1 ? 0 : -1);
        } else if (userPlay.equals("보")) {
            return computerPlay == 0 ? -1 : (computerPlay == 1 ? 1 : 0);
        } else {
            return 999;  // 잘못된 입력이 들어오면 무승부로 처리하자
        }
    }
}
