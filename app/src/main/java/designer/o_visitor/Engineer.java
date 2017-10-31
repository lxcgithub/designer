package designer.o_visitor;

import java.util.Random;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class Engineer extends Staff {
	
	public Engineer(String name) {
		super(name);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int getCodeLines() {
		return new Random().nextInt(10 *10000);
	}
}
