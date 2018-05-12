import java.util.Scanner;
class QuickSort{
	
	public static int partition(int A[],int p,int r){
		int key=A[r];
		int j=p;
		int i=p-1;
		while(j<=r-1){
			if(A[j]<=key){
				i=i+1;
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
			j++;
				
		}
		i=i+1;
		int temp2=A[i];
		A[i]=A[r];
		A[r]=temp2;
		return i;
	}
	
	public static int[]quickSort(int A[],int p,int r){
		if(p<r){
			int q=partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
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
		int[] result=quickSort(A,0,A.length-1);
		System.out.println("Sorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(result[i]+" ");
		}
	}
}	