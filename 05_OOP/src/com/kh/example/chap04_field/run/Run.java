package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable2 kov2 = new KindsOfVariable2();
	//	kov2.staticNum = 10;
		// staticNum 은 static 필드를 사용했기 때문에 객체를 만들어서 사용할 필요가 없다.
		KindsOfVariable2.staticNum = 20; // 클래스명.메소드명 을 사용해서 호출하면됨.
					// integer.pathof ,System.in, math.pai 등등 모두 static에 있는 애들
		
		KindsOfVariable2 kov22 = new KindsOfVariable2();
		kov22.test();		//11, 11
		kov22.test();		//12, 12
		
		KindsOfVariable2 kov23 = new KindsOfVariable2();	//새로운 객체 생성
		kov23.test();		//11, 13
						//static 영역은 프로그램이 종료될 때까지 남아있으니까
						//static 영역은 객체에 영향받지 않는다.
					//그러한 static 영역에 들어가 있는 변수를 class라고 하고
				// 그렇지 않은 변수들을 인스턴스 변수라고 부른다.
		
		
	}
}
