package com.amaljoyc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntProvider implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private int i;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(i);
		}
	}

	public void generateInt() {
		i = new Random().nextInt(10);
		notifyObservers();
	}

}