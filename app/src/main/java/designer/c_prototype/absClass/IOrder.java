package designer.c_prototype.absClass;

/**
 * 通过继承使拥有克隆功能
 */
public interface IOrder extends Prototype {
	
	int getOderNumber();
	
	void setOderNumber(int number);
}
