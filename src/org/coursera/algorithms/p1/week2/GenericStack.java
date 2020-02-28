package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 * @param <T>
 */
public interface GenericStack <T extends Item> 
{
	/**
	 * 
	 * @param item
	 */
	public void push(T item);
	
	/**
	 * 
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @return
	 */
	public int size();
}
