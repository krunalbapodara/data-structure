package arrays;

public class MultiDimensional {
	public static void main(String[] args) {
		int[][] matric = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matric[i][j] = i+j;
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matric[i][j]+" ");
			}
			System.out.println();
		}
	}
}
