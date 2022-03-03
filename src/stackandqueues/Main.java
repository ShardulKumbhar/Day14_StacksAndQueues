package stackandqueues;

public class Main {

	public static void main(String[] args) {
		/*
		 * PROCEDURE
		 * ====================================
		 * 1.creating an Object
		 * 2.callaing method enQueue to Store value to Stack
		 * 3.calling method to printing queue
		 * ====================================
		 */

		/*
		 * 1.creating an Object
		 */
		Queue q = new Queue();

		/*
		 * 2.callaing method enQueue to o Store value to Stack
		 *   *storing 56,30,70
		 *   *56-is store at top of stack here 
		 *   *first In fist Out
		 */
		q.enQueue(56);
		q.enQueue(30);
		q.enQueue(70);
		/*
		 * 3.calling method to printing queue
		 */
		q.Show();
	}
}
