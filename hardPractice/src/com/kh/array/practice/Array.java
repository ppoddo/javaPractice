package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;		//값 초기화
		while(true) {		// 알맞는 입력값을 받을때까지 무한반복
			System.out.print("3이상인 홀수 입력 : ");
			num = sc.nextInt();				//정수 입력받기
			if(num >= 3 && num % 2 == 1) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int[] nArr = new int[num];		//입력받은 만큼 정수를 담을 배열 생성
		
		for(int i = 0; i <= num / 2; i++) { // 배열이 순차적으로 증가할 때
										//입력받은 홀수의 절반의 값보다 작을때까지..
			nArr[i] = i + 1;
		}
			// 배열의 중간(i = num/2+1)부터 내림차순을 위한 변수j선언 후
			// 배열이 입력한 num(사실상 배열의 길이)까지 배열의인덱스번호++ 배열안에 값--
		for(int i = num / 2 + 1, j = num / 2 - 1; i < num; i++, j--) {
													//j == 배열의 리터널값을 조정하기 위한 새로운 변수
			nArr[i] = j + 1;
		}
		
		System.out.print("배열 결과 : ");
		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + " ");
		}
	}
	
	public void practice13() {
		int[] num = new int[10];	//10개 정수형 배열
		
		for(int i = 0; i < num.length; i++)	{ //배열 인덱스 이동
			int random = (int)(Math.random()*10 + 1);		//1~10 사이의 정수 난수
			num[i] = random;
			System.out.print(num[i] + " ");
		}
		System.out.println(); 
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];		//값을 계속 대입해서 기존에 있던 값보다 크면 max 초기화
			}
			if(num[i] <min) {
				min = num[i];	//마찬가지로 값을 대입해서 기존에 있던 값보다 작으면 min 초기화
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice14() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random;
			boolean equals;
			
			do {
				random = (int)(Math.random()*10+1);	//랜덤변수
				equals = false;		// 값이 같지 않다면
				
				for(int j = 0; j < i; j++) {
					if(arr[j] == random) { // 이전 난수값과 현재 난수값이 같으면 중복처리
						equals = true;	//중복이므로 equals가 true로 바뀜
						break;
					}
				}
			} while (equals);		//equals의 값이 false여야 반복끝남
			
			arr[i] = random; //위에서 난수들의 중복을 걸러내서 false를 받아 나온 값을 받아서
							//arr[i]번째에 해당 값 대입 후 프린트 후 증감식으로 이동하고 조건식 확인
			System.out.print(arr[i] + " ");	
		}
	}
	
	
	public void practice15() {		//오름차순 집어넣어야 함
		//로또번호 1부터 45번까지 6개의 숫자
		int[] arr = new int[6];		// 6개의 배열 선언
		
		for(int i = 0; i < arr.length; i++) {
			int random;
			boolean equals;
			
			do {
				random = (int)(Math.random()*45+1);		//1~45까지의정수형숫자
				equals = false;
				
				for(int j = 0; j < i; j++)	{
					if(arr[j] == random) {
						equals = true;
						break;
					}
				}
			} while(equals);
			
			arr[i] = random;
		}
		
		Arrays.sort(arr);	// 인자에 들어가 있는 배열을 오름차순으로 변경
		
		System.out.print("로또 번호 :");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void swap(int a, int b) {
	
	}
	
	public void practice15_2() {
		int a = 0;
		int b = 0;
		swap (a, b);
		int lotto = 0;
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int random;
			boolean equals;	// 일단 냅둬
				//중복이 안될때까지
			do {
				 random = (int)(Math.random()*45+1);
				 equals = false; // 같아지지 않을때까지 반복해라
					
				for(int j = 0; j < i; j++)	{
					if(arr[j] == random) {
						equals = true;
						break;
					}
				}
			} while(equals);
			 arr[i] = random;
		}
	    int tmp;
	    for(int i = 0; i < arr.length; i++){
	        for(int j = 0; j < arr.length -1 -i; j++){
	            swap(arr[j], arr[j+1]);
	            if(arr[j] > arr[j+1]){
	                tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}
	
}
