package com.example.lib.d_factory.test;


import com.example.lib.d_factory.absClass.Product;
import com.example.lib.d_factory.impClass.CommonFactory;
import com.example.lib.d_factory.impClass.ProductA;
import com.example.lib.d_factory.impClass.ProductB;
import com.example.lib.d_factory.impClass.SimplyFactory;

/**
 * 工厂方法
 *
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * 分为：工厂、产品
 *
 */
public class Client {

	public static void main(String[] args) {
		
		// 二者相差是否新建工厂类
		
		Product obj = SimplyFactory.createProduct(ProductA.class);
		System.out.println("简单工厂价格："+obj.price());
		
		CommonFactory factory = new CommonFactory();
		Product obj2 = factory.createProduct(ProductB.class);
		System.out.println("工厂方法价格："+obj2.price());
	}

}
