package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public boolean addList(Music music) {
		return 	list.add(music);
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		
		if(list.contains(music)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public List<Music> printAll() {
		return list;
		
	}
	
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			} 
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.remove(m);
				return m;
			} 
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				return list.set(i, music);
			}
		}
		return null;
	}

}
