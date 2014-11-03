package com.amaljoy.using.javautil;

import java.util.Observable;
import com.amaljoyc.Display;

/**
 * This observer uses the PUSH method
 * That is the Subject/Observable pushes the data to Observers
 * 
 * @author amal
 */

public class ObserverTwo implements java.util.Observer, Display {
	private int i;

	@Override
	public void update(Observable o, Object arg) {
		i = (int) arg;
		display();
	}

	@Override
	public void display() {
		System.out.println("Int value in ObserverTwo using PUSH method: " + i);
	}

}