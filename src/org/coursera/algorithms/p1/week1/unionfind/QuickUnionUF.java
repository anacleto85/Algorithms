package org.coursera.algorithms.p1.week1.unionfind;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class QuickUnionUF extends UF 
{
	private int[] id;
	
	/**
	 * 
	 * @param N
	 */
	public QuickUnionUF(int N) {
		super(N);
		this.id = new int[N];
		for (int i = 0; i < this.id.length; i++) {
			this.id[i] = i;
		}
	}
	
	/**
	 * 
	 */
	@Override
	public boolean connected(int p, int q) {
		return this.root(p) == this.root(q);
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	private int root(int i) 
	{
		int root = i;
		if (this.id[i] != i) {
			root = this.root(this.id[i]);
		}
		return root;
	}

	/**
	 * 
	 */
	@Override
	public void union(int p, int q) {
		// get p root
		int proot = this.root(p);
		// get q root
		int qroot = this.root(q);
		// update p's root to point q's root
		this.id[proot] = qroot;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		// initialize description
		String description = "[";
		for (int i = 0; i < this.id.length; i++) {
			description += " " + i + "=["+ this.id[i] +"] ";
		}
		// close description
		description += "]";
		return description;
	}
}
