package com.example.lib.a_singleton.impClass;

public class InnnerClassSingle {
	private InnnerClassSingle()
	{
		
	}
	private static class SingleHodler{
		private static final InnnerClassSingle instance=
				new InnnerClassSingle();
	}

	public static InnnerClassSingle getInstance()
	{
		return SingleHodler.instance;
	}
}
