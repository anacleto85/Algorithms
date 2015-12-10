package org.coursera.algorithms.p2.graph.cc;

import org.coursera.algorithms.p2.graph.representation.undirected.Ungraph;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class CCImpl extends CC 
{
	private boolean[] marked;
	private int[] cc_id;
	private int cc_counter;
	
	/**
	 * 
	 * @param graph
	 */
	public CCImpl(Ungraph graph) {
		super(graph);
		this.marked = new boolean[this.graph.V()];
		this.cc_id = new int[this.graph.V()];
		this.cc_counter = 0;
		
		// initialize data structures
		for (int i = 0; i < this.marked.length; i++) {
			this.marked[i] = false;
		}
		
		// build connectivity component data
		for (int i = 0; i < this.graph.V(); i++) {
			if (!this.marked[i]) {
				// call dfs in order to compute connectivity graph
				this.dfs(i);
				// increment cc equivalence class
				this.cc_counter++;
			}
		}
	}
	
	/**
	 * 
	 */
	@Override
	public boolean connected(int v, int w) {
		return this.cc_id[v] == this.cc_id[w];
	}

	/**
	 * 
	 */
	@Override
	public int count() {
		return this.cc_counter;
	}

	/**
	 * 
	 */
	@Override
	public int id(int v) {
		return this.cc_id[v];
	}

	/**
	 * 
	 * @param v
	 */
	private void dfs(int v) {
		// set node as marked
		this.marked[v] = true;
		// set cc id
		this.cc_id[v] = this.cc_counter;
		
		// iterate on adjacent nodes
		for (int w : this.graph.adj(v)) {
			// check if the node is marked
			if (!this.marked[w]) {
				// recursive call
				this.dfs(w);
			}
		}
	}
}
