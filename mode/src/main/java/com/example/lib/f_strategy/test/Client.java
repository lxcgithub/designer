package com.example.lib.f_strategy.test;

import com.example.lib.f_strategy.impClass.BusStrategy;
import com.example.lib.f_strategy.impClass.SubwayStrategy;
import com.example.lib.f_strategy.TransficCalculator;

/**
 * @author:lenovo
 * @date:2017/10/31
 */

public class Client {
	
	private static final int BUS = 1;
	private static final int SUBWAY = 1;
	
	public static void main(String[] args){
		TransficCalculator calcuitor = new TransficCalculator();
		calcuitor.setStrategy(new BusStrategy());
		System.out.println("16公里公交票价为"+calcuitor.calculatePrice(16));
		calcuitor.setStrategy(new SubwayStrategy());
		System.out.println("16公里地铁票价为"+calcuitor.calculatePrice(16));
	}
}
