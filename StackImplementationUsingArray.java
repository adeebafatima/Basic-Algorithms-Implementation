class StackImplementationUsingArray{
	static final int MAX = 1000;
	int top=-1;
	int[] stack = new int[MAX];
	
	public void push(int item){
		if(top==MAX-1)
			System.out.println("Overflow");
		else
			stack[++top]=item;
	}
	
	public int pop(){
		int temp;
		if(top==-1){
			System.out.println("Underflow");
			return -1;
		}
		else{
			temp=stack[top--];
			return temp;
		}
	}
	
	public void print(){
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+" ");
	}
	
	public static void main(String args[]){
		StackImplementationUsingArray stack=new StackImplementationUsingArray();
		stack.push(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		stack.push(50);
		System.out.println(stack.pop());
		stack.push(90);
		stack.push(300);
		stack.print();
				
		
		
	}
	
	
}