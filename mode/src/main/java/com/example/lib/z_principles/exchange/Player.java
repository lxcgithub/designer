package com.example.lib.z_principles.exchange;

public class Player {
	private IGun iGun;
	
	public void buyGun(IGun iGun)
	{
		this.iGun=iGun;
	}
	/*
	 * 设计气球
	 */
	public void fire()
	{
		iGun.fire();
	}
}
