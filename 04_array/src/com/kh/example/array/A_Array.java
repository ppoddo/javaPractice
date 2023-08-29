 package com.kh.example.array;

public class A_Array {
	public void method1() {
		// int자료형만 들어갈 수 있는 9개 공간을 가진 배열 arr 생성
		int[] arr = new int[9];		//heap 메모리에 인트를 넣을수있는 9개의 공간을 만들어줘~
		System.out.print(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);		// 0이 찍히는데 int의 기본값이 0이여서 초기화됐기때문
		}
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
//		arr[7] = 80;
//		arr[8] = 90;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//arr[9] = 100; //배열의 범위를 벗어나서 오류남;
	}
	
	public void method2() {
		//	double 자료형만 들어갈 수 있는 크기 3의 dArr배열 생성
		double[] dArr = new double[3];
		dArr[0] = 78.5;
		dArr[1] = 69.4;
		dArr[2] = 98.1;
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}	
		System.out.println("===================");
		dArr = new double[21];	// 배열은 한번 지정한 크기는 변경할 수가 없다.
								// heap 메모리를 다시 만들어서 dArr 값에 초기화 해서 넣는다.
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
}
