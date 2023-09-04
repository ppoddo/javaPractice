package com.kh.example.poly.test.controller;

import com.kh.example.poly.test.model.vo.Child1;
import com.kh.example.poly.test.model.vo.Child2;
import com.kh.example.poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		// ㄴ 부모타입 레퍼런스  ㄴ 부모 객체
		p1.printParent();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ 자식타입 레퍼런스  ㄴ 자식 객체
		c1.printChild1();		//Child1의 메소드
		c1.printParent();		//상속된 Parent의 메소드 호출
		
		//업캐스팅
		System.out.println("3. 부모타입 레퍼런스로 자식 객체 다루는 경우");
		Parent p2 = new Child2();
		// ㄴ 부모타입 레퍼런스  ㄴ 자식 객체
//		p2.printChild2();	// Child2 클래스안에 Child2 객체와 Parent객체 중에
		p2.printParent();	// Parent객체만 담을 수 있기에 Parent객체만 사용가능
						//= 부모타입의 레퍼런스이기 때문에 자식클래스에 들어있는 부모타입객체가 호출되는거다.
	
		((Child2)p2).printChild2(); // 다운캐스팅
								//p2 객체에 Child2로 형변환하여서 자식클래스의 객체를 사용가능.
		
		System.out.println("4. 자식타입 레퍼런스로 부모 객체 다루는 경우"); // 불가능
//		Child2 c2 = new Parent();	//부모 객체를 자식타입 레퍼런스로 넣을수는없다.
		
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		//부모타입 레퍼런스 instanceof 자식 객체
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
		for(int i = 0; i < pArr.length; i++) {
//			if(pArr[i] instanceof Child1) {	//Child1객체가 들어오면 true
//				((Child1)pArr[i]).printChild1();
//			} else if(pArr[i] instanceof Child2) { //Child2객체가 들어오면 true
//				((Child2)pArr[i]).printChild2();
//			}
			
			pArr[i].print();		//동적 바이딩 적용
				//원래라면 Parent클래스의 print 객체가 호출되어야 하나 
				//조건(상속관계 O 해당 객체 오버라이딩O)이 만족하면
				// 오버라이딩 된 자식객체의 메소드가 우선권을 가져서 호출된다 ㅠㅠ
		}
		
		
		
		
		
	}

}
