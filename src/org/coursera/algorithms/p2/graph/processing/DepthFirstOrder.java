package org.coursera.algorithms.p2.graph.processing;

import java.util.Stack;

import org.coursera.algorithms.p2.graph.representation.directed.Digraph;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class DepthFirstOrder 
{
	private boolean[] marked;
	private Stack<Integer> reversePost;
	
	/**
	 * The input graph has to be a DAG - Directed Acyclic Graph, in order
	 * to compute the topological sort of its nodes.
	 * 
	 * @param G
	 */
	public DepthFirstOrder(Digraph G) {
		this.reversePost = new Stack<Integer>();
		this.marked = new boolean[G.V()];
		for (int i = 0; i < G.V(); i++) {
			if (!this.marked[i]) {
				// compute dfs
				this.dfs(G, i);
			}
		}
	}
	
	/**
	 * Returns all vertices in "reverse DFS postorder" which
	 * is the topological sort
	 * 
	 * @return
	 */
	public Iterable<Integer> reversePost() {
		return this.reversePost;
	}
	
	
	/**
	 * 
	 * @param G
	 * @param v
	 */
	private void dfs(Digraph G, int v) {
		// mark node
		this.marked[v] = true;
		// get adjacent nodes
		for (int w : G.adj(v)) {
			if (!this.marked[w]) {
				// recursive call
				this.dfs(G, w);
			}
		}
		// put node into the stack
		this.reversePost.push(v);
	}
}
