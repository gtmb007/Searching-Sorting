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
		insertionSort(arr,size);
		System.out.print("\nAfter Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	static void insertionSort(int[] arr,int size) {
		for(int i=1;i<size;i++) {
			int temp=arr[i];
			int k=0;
			for(int j=i-1;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
				} else {
					k=j+1;
					break;
				}
			}
			arr[k]=temp;
		}
	}
}
