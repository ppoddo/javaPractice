package com.kh.example.chap02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void serverStart() {
		// 1. 서버의 포트 번호 정하기
		int port = 8500;
		
		ServerSocket server = null;
		Socket client = null;
		InputStream input = null;
		OutputStream output = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			// 2. 서버용 소켓 객체(ServerSocket) 생성 (포트와 결합)
			server = new ServerSocket(port);
			
			// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			// 4. 접속 요청이 오면 요청 수락(accept() 후 클라이언트에 대한 소켓 객체 생성
			client = server.accept();
			// 클라이언트에 대한 요청을 수락하는 Socket.accept() 객체 생성
			String clientIP = client.getInetAddress().getHostAddress();
			// 요청이 온 클라이언트의 정보를 담는 객체 clientIP 생성
			System.out.println(clientIP + "와(과) 연결됨...");
			
			// 5. 클라이언트와 입출력 스트림 생성(보조스트림 통해 성능 개선)
			input = client.getInputStream();	// 소켓 객체를 사용해서 입력 스트림
			output = client.getOutputStream();	// 소켓 객체를 사용해서 아웃 스트림
			
			br = new BufferedReader(new InputStreamReader(input));
			pw = new PrintWriter(output);
			
			// 6. 스트림을 통해 읽고 쓰기
			// 클라이언트가 서버로 보낸 메세지 읽기
			String message = br.readLine();
			System.out.println("Client " + clientIP + "가 보낸 메세지 : " + message);
			
			pw.println("만나서 반갑습니다.");
			pw.flush(); 
			//네트워크 통신에서는 flush() 필수 
			// 보낸 내용을 목적지에 보내고 스트림에 남아있는 버퍼를 전부 비워주는 메소드

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 7. 통신 종료
			try {
				pw.close();
				br.close();
				output.close();
				input.close();
				
				server.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
