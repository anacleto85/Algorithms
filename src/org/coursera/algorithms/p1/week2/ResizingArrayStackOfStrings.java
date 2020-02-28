package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class ResizingArrayStackOfStrings implements StackOfStrings 
{
	private String[] data;
	private int topIndex;
	
	/**
	 * 
	 */
	public ResizingArrayStackOfStrings() {
		this.data = new String[1];
		this.topIndex = 0;
	}

	/**
	 * 
	 */
	@Override
	public void push(String item) {
		// check array size
		if (this.topIndex == this.data.length) {
			// resize the array
			this.resize(this.data.length * 2);
		}
		
		// do insertion
		this.data[this.topIndex++] = item;
	}

	/**
	 * 
	 */
	@Override
	public String pop() {
		// remove item form the array
		String item = this.data[--this.topIndex];
		this.data[this.topIndex] = null;
		// check array size for shrinking
		if (this.topIndex > 0 && this.topIndex == this.data.length/4) {
			// shrink array to half-size
			this.resize(this.data.length/2);
		}
		return item;
	}
	
	/**
	 * 
	 */
	@Override
	public boolean isEmpty() {
		// check top index
		return (this.topIndex == 0);
	}

	/**
	 * 
	 */
	@Override
	public int size() {
		return this.data.length;
	}
	
	/**
	 * 
	 * @param capacity
	 */
	private void resize(int capacity) {
		String[] copy = new String[capacity];
		// check max value
		int max = (capacity > this.data.length) ? data.length : capacity;
		for (int i = 0; i < max; i++) {
			copy[i] = this.data[i];
		}
		// update data array
		this.data = copy;
	}
}
