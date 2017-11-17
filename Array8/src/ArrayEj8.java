/*Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las asignaturas como los alumnos. 
Introducimos las 10 notas de los 10 alumnos (generación aleatoria de 1 a 10)
pidiendo por teclado bien número de asignatura ó bien número de alumno
calcular media del  alumno tecleado ó media de la asignatura tecleada. */
import java.util.Scanner;
public class ArrayEj8 {

	public static void main(String[] args) {
		int Array1 [][]=new int[10][10];
		int numFila, conta=0 ,i, j;
		Scanner sc = new Scanner(System.in);

		for (i=0; i<10; i++){
			System.out.println();
			for (j=0; j<10; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*10+1);
				System.out.printf("%5d", Array1[i][j]);
			}
		}
		System.out.println();
		System.out.println("Numero de alumno");
		numFila = sc.nextInt();
		for (i=(numFila-1); i<numFila; i++){ //i<1 solo 1 fila
			for (j=0; j<10; j++){
				System.out.printf("%5d", Array1[i][j]);
				conta+=Array1[numFila-1][j];
			}
		}
		System.out.println("\n\nLa media del alumno #" +numFila +" es " +(float)conta/10);
		
	}//main

}//Class
