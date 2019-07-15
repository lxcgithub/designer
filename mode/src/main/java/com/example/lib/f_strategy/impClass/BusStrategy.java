package com.example.lib.f_strategy.impClass;

import com.example.lib.f_strategy.absClass.CalculateStrategy;

/**
 * @author:lenovo
 * @date:2017/10/31
 * 具体策略
 */

public class BusStrategy implements CalculateStrategy {
	
	@Override
	public int calculatePrice(int km) {
		return 3;
	}
}
