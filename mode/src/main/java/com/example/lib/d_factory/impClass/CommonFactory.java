package com.example.lib.d_factory.impClass;

import com.example.lib.d_factory.absClass.Factory;
import com.example.lib.d_factory.absClass.Product;

/**
 * @author lxc
 */
public class CommonFactory implements Factory {
	
	@Override
	public <T extends Product>  T createProduct(Class<T> clz)
	{
		Product api=null;
		try {
			api=(Product) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)api;
	}
}
