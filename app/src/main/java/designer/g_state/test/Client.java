package designer.g_state.test;

import designer.g_state.other.TvContext;

public class Client {
		public static void main(String[] args) {
			TvContext tvContext=new TvContext();
			tvContext.nextChannel();
			tvContext.turnOff();
			
			tvContext.turnOn();
			tvContext.nextChannel();
			tvContext.preChannel();
		}
}
