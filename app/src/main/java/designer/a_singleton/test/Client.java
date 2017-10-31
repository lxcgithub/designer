package designer.a_singleton.test;

import designer.a_singleton.impClass.EnumManager;

public class  Client {
		public static void main(String[] args) {
			EnumManager.SDCardManager.getSingleton();
		}
}
