package com.example.lib.o_visitor;

import java.util.Random;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class Manager extends Staff {
	
	private int products;
	
	public Manager(String name) {
		super(name);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int getProducts() {
		return products = new Random().nextInt(10);
	}
}
