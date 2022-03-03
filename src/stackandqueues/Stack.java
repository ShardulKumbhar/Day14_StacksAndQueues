package stackandqueues;

         /*Steps
          * ====================================
          * 1.creating variable and stack to store 3 values
          * 2.Creating constructor to add new element at the top of stack
          * 3.creating method called peek to peak the top value of stack
          * 4.created method called pop which delete top value postion of stack
          * 5.method empty to define stack is empty
          * 6.created methord to check size of stack
          * 7.created method to print the elements in stack
          * ========================================
          */

			public class Stack {
				/*
				 * 1.creating variable and stack to store 3 values
				 */

				int stack[] = new int[3];
				int top = 0;

				/*
				 * 2.Creating constructor to add new element at the top of stack
				 */
				public void push(int data) {
					stack[top] = data;
					top++;
				}

				/*
				 * 3.creating method called peek to peak the top value of stack
				 */
				public int peek() {
					int data = 0;
					if (isEmpty()) {
						System.out.println("The Stack is empty");
					} else {
						data = stack[top - 1];
					}
					return data;
				}

				/*
				 * 4.created method called pop which delete top value postion of stack
				 */
				public int pop() {
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

				/*
				 * 5.method empty to define stack is empty
				 * 
				 */
				public boolean isEmpty() {

					return top <= 0;
				}

				/*
				 * 6.created methord to check size of stack
				 */
				public int size() {
					System.out.println("\n" + top);
					return top;
				}

				/*
				 * 7.created method to print the elements in stack
				 */
				public void show() {
					for (int n : stack) {
						System.out.print(n + "->");
					}
				}

			}