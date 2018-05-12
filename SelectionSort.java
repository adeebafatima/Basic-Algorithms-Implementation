import java.util.Scanner;
class SelectionSort{
	
	public static int[] selectionSort(int A[]){
		for(int i=0;i<A.length;i++){
			int min=i;
			for(int j=i+1;j<A.length;j++){
				if(A[j]<A[min]){
					min=j;
				}
			}
			int temp=A[i];
			A[i]=A[min];
			A[min]=temp;
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
		int result[]=selectionSort(A);
		System.out.println("Sorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(result[i]+" ");
		}
	}	
}