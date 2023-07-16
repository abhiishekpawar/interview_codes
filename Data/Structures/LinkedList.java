package Data.Structures;

public class LinkedList {

	static class Node{
		int data;
		Node address;
		
		Node(int data){
			this.data = data;
			address = null;
		}
	}
	
	Node root = null;
	
	public void insertB(int ele) {
		Node n = new Node(ele);
		
		if(root == null) {
			root=n;
		}
		else {
			n.address = root;
			root=n;
		}
	}
	
	public void insertL(int ele) {
		Node n = new Node(ele);
		Node  p =root;
		
		if(root == null)
		{
			root=n;
		}else {
			while(p.address != null) {
				p = p.address;
			}
			p.address = n;
		}
	}
	
	public void insertSL(int ele,int loc)
	{
		Node n = new Node(ele);
		if(root==null) {
			root=n;
		}else {
			
			int i =1;
			Node p = root;
			while(i<loc -1) {
				p = p.address;
				i++;
			}
			n.address = p.address;
			p.address = n;
		}
	}
	
	public void display() {
		if(root==null)
			System.out.println("Empty");
		else {
			Node p = root;
			while(p.address != null) {
				System.out.print(p.data+" ->");
				p = p.address;
			}
			System.out.println(p.data);
		}
	}

}
