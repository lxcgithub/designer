package designer.h_resposbility.impClass;

import designer.h_resposbility.absClass.AbstractRequest;

public class Request1 extends AbstractRequest {

	public Request1(Object object) {
		super(object);
		
		
	}

	@Override
	public int getRequestLevel() {
		return 1;
	}

}
