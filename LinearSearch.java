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
		System.out.print("Enter element to search: ");
		int element=sc.nextInt();
		System.out.println("Index of "+element+": "+linearSearch(arr,size,element));
	}
	static int linearSearch(int[] arr,int size,int element) {
		int pos=-1;
		for(int i=0;i<size;i++) {
			if(element==arr[i]) {
				pos=i;
				break;
			}
		}
		return pos;
	}
}
