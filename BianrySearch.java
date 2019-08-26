import java.util.Scanner;
class Main {
	static int round;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("© 2019 Gautam Bharadwaj\n");
		System.out.print("Enter size of array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter elements of array(in ascending order): ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter element to search: ");
		int element=sc.nextInt();
		int[] a=binarySearch(arr,0,size-1,element);
		System.out.println("Index of "+element+": "+a[0]+"\nNumber of Comparisons: "+a[1]);
	}
	static int[] binarySearch(int[] arr,int l,int r,int element) {
		int[] res=new int[2];
		int mid=(l+r)/2;
		while(l<=r) {
			round++;
			if(element==arr[mid]) {
				res[0]=mid;
				res[1]=round;	
				return res;
			} else if(element<arr[mid]) {
				return binarySearch(arr,l,mid-1,element);
			} else {
				return binarySearch(arr,mid+1,r,element);
			}
		}
		res[0]=-1;
		res[1]=round;
		return res;
	}
}
