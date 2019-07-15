package com.example.lib.m_iterator.impClass;

import java.util.ArrayList;
import java.util.List;

import com.example.lib.m_iterator.absClass.Aggregate;
import com.example.lib.m_iterator.absClass.Iterator;

/**
 * 具体的容器接口
 * 军队
 * @author Administrator
 *
 * @param <T>
 */
public class ConcreteAggregate<T>  implements Aggregate<T> {
	private List<T> list=new ArrayList<>();
	@Override
	public void add(T t) {
		list.add(t);
	}
	
	@Override
	public void remove(T t) {
		list.remove(t);
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ConcreteItertor<>(list);
	}
	
}
