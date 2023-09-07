package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}
	
	@Override
	public boolean equals(Object obj) {
		// 객체 자체 비교 (주소값을 비교)
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		// 객체 내용 비교 (객체의 값)
		Dog other = (Dog)obj;
		if(name == null) {		//null 포인터 익셉션 걸러주는용도
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		
		return result;
	}

	@Override
	public int compareTo(Dog o) {
		return -name.compareTo(o.name);
	}
	
	
	
	
	
	

}
