package org.coursera.algorithms.p1.week1.unionfind;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class QuickWeightedUnionUF extends UF 
{
	private int[] id;
	private int[] sz;
	
	/**
	 * 
	 * @param N
	 */
	public QuickWeightedUnionUF(int N) {
		super(N);
		this.id = new int[N];
		this.sz = new int[N];
		for (int i = 0; i < this.id.length; i++) {
			this.id[i] = i;
			this.sz[i] = 1;
		}
		
		// print initial array
		System.out.println(this);
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
		// finds root
		while (i != this.id[i]) {
			i = this.id[i];
		}
		return i;
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
		// check roots
		if (proot != qroot) 
		{
			// check tree sizes
			if (this.sz[p] < this.sz[q]) {
				// p < q
				this.id[proot] = qroot;
				// update tree size
				this.sz[q] += this.sz[p];
			}
			else {
				// p >= q
				this.id[qroot] = proot;
				this.sz[proot] += this.sz[qroot];
			}
		}
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
