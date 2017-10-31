package designer.j_command.impClass;

import designer.j_command.other.Army;
import designer.j_command.absClass.Command;

public class AttachCommand implements Command {
	private Army army;
	
	public AttachCommand(Army army) {
		this.army = army;
	}

	@Override
	public void excute() {
		army.attack();
	}

	@Override
	public void back() {
		army.back();
	}

}
