package designer.f_strategy;

import designer.f_strategy.absClass.CalculateStrategy;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class TransficCalculator {
	
	CalculateStrategy mStrategy;
	
	public void setStrategy(CalculateStrategy strategy) {
		this.mStrategy = strategy;
	}
	
	public int calculatePrice(int km) {
		return mStrategy.calculatePrice(km);
	}
}
