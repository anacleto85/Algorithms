package org.coursera.algorithms.p1.week1.unionfind;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class QuickFindUF extends UF 
{
	private int[] id; 
	
	/**
	 * 
	 * @param N
	 */
	public QuickFindUF(int N) {
		super(N);
		// initialize array
		this.id = new int[N];
		for (int i = 0; i < id.length; i++) {
			this.id[i] = i;
		}
		
		// print connected components
		System.out.println(this);
	}

	/**
	 * 
	 */
	@Override
	public boolean connected(int p, int q) {
		return this.id[p] == this.id[q];
	}
	
	/**
	 * 
	 */
	@Override
	public void union(int p, int q) {
		// get objects' connected component IDs
		int pid = this.id[p];
		int qid = this.id[q];
		// merge connected components
		for (int i = 0; i < this.id.length; i++) 
		{
			// check connected component's id
			if (this.id[i] == pid) {
				// do merge
				this.id[i] = qid;
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
