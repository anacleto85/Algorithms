package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class LinkedGenericStack implements GenericStack<Item> 
{
	protected Node head;
	protected int counter;
	
	/**
	 * 
	 */
	public LinkedGenericStack() {
		// initialize data structure
		this.head = null;
		this.counter = 0;
	}
	
	/**
	 * 
	 */
	@Override
	public void push(Item item) {
		// create new node
		Node node = new Node(item);
		// push node onto stack
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
	public Item pop() {
		// item removed
		Item item = this.head.item;
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
		return this.head == null;
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
		protected Item item;
		protected Node next;
		
		/**
		 * 
		 * @param item
		 */
		protected Node(Item item) {
			this.item = item;
			next = null;
		}
	}
}
