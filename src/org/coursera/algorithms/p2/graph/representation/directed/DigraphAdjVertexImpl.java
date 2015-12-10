package org.coursera.algorithms.p2.graph.representation.directed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;


/**
 * 
 * @author alessandroumbrico
 *
 */
public class DigraphAdjVertexImpl extends Digraph 
{
	private List<Integer>[] adj;

	/**
	 * 
	 * @param V
	 */
	@SuppressWarnings("unchecked")
	public DigraphAdjVertexImpl(int V) {
		super();
		this.V = V;
		this.adj = (List<Integer>[]) new List[this.V];
		
		// initialize empty graph
		for (int i = 0; i < this.V; i++) {
			this.adj[i] = new LinkedList<Integer>();
		}
	}
	
	/**
	 * 
	 * @param inputFile
	 */
	@SuppressWarnings("unchecked")
	public DigraphAdjVertexImpl(String inputFile) {
		super();
		BufferedReader reader = null;
		try {
			// input file
			File file = new File(inputFile);
			// get reader
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			int lineCounter = 0;

			System.out.println("Parsing graph - " + inputFile);
			// read file
			while ((line = reader.readLine()) != null) {
				// read first two line
				if (lineCounter == 0) {
					// first line, parse vertex number
					this.V = Integer.parseInt(line);
					// initialize data structure
					this.adj = (List<Integer>[]) new List[this.V];
					for (int v = 0; v < V; v++) {
						this.adj[v] = new LinkedList<Integer>();
					}
				}
				else if (lineCounter == 1) {
					// second line, parse edge number
					this.E = Integer.parseInt(line);
				}
				else {
					// parse edges
					String[] str = line.split(" ");
					int from = Integer.parseInt(str[0]);
					int to = Integer.parseInt(str[1]);
					
					// update adjacent list
					this.adj[from].add(to);
					System.out.println("from=" + from + " -> to=" + to);
				}
				
				lineCounter++;
			}
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		finally {
			if (reader != null) {
				try {
					reader.close();
				}
				catch (Exception ex) {
					System.err.println(ex.getMessage());
				}
			}
		}
	}
	
	/**
	 * 
	 */
	@Override
	public void addEdge(int v, int w) {
		this.adj[v].add(w);
	}

	/**
	 * 
	 */
	@Override
	public Iterable<Integer> adj(int v) {
		return new LinkedList<Integer>(this.adj[v]);
	}

	/**
	 * 
	 */
	@Override
	public Digraph reverse() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String str = "G=(V="+this.V+",E="+this.E+")\n";
		for (int v = 0; v < this.V; v++) {
			for (int w : this.adj[v]) {
				str += "edge: from="+v+" -> to="+w;
			}
		}
		return str;
	}
}
