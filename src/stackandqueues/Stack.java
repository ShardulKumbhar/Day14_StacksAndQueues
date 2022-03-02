package stackandqueues;

public class Stack {

	int stack[] = new int[3];
	int top = 0;

	public void push(int data) {
		stack[top] = data; // every new elements at top of stack
		top++;
	}

	public void show() // method to print every element
	{
		for (int n : stack) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Stack nums = new Stack();
		nums.push(56);
		nums.push(30);
		nums.push(70);
		nums.show();
	}
}