package designer.k_observer.test;

import designer.k_observer.absClass.Observer;
import designer.k_observer.impClass.ConcreteObserver;
import designer.k_observer.impClass.ConcreteSubject;

public class Client {
		public static void main(String[] args) {
			ConcreteSubject subject=new ConcreteSubject();
			Observer observer1=new ConcreteObserver("??????");
			Observer observer2=new ConcreteObserver("??????");
			Observer observer3=new ConcreteObserver("???????");
			subject.attach(observer1);
			subject.attach(observer2);
			subject.attach(observer3);
			subject.notifyObservers("??????? ??????��");
		}
}
