package practice;

public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row=3;
       int col=3;
		int[][] matrixa= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrixb= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] matrixc=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrixc[i][j]=matrixa[i][j]+matrixb[i][j];
			}
		}
		
		System.out.println("after addition");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrixc[i][j]+"\t" );
			}
			System.out.print("\n" );
		}
	}

}
