package org.coursera.algorithms.p2.graph.processing;

import java.util.Iterator;
import java.util.Stack;

import org.coursera.algorithms.p2.graph.Graph;
import org.coursera.algorithms.p2.graph.Paths;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class DepthFirstPath extends Paths 
{
	private boolean[] marked;
	private int[] edgeTo;
	
	/**
	 * Compute all reachable vertex of the graph, starting from
	 * vertex source. This algorithm is valid either for UndirectedGraph
	 * than for DirectedGraph
	 * 
	 * @param graph
	 * @param source
	 */
	public DepthFirstPath(Graph graph, int source) {
		super(graph, source);
		this.marked = new boolean[this.graph.V()];
		this.edgeTo = new int[this.graph.V()];
		
		// initialize array
		for (int i = 0; i < this.marked.length; i++) {
			this.marked[i] = false;
		}
		
		System.out.println();
		System.out.println("[DFS]: Starting DepthFirstSearch");
		// call dfs recursive procedure
		this.dfs(source);
	}

	/**
	 * 
	 */
	@Override
	public boolean hasPathTo(int v) {
		return this.marked[v];
	}

	/**
	 * 
	 */
	@Override
	public Iterator<Integer> pathTo(int v) {
		// follow parent links to find the path to the source
		Stack<Integer> stack = new Stack<Integer>();
		// check if a path exists
		if (this.hasPathTo(v)) {
			for (int i = v; i != this.source; i = this.edgeTo[i]) {
				stack.push(this.edgeTo[i]);
			}
			stack.push(this.source);
		}
		return stack.iterator();
	}

	
	/**
	 * 
	 * @param v
	 */
	private void dfs(int v) {
		// set node as marked
		this.marked[v] = true;
		System.out.println("[DFS]: Visiting node -> " + v);
		// iterate on adjacent nodes
		for (int w : this.graph.adj(v)) {
			// check if the node is marked
			if (!this.marked[w]) {
				// recursive call
				this.dfs(w);
				// set edge
				this.edgeTo[w] = v;
			}
		}
	}
}
