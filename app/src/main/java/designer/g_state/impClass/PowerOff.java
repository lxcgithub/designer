package designer.g_state.impClass;

import designer.g_state.absClass.TVState;

public class PowerOff implements TVState {

	@Override
	public void nextChannel() {
	}

	@Override
	public void preChannel() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("����");
	}

	@Override
	public void turnOff() {
		System.out.println("�ػ� ��Ч");
	}

}
