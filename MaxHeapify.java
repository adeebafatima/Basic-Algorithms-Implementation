import java.util.Scanner;
class MaxHeapify{
	
	public static int[] max_heapify(int[] A,int i){
		int l=(2*i)+1;
		int r=(2*i)+2;
		int largest;
		if(l<A.length && A[l]>A[i])
			largest=l;
		else
			largest=i;
		
		if(r<A.length && A[r]>A[largest])
			largest=r;
		
		if(largest!=i){
			int temp=A[i];
			A[i]=A[largest];
			A[largest]=temp;
			max_heapify(A,largest);
		}
			
		return A;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements in heap");
		int n=scan.nextInt();
		int[] A=new int[n];
		System.out.println("Enter elements of heap");
		for(int a=0;a<n;a++){
			A[a]=scan.nextInt();
		}
		System.out.println("Enter position at which you want to apply maxheapify");
		int i=scan.nextInt();
		int[] result=max_heapify(A,i-1);
		for(int b=0;b<n;b++){
			System.out.print(result[b]+"  ");
		}
	}
}