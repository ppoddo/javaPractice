package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	public static void main(String[] args) {	
		try {
			InetAddress localIP = InetAddress.getLocalHost();
			// getLocalHost()는 static 예약어로 되어있다
			// 그래서 따로 객체를 생성하지 않고도 불러올 수 있다.
			System.out.println("localIP : " + localIP);
			// 지역 호스트 == 컴퓨터의 이름 / 내 로컬ip를 반환
			
			System.out.println("PC 명 : " + localIP.getHostName());
			// 컴퓨터의 이름만 뽑아내기
			System.out.println("IP 주소 : " + localIP.getHostAddress());
			// 로컬의 IP만 뽑아오기
			
			System.out.println();
			
			InetAddress khIP = InetAddress.getByName("www.kh-academy.co.kr");
			System.out.println("kh 서버 명 : " + khIP.getHostName());
			// 이름(도메인주소)으로 서버의 이름을 찾아온다
			System.out.println("kh 서버 IP " + khIP.getHostAddress());
			// 이름(도메인주소)으로 서버의 IP 주소를 찾아온다.
			
			System.out.println();	
			
			//getAllByName는 InetAddress[](배열)로 모든 정보를 가져온다
			InetAddress[] naverIP = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 : " + naverIP.length);
			for(InetAddress ip : naverIP) {
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
