package designer.d_simplefactory.impClass;

import designer.d_simplefactory.absClass.Api;

public class Factory {

	public static Api create(int type){
		switch (type) {
		case 1:
			return new ImplA();
		case 2:
			return new ImplB();
		case 3:
			return new ImplC();
		default:
			return new ImplC();
		}
	}
	
	public <T extends Api> T creatProduct(Class<T> clz)
	{
		Api  api=null;
		try {
			api=(Api) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)api;
	}
}
