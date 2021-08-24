package EX01;

public class StackX {
	private int maxSize;
	private double StackArray[];
	private int top;
	
	public StackX (int s) {
		maxSize = s;
		StackArray = new double [maxSize];
		top = -1;
	}
	
	
	public void push (double j) {
		if (top == maxSize -1) 
			System.out.println("Stack is Fulled");
		else
			StackArray[++top] = j;
	}
	
	public double pop() {
		if(top == -1) 
			return -99;
		else
			return StackArray[top--];
	}
	
	public double peek() {
		if (top == -1)
			return -99;
		else
			return StackArray[top]; 
	}
	
	
	
	public boolean isFull () {
		if (top == maxSize -1) 
			return true;
		else
			return false;
		//return(top == maxSize -1)
	}
	
	public boolean isEmpty () {
		if (top == -1) 
			return true;
		else
			return false;
		//return(top == -1)
	}
}
