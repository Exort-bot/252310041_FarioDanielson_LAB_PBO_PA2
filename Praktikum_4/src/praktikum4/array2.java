package praktikum4;

public class array2 {
	public static void main(String[] args) {
		
		double[][] x = new double[2][3];
		
		for(int i = 0; i<2; i++) {
			for(int j= 0; j<2; j++) {
				x[i][j] = Math.random();
			}
		}
		for(int i = 0; i<2; i++) {
			for(int j= 0; j<2; j++) {
				System.out.println(x[i][j]);
			}
		}
	}
}
