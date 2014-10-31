package com.amaljoyc;

public class ObserverTwo implements Observer, Display {
	private int i;

	@Override
	public void update(int i) {
		this.i = i;
		display();
	}

	@Override
	public void display() {
		System.out.println("Int value in ObserverTwo: " + i);
	}

}
