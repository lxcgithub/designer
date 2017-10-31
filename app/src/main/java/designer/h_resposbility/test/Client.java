package designer.h_resposbility.test;


import designer.h_resposbility.absClass.AbstractRequest;
import designer.h_resposbility.absClass.Handler;
import designer.h_resposbility.impClass.Handler1;
import designer.h_resposbility.impClass.Handler2;
import designer.h_resposbility.impClass.Handler3;
import designer.h_resposbility.impClass.Request3;

/**
 * 类似于单链表的形式
 * 请求从队伍头部开始分发
 */
public class Client {
	public static void main(String[] args) {
		//确定链式关系
		Handler handler1=new Handler1();
		Handler handler2=new Handler2();
		Handler handler3=new Handler3();
		handler1.nextHandler=handler2;
		handler2.nextHandler=handler3;
		
		AbstractRequest request3=new Request3("请求1");
		
		handler1.handleRequest(request3);
	}
}
