package org.coursera.algorithms.p2.graph.representation.directed;

import org.coursera.algorithms.p2.graph.Graph;


/**
 * DirectedGraph abstract class implementation.
 * 
 * @author alessandroumbrico
 *
 */
public abstract class Digraph extends Graph 
{
	/**
	 * 
	 */
	protected Digraph() {
		super();
	}
	
	/**
	 * Reverse of this graph
	 * 
	 * @return
	 */
	public abstract Digraph reverse();
}