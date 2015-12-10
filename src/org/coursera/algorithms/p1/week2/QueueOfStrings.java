package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public interface QueueOfStrings 
{
	/**
	 * 
	 * @param item
	 */
	public void enqueue(String item);
	
	/**
	 * 
	 */
	public String dequeue();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
