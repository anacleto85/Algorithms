package org.coursera.algorithms.p2.graph;


/**
 * 
 * @author alessandroumbrico
 *
 */
public abstract class Graph 
{
	protected int V;			// graph vertex number
	protected int E;			// graph edge number
	
	/**
	 * Add an edge (v,w) to the graph
	 * 
	 * @param v
	 * @param w
	 */
	public abstract void addEdge(int v, int w);
	
	/**
	 * Iterator over vertices adjacent to v
	 * 
	 * @param v
	 * @return
	 */
	public abstract Iterable<Integer> adj(int v);
	
	/**
	 * Returns the number of vertices of the graph
	 * 
	 * @return
	 */
	public int V() {
		return this.V;
	}
	
	/**
	 * Returns the number of edges of the graph
	 * 
	 * @return
	 */
	public int E() {
		return this.E;
	}
	
	/**
	 * String graph representation
	 */
	@Override
	public abstract String toString();
}
