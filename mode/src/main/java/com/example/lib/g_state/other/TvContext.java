package com.example.lib.g_state.other;

import com.example.lib.g_state.absClass.TVState;
import com.example.lib.g_state.impClass.PowerOff;
import com.example.lib.g_state.impClass.PowerOn;

public class TvContext {
	private TVState tvState=new PowerOff();
	public void setTate(TVState tvState)
	{
		this.tvState=tvState;
	}
	
	public void turnOn()
	{
		setTate(new PowerOn());
		tvState.turnOn();
	}
	
	public void turnOff()
	{
		setTate(new PowerOff());
		tvState.turnOff();
	}
	
	public void nextChannel()
	{
		tvState.nextChannel();
	}
	public void preChannel() {
		tvState.preChannel();
	}
	
}
