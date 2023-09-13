package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public HashSet<Lottery> selectAll() {
		return lottery;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = false;
		Lottery draw = null;
		Iterator<Lottery> it = lottery.iterator();
		while(it.hasNext()) {
			draw = it.next();
			if(draw.getName().equals(l.getName()) && draw.getPhone().equals(l.getPhone())) {
				result = lottery.remove(draw);
				break;
			}
		}
		if(!win.isEmpty() && result) {
			win.remove(draw);
		}
		return result;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<Lottery>(lottery);
		
		if(lottery.size() < 4) {
			return null;
		} else {
			while(win.size() != 4) {
				int random = (int)(Math.random() * list.size());
				win.add(list.get(random));
			}
		}
		return win;
	}
		
	public boolean searchWinner(Lottery l) {
		Iterator<Lottery> it = win.iterator();
		while(it.hasNext()) {
			Lottery win = it.next();
			if(win.getName().equals(l.getName()) && win.getPhone().equals(l.getPhone())) {
				return true;
			}
		}
		return false;
	}
}
