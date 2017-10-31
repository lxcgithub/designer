package designer.j_command.impClass;

import designer.j_command.other.Army;
import designer.j_command.absClass.Command;

public class UndoCommand   implements Command {
	private Army army;
	
	
	public UndoCommand(Army army) {
		this.army = army;
	}

	@Override
	public void excute() {
		army.undo();
	}

	@Override
	public void back() {
		army.back();
	}

}
