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
		mergeSort(arr,0,size-1);
		System.out.print("\nAfter Sorting: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	static void mergeSort(int[] arr,int l,int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}	
	}
	static void merge(int[] arr,int l,int mid,int r) {
		int[] temp=new int[r-l+1];
		int i=l,j=mid+1,k=0;
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			} else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=r) {
			temp[k++]=arr[j++];
		}
		for(int u=l,v=0;v<k;u++,v++) {
			arr[u]=temp[v];	
		}
	}
}
