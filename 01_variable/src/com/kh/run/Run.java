package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.D_Print;
import com.kh.variable.E_KeyboardInput;

public class Run {

	public static void main(String[] args) { // 기능클래스를 사용하려면 메인에서 기능클래스 구현해서 사용

		//com.kh.variable.A_Variable av = new com.kh.variable.A_Variable(); //
		//객체생성 풀네임 구문.//
		A_Variable av = new A_Variable(); //import = 사용, 참조 3번째 문단처럼 만들어주기 참고로 패키지 아래에 있어야함.
									   	//import 단축키 = 컨 + 쉬 + O(영어)
		//av.declareVariable();			//선언된 av 클래스 안에 있는(.) declareVariable라는 메소드를 호출

		//System.out.println("=========================");
		
		
		//av.initVariable();
		
		B_Constant con = new B_Constant();
		
		//con.finalConstant();	
		
		D_Print dp = new D_Print();
//		
//		dp.printlnEx();
//		
//		dp.printEx();
//		
//		dp.printfEx1();
		
//		dp.printfEx2();
		
		E_KeyboardInput eki = new E_KeyboardInput();
		eki.input1(); // next에 값이 없기 때문에 입력될때까지 사용자의 입력을 대기중입니다.

	}

}
