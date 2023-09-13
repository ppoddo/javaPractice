package com.kh.example.chap02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		Socket socket = null;
		try {
			// 1. 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트용 소켓객체 생성
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIP, port);

			// 2. 서버와의 통신을 위해 입출력 스트림 생성(보조스트림 추가)
			if(socket != null) {
				InputStream in = socket.getInputStream();
				OutputStream out =socket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(in));
				pw = new PrintWriter(out);
				
				// 3. 스트림을 통해 읽고 쓰기
				do {
					System.out.print("대화 입력 : ");
					String messge = sc.nextLine();
					
					pw.println(messge);
					pw.flush();
					
					if(messge.equals("exit")) {
						break;
					}
					
					System.out.println(br.readLine());
				} while(true);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. 통신 종료
				pw.close();
				br.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
