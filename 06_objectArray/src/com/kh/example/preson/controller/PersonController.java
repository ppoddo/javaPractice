package com.kh.example.preson.controller;

import com.kh.example.preson.model.vo.Person;

public class PersonController {
	public void method1() {
		//person 객체가 들어갈 수 있는 5개의 공간 pArr 생성
		Person[] pArr = new Person[5];
		
		System.out.println("pArr : " + pArr);
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i]);
		}
		
		pArr[0] = new Person("강건강", 25, '남', 175.4, 74.2);
		pArr[1] = new Person("남나눔", 14, '남', 167.7, 61.5);
		pArr[2] = new Person("도대담", 34, '남', 182.0, 66.7);
		pArr[3] = new Person("류라라", 17, '여', 172.1, 55.6);
		pArr[4] = new Person("문미미", 28, '여', 160.2, 58.4);
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i]);
		}
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	}
	
	public void method2() {
		Person[] pArr = {new Person("박보배", 42, '여', 162.7, 44.8),
						new Person("임화진", 28, '남', 172.8, 68.8)
		};
		
		System.out.println(pArr[0]);
		System.out.println(pArr[1]);
	}
}
