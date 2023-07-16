package Data.Structures;

import java.util.Arrays;

public class Stack {
	static int cap = 5;
	static int top = -1;

	static int[] stack = new int[cap];

	public static boolean isFull() {
		if (cap == top - 1)
			return true;
		return false;
	}

	public static boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
	
	public static void display() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			for(int i=0;i<=top;i++)
				System.out.print(stack[i]+" ");
		}
		System.out.println();
	}

	public static void push(int ele) {
		if (isFull())
			System.out.println("Stack is full");
		else {
			top++;
			stack[top] = ele;
		}
	}
	
	
	public static void pop() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			top--;
		}
	}

	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		display();
		pop();
		pop();
		display();

		

	}

}
