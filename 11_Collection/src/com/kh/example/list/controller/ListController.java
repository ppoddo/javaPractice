package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() { // <>제네릭은 사용자 지정 제한으로써 그 컬렉션에 담을 타입을 지정하는건데
					//만약 <>제네릭을 지정하지 않는다면 기본타입은 Object로 지정된다.
		ArrayList<String> l = new ArrayList<String>();
		ArrayList<Student> list = new ArrayList<Student>(3);
		
		list.add(new Student("테스트", 0)); // toString의 의해 지정된 값이 객체로 만들어져서 저장됨
		list.add(new Student("도대담", 60));
		list.add(new Student("남나눔", 90));
		System.out.println("list : " + list);
		
		list.add(new Student("하현호", 85));
		System.out.println("list : " + list);
		System.out.println("list에 담긴 element 개수 : " + list.size());
		
		list.add(0, new Student("류라라", 100));	//int 번째 자리에 해당객체 추가
		System.out.println("list 추가 : " + list);
		
		list.add(3, new Student("강건강", 40));
		System.out.println("list 추가 : " + list);
		
		list.remove(1);			//해당 인덱스 자료 삭제
		System.out.println("list 삭제 : " + list);
		
		list.remove(new Student("강건강", 40));	
		//해당 객체는 new로 인해서 다른 주소값을 지니므로 위에 선언된 객체와는 다른 객체로 인식됨
		System.out.println("list 삭제 : " + list);
		
		
		l.add(new String("류라라"));
		l.add(new String("도대담"));
		l.add(new String("남나눔"));
		System.out.println(l);
		l.remove(new String("도대담"));	
		//l 객체는 String을 담고있고 String은 equals를 오버라이딩해서 담고 있기때문에
		//동적바인딩에 의해 remove의 equals를 String의 오버라이딩된 equals를 사용한다.
		// 때문에 o.equals = 주소값 비교 / s.equals = 객체값 비교 라고 볼 수 있다.
		System.out.println(l);
		
		
		// 정렬 컬렉션	sort 사용 시 정렬기준도 정해줘야함
//		Collections.sort(list); // list에는 객체가 2개
		l.add(new String("강건강"));
		l.add(new String("박보배"));
		l.add(new String("하현호"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(43);
		l2.add(14);
		l2.add(41);
		l2.add(178);
		l2.add(564);
		System.out.println(l2);
		l2.remove(new Integer(14));
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		//set = 몇번 째 인덱스의 값을 해당 값으로 바꾼다
		list.set(3, new Student("박보배", 85));
		System.out.println("list set : " + list);
		
		//get = 해당 인덱스의 값을 호출하고 객체에 담을 수 있다.
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list);
		
		//subList = ~인덱스부터 ~인덱스 미만까지 범위로 뽑아서 지정
		System.out.println(list.subList(0, 2));
		
		System.out.println(list.contains(new Student("남나눔", 90)));
		System.out.println(list.indexOf(new Student("남나눔", 90)));
		
		System.out.println(l.contains(new String("남나눔")));
		
		// clear = 해당 리스트 비우기 isEmpty = 해당 리스트가 공백인지 확인
		System.out.println("list : " + list);
		list.clear();
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());
		
	}

}
