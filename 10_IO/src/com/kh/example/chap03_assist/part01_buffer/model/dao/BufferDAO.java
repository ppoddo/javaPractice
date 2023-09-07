package com.kh.example.chap03_assist.part01_buffer.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDAO {
	public void inputByte() {	//오토매틱close는 IOException을 위임하기때문에 예외처리도 같이해줘야함.
		//나는 파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다
		// File				Stream    			input
		//							 Buffered	//읽어오고 싶은 타입 맞춰주기
		try(FileInputStream fis= new FileInputStream("c_buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			int value;
			while((value = bis.read()) != -1) {
				System.out.println((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void outputByte() {
		// 파일에 바이트 기반으로 데이터를 빠르게 쓰고 싶다
		try (FileOutputStream fos = new FileOutputStream("c_buffer.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);){
			bos.write(65);
			byte[] bArr = {66, 67, 68, 69};
			bos.write(bArr);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void outputChar() {
		// 파일에 문자 기반으로 데이터를 빠르게 쓰고 싶다
		// File							Writer
		//						Buffered
		try(FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("시끄러워요\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputChar() {
		// 파일에 문자 기반으로 데이터를 빠르게 읽고 싶다.
		//	File					read
		//					buffrerd
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
			String value;
			while((value = br.readLine()) != null) {
					System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
		// 버퍼를 사용해서 스캐너를 만들어보기
	public void bufferedScanner() {
		// 사용자가 숫자를 입력하면 그 숫자의 3배가 된 값을 출력
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 한 개를 입력하세요 : ");
//		int num = sc.nextInt();
		String value = null;
		try {
			value = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int num = Integer.parseInt(value);
		System.out.println(num + "* 3 = " + (num*3));
		
		
	}
	
	
	

}
