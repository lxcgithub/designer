package designer.k_observer.impClass;

import designer.k_observer.absClass.Observer;

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
