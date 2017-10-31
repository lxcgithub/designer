package designer.g_state.impClass;

import designer.g_state.absClass.TVState;

public class PowerOn  implements TVState {

	@Override
	public void nextChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void preChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void turnOn() {
		System.out.println("���ڿ���");
	}

	@Override
	public void turnOff() {
		System.out.println("�ػ�");
	}

}
