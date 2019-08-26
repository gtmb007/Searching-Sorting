import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("© 2019 Gautam Bharadwaj\n");
		System.out.print("Enter size of array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("\nBefore Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		quickSort(arr,0,size-1);
		System.out.print("\nAfter Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	static void quickSort(int[] arr,int l,int r) {
		if(l<r) {
			int loc=partition(arr,l,r);
			quickSort(arr,l,loc-1);
			quickSort(arr,loc+1,r);
		}	
	}
	static int partition(int[] arr,int l,int r) {
		int pivot=arr[r];
		int index=l;
		for(int i=l;i<r;i++) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		arr[r]=arr[index];
		arr[index]=pivot;
		return index;
	}
}
