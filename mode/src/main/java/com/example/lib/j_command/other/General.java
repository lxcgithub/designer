package com.example.lib.j_command.other;

import com.example.lib.j_command.absClass.Command;
import com.example.lib.j_command.impClass.AttachCommand;
import com.example.lib.j_command.impClass.UndoCommand;

/**
 * ����
 * @author Administrator
 *
 */
public class General {
	private Command undoCommand;
	private Command attackCommand;
	
	
	public General()
	{
		//����ʿ��
		Soldier soldier=new Soldier();
		//��������
		Army army=new Army(soldier);
		undoCommand=new UndoCommand(army);
		attackCommand =new AttachCommand(army);
	}
	/**
	 * �ʵ۵��ô󳼹�������
	 */
	public void attach()
	{
		attackCommand.excute();
	}
	public  void  undo()
	{
		undoCommand.back();
	}
	
}
