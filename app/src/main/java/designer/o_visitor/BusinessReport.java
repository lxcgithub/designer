package designer.o_visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class BusinessReport {
	List<Staff> mStaffs = new LinkedList<>();
	
	public BusinessReport() {
		mStaffs.add(new Manager("wang"));
		mStaffs.add(new Engineer("li"));
	}
	
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
