package com.example.lib.c_prototype.test;

import com.example.lib.c_prototype.impClass.OrderDealFactory;
import com.example.lib.c_prototype.impClass.PersonOrder;

public class Client {

	public static void main(String[] args) {
		OrderDealFactory orderDealFactory=new OrderDealFactory();
		PersonOrder order=new PersonOrder();
		order.setOderNumber(3500);
		order.setOrderName("个人订单");
		orderDealFactory.dealOrder(order);
	}
}
