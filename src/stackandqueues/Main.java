package stackandqueues;

public class Main {

	public static void main(String[] args) {
		/*
		 * PROCEDURE
		 * ====================================
		 * 1.creating an Object
		 * 2.callaing method to push data to stack
		 * 3.callaing method to push data to stack
		 * 4.Calling method to Checking the size of stack 
		 * 5.Created a loop to peek and pop value till the stack gets empty
		 * 6.calling method peeking the value from stack
		 * 7.calling methodDeleting/pop the value from stack
		 * 8.calling method to printing the stack
		 */

		/*
		 * 1.creating an Object
		 */

		Stack nums = new Stack();

		/*
		 * 2.callaing method to push data to stack
		 */
		nums.push(56);
		nums.push(30);
		nums.push(70);
		/*
		 * 3.calling method to printing the stack
		 */
		nums.show();

		/*
		 * 4.Calling method to Checking the size of stack
		 */
		nums.size();

		/*
		 * 5.Created a loop to peek and pop value till the stack gets empty
		 * 
		 */

		for (int i = 0; i <= 3; i++) {
			/*
			 * 6.calling method peeking the value from stack
			 */
			System.out.println("peeking value" + nums.peek());
			/*
			 * calling method to printing the stack
			 */
			nums.show();
			/*
			 * 7.calling methodDeleting/pop the value from stack
			 */
			System.out.println("pop value" + nums.pop());
			/*
			 * 8.calling method to printing the stack
			 */
			nums.show();
		}

	}

}
