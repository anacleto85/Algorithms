package org.coursera.algorithms.p1.week1.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.coursera.algorithms.p1.week1.unionfind.QuickFindUF;
import org.coursera.algorithms.p1.week1.unionfind.UF;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class Question1 
{	
	/**
	 * Setup method to initialize the UF data structure to test
	 * the Union-find algorithm
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		try 
		{
			// initialize file reader
			reader = new BufferedReader(new InputStreamReader(Question1.class.getResourceAsStream("QUESTION1")));
			
			// read the first line
			String line = reader.readLine();
			// get N 
			int N = Integer.parseInt(line);
			// initialize data structure
			UF uf = new QuickFindUF(N);
			
			// go on reading union commands
			while ((line = reader.readLine()) != null) 
			{
				// get objects to connect
				String[] splits = line.split(" ");
				int p = Integer.parseInt(splits[0]);
				int q = Integer.parseInt(splits[1]);
				
				// check if connection between objects
				if (!uf.connected(p, q)) {
					// connect objects
					uf.union(p,  q);
				}
			}
			
			// print connected components
			System.out.println(uf);
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			// close reader resource
			if (reader != null) {
				try {
					reader.close();
				}
				catch (Exception ex) {
					System.err.println("Error while closing reader\n- " + ex.getMessage());
				}
			}
		}
	}
}
