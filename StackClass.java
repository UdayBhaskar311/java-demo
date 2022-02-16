package stackCassProject;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack();
		myStack.push(27);
		myStack.push(24);
		myStack.push(78);
		myStack.push(56);
		myStack.push(59);
		myStack.push(190);
		System.out.println("Size Of Stack: " + myStack.size());
		System.out.println("Highest Number: " + myStack.peek());

		while (myStack.isEmpty()) {
			System.out.println("Pop Item:" + myStack.pop());
		}

	}

}
