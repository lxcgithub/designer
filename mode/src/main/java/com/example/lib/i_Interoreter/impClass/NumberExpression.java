package com.example.lib.i_Interoreter.impClass;

import com.example.lib.i_Interoreter.absClass.ArithmeticExpression;

public class NumberExpression extends ArithmeticExpression {
	private int num;
	 
	public NumberExpression(int num) {
		this.num = num;
	}

	@Override
	public int interpret() {
		return num;
	}

}
