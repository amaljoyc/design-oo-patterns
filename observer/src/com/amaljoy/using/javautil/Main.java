package com.amaljoy.using.javautil;

import java.util.Observer;

public class Main {
	public static void main(String[] args) {
		Observer o1 = new ObserverOne();
		Observer o2 = new ObserverTwo();
		Observer o3 = new ObserverThree();
		IntProvider provider = new IntProvider();
		provider.addObserver(o1);
		provider.addObserver(o2);
		provider.addObserver(o3);

		provider.generateInt();
	}
}