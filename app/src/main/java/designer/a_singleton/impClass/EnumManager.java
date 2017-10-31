package designer.a_singleton.impClass;

public  enum EnumManager {
	/**
	 * sd卡管理器
	 */
	SDCardManager(10)
	{
			
		@Override
		public EnumManager getSingle() {
			return SDCardManager;
		}

		
	}
	,
	/**
	 * http管理器
	 */
	HttpManager(1) {
		@Override
		public EnumManager getSingle() {
			return null;
		}
	};
	
	public SdCardImpl getSingleton()
	{
		return new SdCardImpl();
	}
	
	
	public abstract EnumManager getSingle();
	private  EnumManager(int type)
	{
		
	}

}
