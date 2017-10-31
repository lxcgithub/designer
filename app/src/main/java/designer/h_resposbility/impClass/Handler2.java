package designer.h_resposbility.impClass;

import designer.h_resposbility.absClass.AbstractRequest;
import designer.h_resposbility.absClass.Handler;

public class Handler2 extends Handler {

	@Override
	public void handle(AbstractRequest abstractRequest) {
		System.out.println("----handle2  处理请求: "+abstractRequest.getRequestLevel());
	}

	@Override
	public int getHandleLevel() {
		return 2;
	}

}
