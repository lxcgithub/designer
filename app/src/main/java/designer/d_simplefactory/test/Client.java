package designer.d_simplefactory.test;


import designer.d_simplefactory.absClass.Api;
import designer.d_simplefactory.impClass.Factory;

public class Client {

	public static void main(String[] args) {
		
		Api obj = Factory.create(2);
		
		obj = Factory.create(3);
		
	}

}
