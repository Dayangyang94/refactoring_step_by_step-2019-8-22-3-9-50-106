package com.tws.refactoring;

public class Driver {
    private int age;
    static int LEGAL_AGE=20;

    public Driver(int age) {
        this.age = age;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getLegalAge() {
		return Driver.LEGAL_AGE;
	}
  
}
