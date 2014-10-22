package com.amaljoyc;

public class FlyDuck extends Duck {
	public FlyDuck() {
		setFlyable(new DoFly());
	}
}
