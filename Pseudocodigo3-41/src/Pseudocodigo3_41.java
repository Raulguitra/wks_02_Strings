public class Pseudocodigo3_41 {

	public static void main(String[] args) {
		int i,j,k, conta=0, max=0;
		int tabla [][][] = new int[5][10][20];
		for (i=0; i<5; i++){
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------");
			for (j=0; j<10; j++){
				System.out.println();
				for (k=0; k<20; k++){
					tabla[i][j][k]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d", tabla[i][j][k]);
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");
	}//main

}//Class