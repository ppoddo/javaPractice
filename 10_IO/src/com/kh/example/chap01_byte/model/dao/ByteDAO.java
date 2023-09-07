package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		//	파일로부터 byte단위로 데이터를 읽어오고 싶다
		FileInputStream fis = null;	
		try {
			fis = new FileInputStream("a_byte.txt");
			
			//1.파일 크기를 가져와 byte배열을 만들어 데이터 저장 후 출력
//			File f = new File("a_byte.txt");
//			long size = f.length();		//위에서 형변환 해줘도 됨
//			byte[] bArr = new byte[(int)size];		//size는 int로 들어가야함
//			fis.read(bArr);
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
//			System.out.println();	
//			System.out.println("-------------------------------");	
//			System.out.println();	
//			
			// 위에서 이미 읽어와서 커서가 끝에 도달했기 때문에 아래 실행은 제외되므로 위를 주석처리하면 됨
			
			//2. 배열을 사용하지 않고 바로 하나씩 읽은 후 출력
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
			// 객체를 다 사용하면 무조건 닫아줘야한다. - finally +따로 트라이캐치
	public void fileSave() {		//덮어쓰기로 되어있다.
				//이어서 계속 작성하고 싶다면 boolean을 이용해서 true면 이어쓰도록 한다.
		//	파일에 byte단위로 데이터를 작성하고 싶다
		FileOutputStream fos = null;
		try {		// 해당 파일이 없으면 파일을 생성한 후 데이터를 쓰기 시작함
			fos = new FileOutputStream("a_byte.txt");
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr);
			
			fos.write(bArr, 1, 3);	// 해당 배열의 몇번째부터 몇개까지
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
}
