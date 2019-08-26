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
		selectionSort(arr,size);
		System.out.print("\nAfter Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	static void selectionSort(int[] arr,int size) {
		for(int i=0;i<size-1;i++) {
			int k=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[k]) {
					k=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
	}
}
