package com.bindu.testobjects;

public class Bakri implements Goat, Animal {

	@Override
	public void eatFood() {
		System.out.println("I love eating grass!");
	}

	@Override
	public void isDangerous() {
		System.out.println("Not at all, i am very docile!");
	}

}
