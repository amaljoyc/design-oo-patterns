package com.amaljoyc;

public class Duck {
	private Flyable flyable;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void performFly() {
		this.flyable.fly();
	}

	public void swim() {
		System.out.println("Swimming");
	}

	public void quack() {
		System.out.println("Quacking");
	}
}
