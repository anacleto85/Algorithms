package org.coursera.algorithms.p2.graph.processing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.coursera.algorithms.p2.graph.Graph;
import org.coursera.algorithms.p2.graph.Paths;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class BreadthFirstPath extends Paths 
{
	private boolean[] marked;
	private int[] edgeTo;
	
	/**
	 * 
	 * @param graph
	 * @param source
	 */
	public BreadthFirstPath(Graph graph, int source) {
		super(graph, source);
		this.marked = new boolean[this.graph.V()];
		this.edgeTo = new int[this.graph.V()];
		
		// initialize marked array
		for (int i = 0; i < this.marked.length; i++) {
			this.marked[i] = false;
		}
		
		System.out.println();
		System.out.println("[BFS]: Starting Breadht First Search");
		// start bfs
		this.bfs(this.source);
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
		Stack<Integer> stack = new Stack<Integer>();
		// check if a path exists
		if (this.hasPathTo(v)) {
			// compute the path
			for (int i = v; i != this.source; i = this.edgeTo[i]) {
				stack.push(this.edgeTo[i]);
			}
			// add source
			stack.push(this.source);
		}
		return stack.iterator();
	}

	/**
	 * 
	 * @param s
	 */
	private void bfs(int s) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		// set as marked
		this.marked[s] = true;
		while (!queue.isEmpty()) {
			// extract the head of the queue
			int v = queue.remove();
			System.out.println("[BFS]: Dequeued node -> " + v);
			// get adjacent nodes
			for (int w : this.graph.adj(v)) {
				// check if it is marked
				if (!this.marked[w]) {
					// add to queue
					queue.add(w);
					// set as marked
					this.marked[w] = true;
					// set parent
					this.edgeTo[w] = v;
				}
			}
		}
	}
}
