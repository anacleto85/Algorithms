package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class LinkedQueueOfStrings implements QueueOfStrings 
{
	private Node first;
	private Node last;
	
	/**
	 * 
	 */
	public LinkedQueueOfStrings() {
		this.first = null;
		this.last = null;
	}
	
	/**
	 * 
	 */
	@Override
	public void enqueue(String item) {
		// create new node
		Node node = new Node(item);
		// take reference to old last node
		Node oldLast = this.last;
		// update last node reference
		this.last = node;
		
		// check queue size
		if (this.isEmpty()) {
			// update first and last pointers
			this.first = this.last;
		}
		else {
			// set old last node to point the new last node
			oldLast.next = this.last;
		}
	}

	/**
	 * 
	 */
	@Override
	public String dequeue() {
		String item = null;
		// check queue size
		if (!this.isEmpty()) {
			// get first node item
			item = this.first.item;
			// update first node
			this.first = this.first.next;
			// check if empty 
			if (this.isEmpty()) {
				// update last pointer
				this.last = null;
			}
		}
		return item;
	}

	/**
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return this.first == null; 
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
