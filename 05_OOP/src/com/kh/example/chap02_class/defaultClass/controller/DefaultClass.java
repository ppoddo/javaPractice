package com.kh.example.chap02_class.defaultClass.controller;

// default class
class DefaultClass {		//다른 패키지에서는 호출할 수 없으며 임포트도 안됨
	public void test() {
		System.out.println("default클래스 내의 test() 호출됨..");
	}
}
