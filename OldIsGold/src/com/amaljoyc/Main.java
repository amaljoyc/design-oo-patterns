package com.amaljoyc;

public class Main {
	public static void main(String[] args) {
		Duck duck = new FlyDuck();
		duck.performFly();
		duck = new NoFlyDuck();
		duck.performFly();

		duck.swim();
		duck.quack();
	}
}
