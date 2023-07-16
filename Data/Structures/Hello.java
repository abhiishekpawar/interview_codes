package Data.Structures;

public class Hello {
	
	static class Node{
		int data;
		Node address;
		
		Node(int data){
			this.data = data;
			address = null;
			
		}
	}
	
	Node root = null;
	
	public void insertL(int data) {
		Node n = new Node(data);
		
		if(root == null)
			root = n;
		else {
			Node p = root;
			while(p.address != null) {
				p = p.address;
			}
			p.address = n;
		}
	}
	
	public void insertB(int data) {
		Node n =new Node(data);
		if(root == null)
			root = n;
		else {
			n.address=root;
			root = n;
		}
			
	}
	
	public void insertS(int data,int loc) {
		Node n = new Node(data);
		if(root == null)
			root = n;
		else {
			Node p = root;
			int i = 1;
			while(i<loc-1) {
				p = p.address;
				i++;
			}
			n.address = p.address;
			p.address = n;
			
		}
	}
	
	public void display() {
		if(root == null)
			System.out.println("Empty");
		else {
			Node p =root;
			while(p.address != null)
			{
				System.out.print(p.data+" -> ");
				p = p.address;
			}
			System.out.println(p.data);
		}
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	
	Hello h = new Hello();
	h.insertB(10);
	h.insertL(20);
	h.insertL(30);
	h.insertS(200, 3);
	h.display();
}	
	
	
	
	
	
	
	
	
	
}
