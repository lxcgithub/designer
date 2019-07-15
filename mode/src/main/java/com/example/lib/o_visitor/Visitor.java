package com.example.lib.o_visitor;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public interface Visitor {
	
	public void visit(Manager manager);
	
	public void visit(Engineer engineer);
}
