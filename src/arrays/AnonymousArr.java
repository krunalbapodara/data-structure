package arrays;

public class AnonymousArr {
	static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printArr(new int[] {1,2,3,4,5});
	}
}
