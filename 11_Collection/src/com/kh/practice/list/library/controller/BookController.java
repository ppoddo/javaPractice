package com.kh.practice.list.library.controller;

import java.util.ArrayList;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(Book b : bookList) {
			if(b.getTitle().contains(keyword)) {	//contains가 문자열 안에 특정 글자가 포함되어있는지 물어보는 메소드
				searchList.add(b);
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i = 0; i < bookList.size(); i++) {
			Book b = bookList.get(i);
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				removeBook = bookList.remove(i);
				break;
			} 
		}
		return removeBook;
	}

}
