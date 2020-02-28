package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 * @param <T>
 */
public interface GenericQueue <T extends Item>
{
	/**
	 * 
	 * @param item
	 */
	public void enqueue(T item);
	
	/**
	 * 
	 */
	public T dequeue();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
