package Data.Structures;

public class Queue {
	static int cap = 5;
	static int front = 0;
	static int rear = 0;
	
	static int[] queue = new int[cap];
	
	public static boolean isFull() {
		if(rear == cap)
			return true;
		else
			return false;
	}
	
	public static boolean isEmpty() {
		if(front == rear)
			return true;
		else
			return false;
	}
	
	public static void push(int ele) {
		if(isFull())
			System.out.println("Full");
		else {
			
			queue[rear] = ele;
			rear++;
		}
	}
	
	public static void pop() {
		if(isEmpty())
			System.out.println("Empty");
		else {
			for(int i=front;i<rear-1;i++) {
				queue[i] = queue[i+1]; 
			}
			rear--;
		}
	}
	
	public static void display() {
		if(isEmpty())
			System.out.println("Empty");
		else {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		display();
	}
	

}
