package com.example.lib.d_factory.impClass;

import com.example.lib.d_factory.absClass.Product;

public class ProductA implements Product {
	
	@Override
	public int price() {
		return 10;
	}
}
