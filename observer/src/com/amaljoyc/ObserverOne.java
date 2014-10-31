package com.amaljoyc;

public class ObserverOne implements Observer, Display {
	private int i;

	@Override
	public void update(int i) {
		this.i = i;
		display();
	}

	@Override
	public void display() {
		System.out.println("Int value in ObserverOne: " + i);
	}

}
