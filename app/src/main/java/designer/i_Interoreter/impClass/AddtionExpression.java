package designer.i_Interoreter.impClass;

import designer.i_Interoreter.absClass.ArithmeticExpression;
import designer.i_Interoreter.absClass.OperatorExpression;

public class AddtionExpression extends OperatorExpression {

	public AddtionExpression(ArithmeticExpression expression1,
			ArithmeticExpression expression2) {
		super(expression1, expression2);
		
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
