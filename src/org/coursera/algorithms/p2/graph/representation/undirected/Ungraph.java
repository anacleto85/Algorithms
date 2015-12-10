package org.coursera.algorithms.p2.graph.representation.undirected;

import org.coursera.algorithms.p2.graph.Graph;


/**
 * UndirectedGraph abstract class implementation.
 * This abstract class is responsible to encapsulate graph data. It provide a set of
 * functionalities that allow to access graph data structure, whathever implementation is used.
 * 
 * This is a design patter application that require to separate data representation 
 * (i.e. the particular data structure used to manage a set of data - the graph in 
 * this case) from data processing (i.e. the algorithm used to process the data encapsulated
 * in the associated structure).
 * 
 * @author alessandroumbrico
 *
 */
public abstract class Ungraph extends Graph 
{
	/**
	 * 
	 */
	protected Ungraph() {
		super();
	}
}
