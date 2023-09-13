package com.kh.example.chap02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void clientStart() {
		// 원래는 서버의 ip주소와 클라이언트의 ip주소는 다르게 맞지만
		// 여기서는 같은 컴퓨터로 주고받고 하기때문에 ip주소가 같다..
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			// 1. 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIP, port);
			
			// 2. 서버와의 입출력 스트림 생성(보조스트림으로 성능 개선)
			if(socket != null) {	// 서버가 문제가 생기면 null을 반환하기때문에 조건문 처리해준다.
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(in));
				pw = new PrintWriter(out);
				
				// 3. 스트림을 통해 읽고 쓰기
				//클라이언트가 서버한테 메세지 전송
				pw.println("반갑습니다");
				pw.flush();
				
				System.out.println(br.readLine());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			// 4. 통신 종료
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
