package EX01;

public class StackMain {
	public static void main(String[] args) {
		StackX myStack = new StackX(10);
		myStack.push(100.00);
		myStack.push(200.00);
		myStack.push(300.00);
		myStack.push(400.00);
		
		while (!myStack.isEmpty()) {
			double value = myStack.pop();
			System.out.println(value);
		}

	}

}
