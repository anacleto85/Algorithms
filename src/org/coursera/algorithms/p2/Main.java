package org.coursera.algorithms.p2;

import org.coursera.algorithms.p2.graph.processing.DepthFirstOrder;
import org.coursera.algorithms.p2.graph.representation.directed.Digraph;
import org.coursera.algorithms.p2.graph.representation.directed.DigraphAdjVertexImpl;


/**
 * 
 * @author alessandroumbrico
 *
 */
public class Main 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String exercise = "ex1_directedgraph_q2";
		String input = Main.class.getResource(exercise).getPath();
		// get digraph
		Digraph graph = new DigraphAdjVertexImpl(input);
		// run TopologicalOrder
		DepthFirstOrder ord = new DepthFirstOrder(graph);
		System.out.println();
		System.out.println("[Topological Order]");
		for (Integer v : ord.reversePost()) {
			System.out.print(" -> " + v);
		}
	}
}
