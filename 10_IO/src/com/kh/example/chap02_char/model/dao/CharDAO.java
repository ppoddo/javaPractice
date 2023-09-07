package com.kh.example.chap02_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileOpen() {
		//파일로부터 문자단위로 데이터를 읽어오고 싶다
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			//1. 파일의 크기만큼의 char배열에 데이터 저장 후 출력
//			File f = new File("b_char.txt");
//			int size = (int)f.length();
//			char[] chArr = new char[size];
//			fr.read(chArr);
//			for(int i = 0; i < chArr.length; i++) {
//				System.out.print(chArr[i] + " ");
//			}
			
			//2. 파일의 데이터를 읽어오자마자 출력
			int value;
			while((value = fr.read()) != -1 ) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		//	데이터를 파일에 문자단위로 쓰고 싶다
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("와, IO 재밌다~!");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
	
	//try~with~resource
	// try문 안에 () 안에 객체 생성을 해서 자동close처리 가능
	public void fileSave2() {
		//	데이터를 파일에 문자단위로 쓰고 싶다
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("와, IO 재밌다~!");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	} 
	public void fileOpen2() {
		//파일로부터 문자단위로 데이터를 읽어오고 싶다
		try(FileReader fr = new FileReader("b_char.txt")) {
			int value;
			while((value = fr.read()) != -1 ) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
