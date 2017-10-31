package designer.o_visitor;

/**
 * @author:lenovo
 * @date:2017/10/31
 * 数据根据不同的访问者，选择性暴露
 */

public class Client {
	
	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		report.showReport(new CEOVisitor());
		report.showReport(new CTOVisitor());
	}
}
