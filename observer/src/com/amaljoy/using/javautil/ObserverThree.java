package com.amaljoy.using.javautil;

import java.util.Observable;
import com.amaljoyc.Display;

/**
 * This observer uses the PULL method
 * That is the Observers pulls the data from Subject/Observable
 * 
 * @author amal
 */

public class ObserverThree implements java.util.Observer, Display {
	private int i;
	private IntProvider intProvider;

	@Override
	public void update(Observable o, Object arg) {
		intProvider = (IntProvider) o;
		i = (int) arg;
		display();
	}

	@Override
	public void display() {
		System.out.println("Int value in ObserverThree using PULL method: " + intProvider.getMyRandomInt());
	}

}
