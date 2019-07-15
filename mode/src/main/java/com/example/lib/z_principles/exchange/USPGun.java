package com.example.lib.z_principles.exchange;

public class USPGun implements IGun {
	
	@Override
	public void fire() {
		System.out.println("USP: 开枪了");
	}
	public void fire(int number) {
		System.out.println("USP: 开枪了");
	}
}
