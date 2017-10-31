package designer.o_visitor;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class CTOVisitor implements Visitor {
	@Override
	public void visit(Manager manager) {
		System.out.println("manager:"+manager.name+",Products"+manager.getProducts());
	}
	
	@Override
	public void visit(Engineer engineer) {
		System.out.println("engineer:"+engineer.name+",CodeLines"+engineer.getCodeLines());
	}
}
