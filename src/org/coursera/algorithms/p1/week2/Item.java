package org.coursera.algorithms.p1.week2;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class Item 
{
	private String value;
	
	/**
	 * 
	 * @param value
	 */
	public Item(String value) {
		this.value = value;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return this.value;
	}
}
