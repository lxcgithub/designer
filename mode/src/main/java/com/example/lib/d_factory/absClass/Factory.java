package com.example.lib.d_factory.absClass;

public interface Factory {
	
	
	<T extends Product> T createProduct(Class<T> clz);
}
