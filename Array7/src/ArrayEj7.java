/*Generar una matriz de 5x5 numérica entera entre -10 y 10, a continuación pedir dos números de fila,
que se deben filtrar entre 1 y 5  e intercambiar ambas filas. Presentar las matrices antes y después del cambio. */
import java.util.Scanner;
public class ArrayEj7 {

	public static void main(String[] args) {
		int Array1 [][] = new int[10][10];

		int i=0,j=0,temp, fila1=0, fila2=0;
		for (i=0; i<10; i++){
			System.out.println();
			for (j=0; j<10; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*21-10);
				System.out.printf("%5d", Array1[i][j]);
			}
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de fila que quieras mover: ");
		fila1 = sc.nextInt();
		while (fila1<1 || fila1>5){
			System.out.println("Numero entre 1 y 5 ");
			fila1 = sc.nextInt();
		}
		System.out.println("Introduce el numero de fila donde quieras mover la anterior: ");
		fila2 = sc.nextInt();
		while (fila2<1 || fila2>5){
			System.out.println("Numero entre 1 y 5 ");
			fila2 = sc.nextInt();
		}
		for (i=0; i<10; i++){ 
			temp = Array1[fila1-1][i]; // matriz auxiliar para que no sobreescriba la fila
			Array1[fila1-1][i] = Array1[fila2-1][i];
			Array1[fila2-1][i] = temp;
		}
		for (i=0; i<10; i++){
			System.out.println();
			for (j=0; j<10; j++){
				System.out.printf("%5d", Array1[i][j]);
			}
		}
	}//main

}//Class
