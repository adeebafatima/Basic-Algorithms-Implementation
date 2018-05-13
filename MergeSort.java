import java.util.Scanner;
import java.lang.Integer;
class MergeSort{
	
	
	public static void mergeProcedure(int A[],int p,int q,int r){
		int n1=q-p+1;
		int n2=r-q;
		int[] L=new int[n1+1];
		int[] R=new int[n2+1];
		for(int i=0;i<n1;i++){
			L[i]=A[p+i];
		}
		for(int i=0;i<n2;i++){
			R[i]=A[q+i+1];
		}
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				A[k]=L[i];
				i++;
			}
			else{
				A[k]=R[j];
				j++;
			}
		}		
	}
	
	public static int[] mergeSort(int[] A,int p,int r)
		{
			if(p<r){
				int q=(p+r)/2;
				mergeSort(A,p,q);
				mergeSort(A,q+1,r);
				mergeProcedure(A,p,q,r);
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
		int[] result=mergeSort(A,0,A.length-1);
		System.out.println("Sorted Array ");
		for(int i=0;i<N;i++){
			System.out.print(result[i]+" ");
		}
	}
}	