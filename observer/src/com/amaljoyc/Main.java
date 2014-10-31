package com.amaljoyc;

public class Main {
	public static void main(String[] args) {
		Observer o1 = new ObserverOne();
		Observer o2 = new ObserverTwo();
		IntProvider provider = new IntProvider();
		provider.registerObserver(o1);
		provider.registerObserver(o2);
		
		provider.generateInt();
	}
}