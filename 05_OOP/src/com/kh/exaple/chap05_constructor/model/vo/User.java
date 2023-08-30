package com.kh.exaple.chap05_constructor.model.vo;

public class User {
	private String userId;
	private String userName;
	private int age;
	private double point;
	
	public User() {		//기본 생성자를 만들어 줘야함
		
	}

	// 매개변수 생성자 만들기 // 클래스의 이름과 같게 반환타입 없이 생성
		//	개수와 타입을 잘 정해서 사용해야함. 매개변수를 설정하는게 곧 정의를 만드는것이라서..
		// 컴퓨터는 뜻은 해석을 못하고 타입만 보므로 내가 잘 해야 함.
	public User(String userId, String userName, int age, double point) {
		this(userId, userName, age);
		this.point = point;
		//userId = userId; 라고 한다면 둘다 지역변수명으로 인식한다
		//왜냐하면 필드 명과 지역변수명이 같다면 지역변수명이 우선순위를 가지게 된다.
		//this == 현재 객체(클래스)를 지칭하는거임. //참조변수다
	}
		// 같은 클래스 안에 User가 여러개 있어도 오버로딩이 적용된거다(ex : 매개변수 개수가 다름) 
	public User(String userId, String userName, int age) {
		this(userId, userName);		//같은 기능을 하는 생성자를 호출해서 사용
						//this(오버로딩된 생성자의 배열);  하면 끝!
		this.age = age;
	}
	
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	
	public void inform() {
		System.out.println(userId + ", " + userName + ", " + age + ", " + point);
	}
	
}
