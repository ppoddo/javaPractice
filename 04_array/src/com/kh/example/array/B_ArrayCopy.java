package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {			//배열 복사
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};	//만들면서 동시에 초기화를 한거다.(new가 없어도 바로 만들고 값 넣기) {} 사용
		System.out.println("originArr : " + originArr);	// originArr의 배열 주소값 호출
		int[] copyArr = originArr; // 얕은 복사
		System.out.println("copyArr : " + copyArr);	// 변수명은 달라지지만 참조하는 주소값은 같다!! 이것이 얕은복사
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");		//오리진과 같은 배열의 주소값을 참조하기 때문에 같은 값을 가진다.
												//즉, 참조하는 배열의 값이 바뀌면 같이 바뀐다. 오리진이든 카피든
		}
		
		originArr[0] = 99;		//원본 배열의 값 하나 변경
		copyArr[4] = 88;		//얕은 복사의 원리로 원본배열 자체를 바꾸는 것.
		System.out.println();		// 배열 값 변경
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();		//
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
	
	public void method2() {		//for문을 이용한 깊은 복사
		int[] originArr = {1, 2, 3, 4, 5};		//5의 크기에 각각의 값을 집어넣는다.
		int[] copyArr = new int[5];			//5의 크기에 int(선언된 자료형)의 기본형인 0을 집어넣는다.	위와는 값이 다른셈
		
		System.out.println("originArr : " + originArr);
		System.out.println("copyArr : " + copyArr);		//당연히 주소값이 다르게 나옴
		
		// 깊은 복사 하는 방법
		for(int i = 0; i < originArr.length; i++) {		// for문 이용해서 카피에 오리진 값 대입시키기
			copyArr[i] = originArr[i];
		}
		copyArr[0] = 99;			//깊은 복사(다른 공간에 복사)는 값을 바꾸더라도 주소값이 다르므로 서로 영향 x
		
		for(int i = 0; i < originArr.length; i++) {		//오리진 배열 보기
			System.out.print(originArr[i] + " ");
		}
		System.out.println();		//
		for(int i = 0; i < copyArr.length; i++) {		//카피 배열 보기
			System.out.print(copyArr[i] + " ");
		}
	}
	
	public void method3() {
		// 2. arraycopy() 를 이용한 깊은 복사 // 메소드를 이용하는 복사임
//			== System 클래스 안에 들어있다 		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);	//오리진 주소값
		for(int i = 0; i < originArr.length; i++) {		//오리진 배열 보기
			System.out.print(originArr[i] + " ");
		}
		System.out.println();	//줄바꿈
		
		System.out.println("copyArr : " + copyArr);		//카피 주소값
		for(int i = 0; i < copyArr.length; i++) {		//카피 배열 보기
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();		//줄바꿈
								
//	형태  : 	System.arraycopy(src, srcPos, dest, destPos, length);
					//	src : 원본 배열
					//	srcPos : 원본 배열에서 복사를 시작할 위치
					// dest : 복사 배열(복사할 배열)
					// destPos : 복사 배열에서 붙여넣기를 시작할 위치
					// length : 복사 길이(얼마만큼~)
//		length()
//		nextInt()
//		nextLine()
//		println()
//					// 메소드는 반환을 하냐(int) 안하냐(void)와
//					// ()안에 값을 넣어서 전달하는 것이 '인자' = 0개 이상 있을 수 있다.
//					//	인자를 받냐 안받냐로 나뉜다 . 총 4가지
//		equals("ddsd")
//		println("dqwdqwd")
//		charAt(0)
		
		// 원본 배열의 0(index)번째서부터 원본 배열의 길이만큼 복사 후.
		// 복사 배열 3(index)번째서부터 붙여넣기
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		System.out.println(originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println(copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
	
	public void method4() {
		// 3. copyOf() 메소드를 이용한 깊은 복사
		int[] originArr = {1, 2, 3 , 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println(originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println(copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		
//		형태 : Arrays.copyOf(original, newLength); //해당 자료형의 배열을 반환함.
//		original : 원본 배열
//		newLength : 복사할 길이
		copyArr = Arrays.copyOf(originArr, originArr.length);
		// 해당 배열의 길이만큼 새로운 배열 생성 후 복사 -> 주소값도 당연히 바뀜
		System.out.println(originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println(copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
	}
}
