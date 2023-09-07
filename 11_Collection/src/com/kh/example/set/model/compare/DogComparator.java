package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		double standard = o1.getWeight();		// 기준
		double object = o2.getWeight();			// 대상
		
		if(standard > object) {
			return 1;
		} else if (standard == object) {
			return o1.getName().compareTo(o2.getName());
//			return 0;
		} else {
			return -1;
		}
	}
}
