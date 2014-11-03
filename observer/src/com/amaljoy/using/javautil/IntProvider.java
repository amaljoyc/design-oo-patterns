package com.amaljoy.using.javautil;

import java.util.Observable;
import java.util.Random;

public class IntProvider extends Observable {
	private int i;
	
	public void generateInt() {
		i = new Random().nextInt(10);
		setChanged();
		notifyObservers(i);
	}
	
	public int getMyRandomInt() {
		return i;
	}
}
