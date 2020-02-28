package org.coursera.algorithms.p2.graph;

import java.util.Iterator;

/**
 * This abstract class is responsible to process graph data. It provides the functionalities
 * to access and process the information contained by a particular graph instance. It implements
 * the algorithm computing the information required.
 * 
 * This is a design patter application that require to separate data representation 
 * (i.e. the particular data structure used to manage a set of data - the graph in 
 * this case) from data processing (i.e. the algorithm used to process the data encapsulated
 * in the associated structure).
 * 
 * @author alessandroumbrico
 *
 */
public abstract class Paths 
{
	protected Graph graph; 
	protected int source;

	/**
	 * 
	 * @param graph
	 * @param source
	 */
	public Paths(Graph graph, int source) {
		this.graph = graph;
		this.source = source;
	}
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	public abstract boolean hasPathTo(int v);
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	public abstract Iterator<Integer> pathTo(int v);
}
