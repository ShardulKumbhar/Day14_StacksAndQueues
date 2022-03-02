package stackandqueues;

public class Stack {

	int stack[] = new int[3]; // taking Stack to store 3 value
	int top = 0;

	public void push(int data) {
		stack[top] = data; // every new elements at top of stack
		top++;
	}

	public int peek() { // peeking top values of stack
		int data = 0;
		if (isEmpty()) {
			System.out.println("The Stack is empty");
		} else {
			data = stack[top - 1];
		}
		return data;
	}

	public int pop() { // deleting top value
		int data = 0;
		if (isEmpty()) {
			System.out.println("The Stack is empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	public boolean isEmpty() { // defined empty<=0

		return top <= 0;
	}

	public int size() { // to check stack size
		System.out.println("\n" + top);
		return top;
	}

	public void show() // method to print every element
	{
		for (int n : stack) {
			System.out.print(n + "->");
		}
	}

	public static void main(String[] args) {
		Stack nums = new Stack();
		nums.push(56);
		nums.push(30);
		nums.push(70);
		nums.show();

		nums.size();// check the stack size

		// to peek and pop the value alternatly till the stack is empty
		for (int i = 0; i <= 3; i++) {
			System.out.println("peeking value" + nums.peek());
			nums.show();
			System.out.println("pop value" + nums.pop());
			nums.show();
		}

	}
}