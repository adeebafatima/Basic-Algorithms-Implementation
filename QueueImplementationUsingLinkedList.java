class QueueImplementationUsingLinkedList{
	
	class QNode{
		int data;
		QNode next;
		QNode(int data){
			this.data=data;
		}
		
	}
	
	QNode front=null;
	QNode rear=null;
	
	public void enqueue(int data){
		if(rear==null){
			QNode newNode=new QNode(data);
			newNode.next=null;
			rear=newNode;
			front=newNode;
		}
		else{
			QNode newNode=new QNode(data);
			newNode.next=null;
			rear.next=newNode;
			rear=newNode;
		}
		
	}
	
	public void dequeue(){
		if(front==null){
			System.out.println("Underflow");
		}
		else{
			if(front==rear){
				rear=null;
				front=null;
			}
			else{
			front=front.next;
			}
		}
	}
	
	public void display(){
		QNode current=front;
		if(current!=null){
			while(current.next!=null){
				System.out.println(current.data+" ");
				current=current.next;
			}
			System.out.println(current.data+" ");
		}
		else
			System.out.println("Queue is empty");
		
	}
	
	public static void main(String args[]){
		QueueImplementationUsingLinkedList obj=new QueueImplementationUsingLinkedList();
		obj.dequeue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.dequeue();
		obj.enqueue(300);
		obj.enqueue(900);
		obj.dequeue();
		obj.dequeue();
		obj.enqueue(700);
		obj.display();
		
	}
	
}