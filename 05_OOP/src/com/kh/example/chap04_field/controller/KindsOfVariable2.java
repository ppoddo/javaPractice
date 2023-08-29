package com.kh.example.chap04_field.controller;

public class KindsOfVariable2 {
	
	public static int staticNum;
	
	private int testNum = 10;
	private static int staticTestNum = 10;
	
	public void test() {
		testNum++;		//
		System.out.println("testNum : " + testNum);
		staticTestNum++;	//static은 프로그램이 종료될 때까지 남아있으니까
		System.out.println("staticTestNum : " + staticTestNum);
		
		
	}
}
