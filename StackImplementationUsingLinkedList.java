class StackImplementationUsingLinkedList{
	
 Node head = null;	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public void push(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;	
	}
	
	public void pop(){
		if(head==null)
			System.out.println("Underflow");
		else
			head=head.next;
	}
	
	public void display(){
		Node current=head;
		if(head!=null){
			while(current.next!=null){
				System.out.println(current.data+" ");
				current=current.next;
			}
			System.out.println(current.data+" ");
		}
		else
			System.out.println("Stack is empty");
		
	}
	
	public static void main(String args[]){
		StackImplementationUsingLinkedList obj=new StackImplementationUsingLinkedList();
		obj.push(50);
		obj.push(60);
		obj.push(90);
		obj.push(30);
		obj.pop();
		obj.push(300);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.push(3000);
		obj.display();
		
	}
	
	
}