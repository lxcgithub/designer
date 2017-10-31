package designer.k_observer.absClass;

import java.util.ArrayList;
import java.util.List;

/**
 * ���󱻹۲���
 * @author Administrator
 *
 */
public class AbstractSubject {
	/**
	 * ����ע��۲��߶���
	 */
	private List<Observer> list=new ArrayList<>();
	
	/**
	 * ��ӹ۲���
	 * @param observer
	 */
	public void attach(Observer observer)
	{
		list.add(observer);
		
	}
	/**
	 * ɾ���۲���
	 * @param observer
	 */
	public void detach(Observer observer)
	{
		list.remove(observer);
	}
	/**
	 * ��������ע��Ĺ۲���
	 * @param content
	 */
	public  void notifyObservers(String content)
	{
		for(Observer observer:list)
		{
			observer.update(content);
		}
	}
}
