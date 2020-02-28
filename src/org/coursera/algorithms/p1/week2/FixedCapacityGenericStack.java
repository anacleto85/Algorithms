package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class FixedCapacityGenericStack implements GenericStack<Item> 
{
	private Item[] data;
	private int topIndex;
	
	/**
	 * 
	 */
	public FixedCapacityGenericStack(int capacity) {
		// create an array of generic types
		this.data = new Item[capacity];	// this.data = (Item[]) new Object[capacity];
		this.topIndex = 0;
	}
	
	/**
	 * 
	 */
	@Override
	public void push(Item item) {
		// add node on top position
		this.data[this.topIndex++] = item;
	}

	/**
	 * 
	 */
	@Override
	public Item pop() {
		// get top of the stack
		Item item = this.data[--this.topIndex];
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
