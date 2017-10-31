package designer.h_resposbility.impClass;

import designer.h_resposbility.absClass.AbstractRequest;

public class Request3  extends AbstractRequest {

	public Request3(Object object) {
		super(object);
	}

	@Override
	public int getRequestLevel() {
		return 3;
	}

}
