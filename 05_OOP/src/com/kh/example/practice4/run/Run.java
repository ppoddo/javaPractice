package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("별의 이야기", "KH출판사", "임화진");
		Book b3 = new Book("초보자를 위한 리액트 200제", "정보문화사", "이정열", 15000, 0.2);
	
		b1.inform();
		b2.inform();
		b3.inform();
	
	}

}
