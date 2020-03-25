package com.bindu.testobjects;

public class Sheru implements Tiger, Animal {
	
	public Sheru() {
		System.out.println("creating sheru");
	}

	@Override
	public void eatFood() {
		System.out.println("I am a predator, I hunt and eat my prey!");
	}

	@Override
	public void isDangerous() {
		System.out.println("Very dangerous! I am known to attack when I am hungry");
	}

}
