package com.example.lib.l_memento;

/**
 * @author:lenovo
 * @date:2017/10/31
 * 管理备忘录对象
 */

public class Caretaker {
	Memoto mMemoto;
	
	/**
	 * store
	 */
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}
	
	/**
	 * get memoto
	 */
	public Memoto getMemoto() {
		return mMemoto;
	}
}
