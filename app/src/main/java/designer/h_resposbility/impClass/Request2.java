package designer.h_resposbility.impClass;

import designer.h_resposbility.absClass.AbstractRequest;

public class Request2  extends AbstractRequest {

	public Request2(Object object) {
		super(object);
	}

	@Override
	public int getRequestLevel() {
		return 2;
	}

}
