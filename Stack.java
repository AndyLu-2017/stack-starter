/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	// Set up the basic elements of your data structure here.
	private String[] stack;
	private int pointer;
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	public Stack(int size) {
		stack = new String[size];
		pointer = 0;
	}

	@Override
	public boolean push(String record) {
		boolean added = false;
		for(int i = 0; i < stack.length; i++) {
			if(stack[i] == null && !added) {
				stack[i] = record;
				pointer = i;
				added = true;
			}
		}
		return added;
	}

	@Override
	public String pop() {
		String temp = stack[pointer];
		stack[pointer] = null;
		pointer -= 1;
		return temp;
	}

	@Override
	public void printStack() {
		for(int i = pointer; i >= 0; i--) 
			System.out.println(stack[i]);
	}
	
	/*
	 * Implement the other methods specified
	 * in the interface below.
	 */
	
}
