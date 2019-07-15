package com.example.lib.j_command.impClass;

import com.example.lib.j_command.other.Army;
import com.example.lib.j_command.absClass.Command;

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
