package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public interface StackOfStrings 
{
	/**
	 * 
	 * @param item
	 */
	public void push(String item);
	
	/**
	 * 
	 * @return
	 */
	public String pop();
	
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
