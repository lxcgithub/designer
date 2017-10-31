package designer.i_Interoreter.impClass;

import designer.i_Interoreter.absClass.ArithmeticExpression;

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
