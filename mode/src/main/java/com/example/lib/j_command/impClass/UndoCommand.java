package com.example.lib.j_command.impClass;

import com.example.lib.j_command.other.Army;
import com.example.lib.j_command.absClass.Command;

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
