package com.example.lib.h_resposbility.impClass;

import com.example.lib.h_resposbility.absClass.AbstractRequest;
import com.example.lib.h_resposbility.absClass.Handler;

public class Handler3   extends Handler {

	@Override
	public void handle(AbstractRequest abstractRequest) {
		System.out.println("----handle3  处理请求: "+abstractRequest.getRequestLevel());
	}

	@Override
	public int getHandleLevel() {
		return 3;
	}
}