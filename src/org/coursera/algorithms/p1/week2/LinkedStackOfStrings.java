package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class LinkedStackOfStrings implements StackOfStrings 
{
	/**
	 * A pointer to the head of the stack
	 */
	protected Node head;
	
	/**
	 * Stack's element counter
	 */
	protected int counter;
	
	/**
	 * 
	 */
	public LinkedStackOfStrings() {
		// initialize data structure
		this.head = null;
		this.counter = 0;
	}
	
	/**
	 * 
	 */
	@Override
	public void push(String item) {
		// create new node
		Node node = new Node(item);
		// push node onto the stack
		if (this.head != null) {
			node.next = this.head;
		}
		// set the head of the stack
		this.head = node;
		// update counter
		this.counter++;
	}

	/**
	 * 
	 */
	@Override
	public String pop() {
		// item removed
		String item = this.head.item;
		// pop the head of the stack
		this.head = this.head.next;
		// update counter
		this.counter--;
		// return popped element
		return item;
	}
	
	/**
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return (this.head == null);
	}
	
	/**
	 * 
	 */
	@Override
	public int size() {
		return this.counter;
	}
	
	/**
	 * 
	 * @author alessandroumbrico
	 *
	 */
	private class Node 
	{
		protected String item;
		protected Node next;
		
		/**
		 * 
		 * @param item
		 */
		protected Node(String item) {
			this.item = item;
			next = null;
		}
	}
}
