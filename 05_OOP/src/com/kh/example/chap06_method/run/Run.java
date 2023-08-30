package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodPractice;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();
		mp.method1();
		mp.method2(); // 메인에서 값을 프린트하고 싶다면 아래처럼 사용
		
//		double result2 = mp.method2();
//		System.out.println(result2);
//		
//		System.out.println(mp.method2());
		
		mp.method3(40, "임화진");
		
		mp.method4(50, 21);

		String[] resultArr = mp.method5();
		System.out.println("Run resultArr : " + resultArr);
		for (int i = 0; i <resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println();
		
		Trainee t =new Trainee("박성운", 'Z', "종일", 78.2);
		System.out.println(t.inform());
		
		t.setClassRoom('B');		// 만들어 놓은 메소드를 활용해 정보변경
		System.out.println(t.inform());
		Trainee.setScore(87.2);
		
		System.out.println(t.inform());
		System.out.println(Trainee.getScore()); 	//점수만 호출하는 메소드 활용
		System.out.println(t.getName());		//이름만 호출하는 메소드 활용
	}
	


}
