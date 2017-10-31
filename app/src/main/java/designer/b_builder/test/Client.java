package designer.b_builder.test;

import designer.b_builder.impClass.Designer;
import designer.b_builder.impClass.WorkBuilder;

/**
 * 建造者模式一共有三个角色
 * 1、建造者
 * 2、设计者
 * 3、产品
 * 由于产品多种多样，设计者通过传入特定产品样式让全能的建造者去创建
 */
public class Client {
	  public static void main(String[] args) {
		     WorkBuilder worker = new WorkBuilder(); //获取工人对象
		     Designer designer = new  Designer();   //获取设计师对象
		     designer.order(worker);    //设计师指挥工人工作
		     System.out.println(worker.getRoom());;   //工人交房
		  }
}
