package com.kh.example.chap02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void startServer() {
		// 1. 서버의 포트번호 정하기
		int port = 8500;
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket client = null;

		try {
			// 2. 서버용 소켓 객체 생성(포트 매개변수)
			server = new ServerSocket(port);
			
			// 3. 클라이언트에게 접속 요청 오길 기다림
			System.out.println("클라이언트에게 요청이 오길 기다림...");
		
			// 4. 클라이언트에게 접속 요청이 오면 수락(accept()) 후 클라이언트용 소켓 객체 생성
			client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "와 연결되었습니다...");
			
			// 5. 클라이언트와의 통신을 위해 스트림 생성(보조스트림 추가)
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();	
			br = new BufferedReader(new InputStreamReader(input));
			pw = new PrintWriter(output);

			// 6. 스트림을 통해 읽고 쓰기
			while(true) {
				String message = br.readLine();
				if(message.equals("exit")) {
					System.out.println("접속 종료");
					break;
				}
				
				System.out.println("Client" + clientIP + "가 보낸 메세지 : " + message);
				
				pw.println("메세지 받기 성공");
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 7. 통신 종료
			try {
				pw.close();
				br.close();
				client.close();
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
