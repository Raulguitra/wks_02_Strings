import java.util.Scanner;

public class ArrayEj8 {

	public static void main(String[] args) {
		final int alumno = 10;
		final int asig = 10;
		int Array1 [][], numFila,conta=0;
		Array1 = new int[alumno][asig];
		Scanner sc = new Scanner(System.in);
		int i,j=0;
		for (i=0; i<alumno; i++){
			System.out.println();
			for (j=0; j<asig; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*10+1);
				System.out.printf("%5d", Array1[i][j]);
			}
		}
		System.out.println();
		System.out.println("Numero de alumno");
		numFila = sc.nextInt();
		for (i=0; i<1; i++){ //i<1 solo 1 fila
			for (j=0; j<asig; j++){
				System.out.println(Array1[numFila-1][j] +"["+i+"]" +"["+j+"]");
				conta+=Array1[numFila-1][j];
			}
		}
		System.out.println("La media del alumno #" +numFila +" es " +(float)conta/10);
		
	}//main

}//Class
