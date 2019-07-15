package com.example.lib.k_observer.impClass;

import com.example.lib.k_observer.absClass.Observer;

public class ConcreteObserver  implements Observer {
	private String name;
	
	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String content) {
		System.out.println(name+":   "+content);
	}
	

}
