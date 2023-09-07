package com.kh.example.map.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMAp() {	// 키는 대표적으로String을 많이쓰고 값은 클래스를 넣어놓자
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		//put을 사용해서 map에 대입
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		
		//HashMap 은 순서유지x
		System.out.println(map);
		//{다이제=단맛[2500원], 새우깡=짠맛[1500원], 포테이토칩=짠맛[1500원], 고소미=고소한맛[1000원]}
		//키 = 밸류
		
		System.out.println(map.put("새우깡", new Snack("매운맛", 1500)));
		System.out.println(map);
		// 새우깡=매운맛[1500원], 
		// 키 값을 따르기 때문에 같은 키값을 지닌 정보에 덮어씌어짐
		
		//그 메소드 안에서 키 또는 값이 해당되는게 있는지 확인
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("매운맛", 1500)));
		//주소값이 다르게 되기 때문에 new로 되어있느 객체가 없다고 판단함
		//이것 또한 equals를 오버라이딩해서 주소값을 비교하지말고 객체를 비교하도록 만들면 가능
	
		System.out.println(map.get("새우깡"));
		// get = "새우깡"이라는 키가 가진 값(value)를 호출하는 메소드
		System.out.println(map.get("홈런볼"));
		// 만약 없는 키값을 입력하면 null값을 반환
		
		
		// map 안에 있는 element(요소) 꺼내오기
		// map에는 
		// 1. keySet() 이용하기
		// = map 안에 있는 key들을 set으로 반환하겠다
		Set<String> set1 = map.keySet();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + "=" + map.get(key));
		}
		// Iterator는 Set에 설정되어있는 제네릭을 따른다.
		// Set은 map에 설정되어 있는 제네릭을 따른다.
		
		
		// 2. entrySet() 이용하기
		// = map 안에 있는 entry들을 set 반환하겠다.
		// entry = 키와 값의 쌍
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		// Set은 entry를 제네릭으로 담고있다.
		// entry는 키와 값을 쌍으로 제네릭으로 담고있다.
		
		// 생성자의 매개변수에 넣어도 되고 putAll을 사용해도 상관없음
		// TreeMap = 키를 기준으로 정렬해주는 맵
		// String은 오름차순으로 정렬기준을 가지고 있다
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>(map);
//		map2.putAll(map);
		System.out.println(map2);
		
		System.out.println(map2.size());
		System.out.println(map2.remove("다이제"));
		// 키를 지웠는데 지워지는게 왜 값으로 표현되지?
		System.out.println(map2);
		
		map2.clear();	// 해당 객체 비우기
		System.out.println(map2);
		System.out.println(map2.isEmpty());	//해당 객체 비워진거 확인 메소드
	}

	public void doProperties() {
		// 키와 값을 무조건 String으로 받는 기능
		// " " = " " 으로 저장됨
		Properties prop = new Properties();
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		System.out.println(prop);
		
		// 같은 키에 다른 값을 넣으면 덮어씌어짐
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		
		// 키가 기준이다
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과")); 	// null 반환
		System.out.println(prop.getProperty("채소", "땅콩")); // 채소에는 땅콩 없으므로 채소의 피망 반환
		System.out.println(prop.getProperty("견과", "땅콩")); // 견과의 땅콩 반환
		
		// ? = 와일드 카드 = 알수 없는 값
		// Enumeration 에서 제네릭을 보통은 ?을 사용한다.
		Enumeration<?> e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + "=" + prop.getProperty(key));
		}
		
		
		
		
		
		
		
		
		
	}
}
