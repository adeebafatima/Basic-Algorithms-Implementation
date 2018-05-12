import java.util.Scanner;
class BubbleSort{
	
	public static int[] bubbleSort(int A[]){
		int temp;
		boolean swapped=false;
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length-1-i;j++){
				if(A[j+1]<A[j]){
					temp=A[j+1];
					A[j+1]=A[j];
					A[j]=temp;
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
		return A;		
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements of array: ");
		int N=scan.nextInt();
		System.out.println("Enter unsorted array");
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		System.out.println("Unsorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(A[i]+" ");
		}
		int result[]=bubbleSort(A);
		System.out.println("Sorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(result[i]+" ");
		}
	}
	
	
	
	
}