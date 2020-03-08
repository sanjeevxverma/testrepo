package com.bindu.testobjects;

public class Tommy implements Dog {

	@Override
	public void eatFood() {
		System.out.println("I eat dog food");
	}

	@Override
	public void isDangerous() {
		System.out.println("Heck no, i am man's best friend!");
	}

}
