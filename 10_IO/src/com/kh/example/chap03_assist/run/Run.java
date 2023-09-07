package com.kh.example.chap03_assist.run;

import com.kh.example.chap03_assist.part01_buffer.model.dao.BufferDAO;

public class Run {
	public static void main(String[] args) {
		BufferDAO bd = new BufferDAO();
//		bd.outputByte();
//		bd.inputByte();
//		bd.outputChar();
//		bd.inputChar();
		bd.bufferedScanner();
	}

}
