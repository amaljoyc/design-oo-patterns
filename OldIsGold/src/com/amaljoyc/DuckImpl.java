package com.amaljoyc;

public class DuckImpl extends Duck {
	public static void main(String[] args) {
		Duck d = new DuckImpl();
		d.swim();
		d.quack();
		d.flyable.fly();
	}
}
