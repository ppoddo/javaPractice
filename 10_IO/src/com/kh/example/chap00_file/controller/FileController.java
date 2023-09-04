package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();		// 새로운 파일만을 생성하는 메소드..새로운경로생성은 x
			
			File f2 = new File("C:/test/test.txt");	// test폴더가 없기때문에 오류
			f2.createNewFile();
			
			File f3 = new File("C:/temp1/temp2");
			f3.mkdirs();		//새로운 폴더를 만드는 메소드 makedirectorys의 약어
			
			File f4 = new File("C:/temp1/temp2/test.txt");
			f4.createNewFile();
			f4.delete();		// 객체 실행 취소 삭제
			
			System.out.println(f2.exists());	//파일의 존재 유무를 boolean값으로 
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			
			System.out.println(f1.getName()); 	// 파일명을 호출
			System.out.println(f1.getAbsolutePath());	// 절대경로
			System.out.println(f1.getPath());	// 상대경로
			// 절대경로 : 완전한 경로 그 경로(패키지)의 풀 네임 ㅇㅇ
			// 상대경로 : 현재 작업 디렉토리를 기준으로 경로를 지정하는것..찾아가는방법 ㅇㅇ
			System.out.println(f1.length()); // 그 파일의 크기
			System.out.println(f4.getParent()); // 내 상위 폴더 호출
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
