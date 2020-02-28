package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class FixedCapacityStackOfStrings implements StackOfStrings 
{
	private String[] data;
	private int topIndex;
	
	/**
	 * 
	 * @param capacity
	 */
	public FixedCapacityStackOfStrings(int capacity) {
		this.data = new String[capacity];
		this.topIndex = 0;
	}

	/**
	 * 
	 */
	@Override
	public void push(String item) {
		// add node on top position
		this.data[this.topIndex++] = item;
	}

	/**
	 * 
	 */
	@Override
	public String pop() {
		String item = this.data[--this.topIndex];
		// this operation is needed to avoid LOITERING
		this.data[this.topIndex] = null;
		return item;
	}

	/**
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return this.topIndex == 0;
	}

	/**
	 * 
	 */
	@Override
	public int size() {
		return this.data.length;
	}
}
