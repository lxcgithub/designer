package com.example.lib.o_visitor;

import java.util.Random;

/**
 * @author:lenovo
 * @date:2017/10/31
 * Staff接受访问者访问。
 */

public abstract class Staff {
	public String name;
	public int kpi;
	
	public Staff(String name) {
		this.name = name;
		kpi = new Random().nextInt(10);
	}
	
	public abstract void accept(Visitor visitor);
}
