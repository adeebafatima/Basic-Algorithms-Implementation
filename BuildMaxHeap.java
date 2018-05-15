import java.util.Scanner;
import java.lang.Math;
class BuildMaxHeap{
	
	public static void max_heapify(int[] A,int i){
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
	}
	
	public static int[] build_max_heap(int[] A){
		int i=(int)Math.floor((A.length-1)/2);
		for(;i>=0;i--){
			max_heapify(A,i);
		}
		return A;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements whose heap is to built");
		int n=scan.nextInt();
		int[] A=new int[n];
		System.out.println("Enter the elements");
		for(int a=0;a<n;a++){
			A[a]=scan.nextInt();
		}
		
		int[] result=build_max_heap(A);
		for(int b=0;b<n;b++){
			System.out.print(result[b]+"  ");
		}
	}
	
	
}