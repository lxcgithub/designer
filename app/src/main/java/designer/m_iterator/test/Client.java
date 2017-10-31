package designer.m_iterator.test;

import designer.m_iterator.absClass.Aggregate;
import designer.m_iterator.absClass.Iterator;
import designer.m_iterator.impClass.ConcreteAggregate;

public class Client {
	public static void main(String[] args) {
		//实例化容器类对象
		Aggregate<String> aggregate=new ConcreteAggregate<>();
		
		aggregate.add("张三");
		aggregate.add("李四");
		Iterator<String> iterator=aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
