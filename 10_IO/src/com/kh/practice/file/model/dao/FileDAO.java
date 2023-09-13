package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {	// 파일이 있는지 확인하는 메소드exists() 사용
		return new File(file).exists();
		
	}

	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter(file);) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String fileOprn(String file) {
		String content = "";
		try(FileReader fr = new FileReader(file);) {
			int value;
			while((value = fr.read()) != -1) {
				content += (char) value;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return content;
	}
	
	public void fileEdit(String file, String s) {	//이어붙히기 true
		try(FileWriter fw = new FileWriter(file, true);) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
