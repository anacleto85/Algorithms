package org.coursera.algorithms.p1.week1.unionfind;

/**
 * 
 * Coursera.org - Algorithms Part I course
 * [Week 1] - Union Find problem
 * 
 * We will see a set of algorithms to solve the so called 
 * dynamic connectivity problem.
 * 
 * @author alessandroumbrico
 *
 */
public abstract class UF 
{
	protected int size;
	
	/**
	 * Initialize Union-Find data structure with N objects (0 to N-1)
	 * @param N
	 */
	public UF(int N) {
		this.size = N;
	}
	
	/**
	 * Add connection between p and q objects
	 * 
	 * @param p
	 * @param q
	 */
	public abstract void union(int p, int q);
	
	/**
	 * Check if p and q objects are connected, i.e. check if 
	 * the two objects belong to the same connected component
	 *  
	 * @param p
	 * @param q
	 * @return
	 */
	public abstract boolean connected(int p, int q);
}
