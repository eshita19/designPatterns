package com.esh.behavioural;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	public void registerObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notifyObservers();

	public String getUpdate();
}

class Topic implements Subject {
	private List<Observer> observers = new ArrayList<>();
	String message = "State1";

	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		message = "state2";
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.message;
	}

}

interface Observer {
	public void update();

	public void setSubject(Subject sub);
}

class Obs implements Observer {

	private Subject subject;

	@Override
	public void update() {
		System.out.println("Got update: " + subject.getUpdate());
	}

	@Override
	public void setSubject(Subject sub) {
		this.subject = sub;
	}
}

public class ObserverPatternEx {
	public static void main(String[] args) {
		Subject sub = new Topic();
		
		Obs obs1 = new Obs();
		obs1.setSubject(sub);
		sub.registerObserver(obs1);
		
		Obs obs2 = new Obs();
		obs2.setSubject(sub);
		sub.registerObserver(obs2);
		
		sub.notifyObservers();
	}
}
