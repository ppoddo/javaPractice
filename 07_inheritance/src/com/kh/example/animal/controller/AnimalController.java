package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9, 6.3);
		System.out.println(a);	
//		System.out.println(a.inform());
		
		Dog d = new Dog("초코", 1, 5.2, 50, "장모");
		System.out.println(d);
//		System.out.println(d.inform());
		
		Snake s = new Snake("방울이", 4, 10.2, "빗살");
		System.out.println(s);
//		System.out.println(s.inform());
		
//		toString을 사용하지 않고 작성하면 Object가 지정한 값인 주소값이 나오지만
//		toString을 오버라이딩해서 내가 원하는 값이 나오도록 재구성했기 때문에
//		클래스를 호출을 할 때 toString을 호출할 수 있도록 했다
	}
}
