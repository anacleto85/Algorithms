package org.coursera.algorithms.p2.graph.cc;

import org.coursera.algorithms.p2.graph.representation.undirected.Ungraph;

/**
 * Connectivty Graph processing abstract class.
 * 
 * This interface is responsible to provide procedures that give
 * answer to connectivity queries among the nodes of a graph.
 * In particular, giving a graph and computing the connected components
 * of that graph, it is possible to answer connectivity queries in constant time.
 * 
 * @author alessandroumbrico
 *
 */
public abstract class CC 
{
	protected Ungraph graph;
	
	/**
	 * Find connected component in G
	 * 
	 * @param graph
	 */
	protected CC(Ungraph graph) {
		this.graph = graph;
	}
	
	/**
	 * Check if v and w are connected
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public abstract boolean connected(int v, int w);
	
	/**
	 * Number of connected components
	 * 
	 * @return
	 */
	public abstract int count();
	
	/**
	 * Connected Component identified for v. A connected component
	 * is a maximal set of conected vertices
	 * 
	 * @param v
	 * @return
	 */
	public abstract int id(int v);
}
