package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, String s) {
		fd.fileSave(file, s);		// 보이드라 return 안필요
	}
	
	public String fileOpen(String file) {
		return fd.fileOprn(file);
		
	}
	
	public void fileEdit(String file, String s) {
		fd.fileEdit(file, s);
	}
}
