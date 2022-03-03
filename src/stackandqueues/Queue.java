package stackandqueues;


              	/*Steps
				 * ====================================
				 * 1.creating a queue to store 5 elements in stack
				 * 2. construtor to take data in stack
				 * 3.method to print the stack values
				 * ==================================
				 */
				public class Queue {
					/*
					 * 1.creating a queue to store 5 elements in stack
					 */
					int queue[] = new int[5];
					int size;
					int front;
					int rear;

					/*
					 * 2. constructor to take data in stack
					 */
					public void enQueue(int data) {

						queue[rear] = data;
						rear = rear + 1;
						size = size + 1;

					}

					/*
					 * 3.method to print the stack values
					 */
					public void Show() {
						System.out.println("Elements ");
						for (int i = 0; i < size; i++) {
							System.out.print(queue[i] + "->");
						}
					}
				}
