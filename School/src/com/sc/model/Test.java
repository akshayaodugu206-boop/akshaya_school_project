package com.sc.model;

public class Test {
		private String name;
	private int age;
private String sex;
	public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

	public Test() {
	}

	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
