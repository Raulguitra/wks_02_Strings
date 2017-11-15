import java.util.Scanner;

public class Pseudocodigo3_38 {

	public static void main(String[] args) {
		int i,j,conta=0, numRandom; 
		int Array1[][] = new int[30][10];
		Scanner sc = new Scanner(System.in);

		for (i=0;i<30; i++){
			conta=0;
			System.out.println();
			for (j=0; j<10; j++){
				Array1 [i][j]=(int)Math.floor(Math.random()*11);
				System.out.printf("%5d", Array1 [i][j]);
				conta+=Array1[i][j];
			}
			System.out.print("\tLa media es: " +(float)conta/10);
		}

	}//main

}//Class