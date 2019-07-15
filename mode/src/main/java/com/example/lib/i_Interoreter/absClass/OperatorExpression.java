package com.example.lib.i_Interoreter.absClass;

public abstract class OperatorExpression extends ArithmeticExpression {
	public ArithmeticExpression expression1,expression2;

	public OperatorExpression(ArithmeticExpression expression1,
			ArithmeticExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	
	
	
}
