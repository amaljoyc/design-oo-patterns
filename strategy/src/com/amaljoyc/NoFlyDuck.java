package com.amaljoyc;

public class NoFlyDuck extends Duck {
	public NoFlyDuck() {
		setFlyable(new DoNotFly());
	}
}
