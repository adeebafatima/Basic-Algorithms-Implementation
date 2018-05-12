import java.util.Scanner;
class InsertionSort{
	
	public static int[] insertionSort(int A[]){
		for(int j=1;j<A.length;j++){
			int key=A[j];
			int i=j-1;
			while(i>0 && A[i]>key){
				A[i+1]=A[i];
				i--;
			}
			A[i+1]=key;
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
		int result[]=insertionSort(A);
		System.out.println("Sorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(result[i]+" ");
		}
	}	
}