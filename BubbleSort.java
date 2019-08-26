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
		bubbleSort(arr,size);
		System.out.print("\nAfter Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	static void bubbleSort(int[] arr,int size) {
		for(int r=1;r<size;r++) {
			for(int i=1;i<=size-r;i++) {
				if(arr[i-1]>arr[i]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}   
