package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<Dog> set = new HashSet<>(); // 타입 추론 = 앞의 타입을 보고 컴파일
		
		set.add(new Dog("몽실", 2.2));
		set.add(new Dog("두부", 3.3));
		set.add(new Dog("초코", 2.0));
		System.out.println("set : " + set);
		
		set.add(new Dog("몽실", 2.2));	//주소값이 다르다
		System.out.println("set : " + set);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("햇빛"));
		hs.add(new String("바람"));
		hs.add(new String("비"));
		hs.add(new String("눈"));
		System.out.println(hs);
		
		hs.add(new String("햇빛"));
		System.out.println(hs);
		
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println("set2 : " + set2);
		
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println("set2 : " + set2);
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println("set3 : " + set3);
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set2);			// 해당 객체의 값을 전부 복사
		set4.add(new Dog("뽀또", 5.2));	
		System.out.println("set4 : " + set4);
		
		// set 안의 element(구성요소) 꺼내오기  //얼마만큼 가져올지 모르기떄문에 while 추천
		// 1. Set의 데이터를 List에 옮기기
		ArrayList<Dog> list = new ArrayList<Dog>(set4);
//		list.addAll(set4);
		System.out.println("list : " + list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 2. Iterator 사용하기 	// 재사용이 안됨 = 단방향
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		}
			// List 에서는 ListIterator 사용 가능 == 양방향
		ListIterator<Dog> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println("lit next : " + lit.next());
		}
		while(lit.hasPrevious()) {
			System.out.println("lit previous : " + lit.previous());
		}
		
		
		
		
		
		
		
	}
}
