package com.amaljoyc;

public class Duck {
	Flyable flyable;

	public Duck() {
		flyable = new DoFly();
	}

	public void swim() {
		System.out.println("Swimming");
	}

	public void quack() {
		System.out.println("Quacking");
	}
}
