package com.kh.example.chap02_class.defaultClass.run;

public class Run {
	public static void main(String[] args) {
//		DefaultClass dc = new DefaultClass();  // 이 클래스는 default 접근제어자로 되어있어서 다른 패키지에서는 못부름.
	
		// 0 <= Math.random();  < 1 //  0에서 1보다 작은 곳까지 double로 반환한다.
		System.out.println(Math.random());
		
		// 1~10 사이의 랜덤한 수 출력
		// 0단계 : 0 <= Math.random();  < 1 --> 0~0.999999999999...
		// 1단계 : 0 <= Math.random()*10 < 10 --> 0~9.999999999.....  //곱10
		// 2단계 : 1 <= Math.random()*10 + 1  < 11  --> 1~10.99999999 / +1
		// 3단계 : 1 <= (int)(Math.random()*10 + 1) < 11 --> 1~10	  // 형변환
	}
}
