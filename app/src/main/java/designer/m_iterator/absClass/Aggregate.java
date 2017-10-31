package designer.m_iterator.absClass;

/**
 * 容器的接口
 * @author Administrator
 */
public interface Aggregate<T> {
	void  add(T  t);
	
	void remove(T t);
	
	Iterator<T> iterator();
	
}
