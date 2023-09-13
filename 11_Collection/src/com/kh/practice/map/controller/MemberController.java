package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member mb = map.get(id);
			if(mb.getPassword().equals(password)) {
				return mb.getName();
			}
			return null;
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
	    if (map.containsKey(id)) {
	        Member mb = map.get(id);
	        if (mb.getPassword().equals(oldPw)) {
	            mb.setPassword(newPw);
	            return true;
	        }
	        return false;
	    }
	    return false;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			Member mb = map.get(id);
			mb.setName(newName);
		}
	}
	
	public TreeMap<String, String> sameName(String name) {
		
		TreeMap<String, String> result = new TreeMap<String, String>();
		// 결과를 이름 순으로 정렬하기 위해 TreeMap 객체 생성
		Iterator<Entry<String, Member>> it = map.entrySet().iterator();
		// 엔트리셋을 가져와서 이를 순회할 Iterator 객체 생성
	    while (it.hasNext()) {	// 엔트리를 다 돌때까지 순회해줘
	        Entry<String, Member> entry = it.next();
	        // next() == 그 엔트리의 키와 값을 쌍으로 갖고와서 엔트리 객체 생성
	        String memberId = entry.getKey();
	        //getKey = 엔트리의 키(멤버아이디)를 가져옴
	        Member member = entry.getValue();
	        //getValue = 엔트리의 값(멤버 객체(패스워드 네임)) 가져옴
	        if (member.getName().equals(name)) { // 멤버객체의 이름과 전달받은 인자인 이름 비교
	            result.put(memberId, name);
	            // 알맞는 객체의 memberID, name을 TreeMap에 추가
	        }
	    }
        return result;  //반복문을 통해 완성된 TreeMap 객체를 반환
	}
	
	public TreeMap<String, Member> sameName2(String name) {
		TreeMap<String, Member> same = new TreeMap<String, Member>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String id = it.next();
			Member m =map.get(id);
			if(m.getName().equals(name)) {
				same.put(id, m);
			}
		}
		return same;
	}
}
