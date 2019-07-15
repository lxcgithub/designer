package com.example.lib.l_memento;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class Client {
	
	public static void main(String[] args) {
		CallOfDuty game = new CallOfDuty();
		// 玩游戏进度
		game.play();
		// 管理类（管理游戏进度类）
		Caretaker caretaker = new Caretaker();
		// 管理类保存进度类
		caretaker.archive(game.createMemoto());
		// 游戏退出
		game.quit();
		
		CallOfDuty newGame = new CallOfDuty();
		// 从管理类中拿出游戏进度
		newGame.restore(caretaker.getMemoto());
	}
}
