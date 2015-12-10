package org.coursera.algorithms.p1.week2.testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.coursera.algorithms.p1.week2.ResizingArrayStackOfStrings;
import org.coursera.algorithms.p1.week2.StackOfStrings;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class Main 
{
	/*
	 * The setup file. Structure:
	 * - if string equals "-", pop string from the stack and print
	 * - otherwise, push string onto stack
	 */
	private static final String STACK_SETUP = "STACK_SETUP";
	
	/**
	 * The setup method to initialize the Stack data structure for testing
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		try 
		{
			// initialize file reader
			reader = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream(STACK_SETUP)));
			
			// get stack of strings
//			StackOfStrings stack = new LinkedStackOfStrings();
//			StackOfStrings stack = new FixedCapacityStackOfStrings(10);
			StackOfStrings stack = new ResizingArrayStackOfStrings();
			
			// go on reading union commands
			String line;
			while ((line = reader.readLine()) != null) 
			{
				// get objects to connect
				String[] splits = line.split(" ");
				for (String str : splits) {
					// check string
					if (str.equals("-")) {
						// pop an element from the stack
						String value = stack.pop();
						System.out.print(value + " ");
					}
					else {
						// push string onto the stack
						stack.push(str);
					}
				}
			}
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
