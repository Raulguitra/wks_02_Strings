import java.util.*;
public class Pseudocodigo3_35 {

	public static void main(String[] args) {
		int i,conta=0,n;
		Scanner sc = new Scanner(System.in);
		int arrayNotas[] = new int[10];

		for (i=0; i<arrayNotas.length; i++){
			arrayNotas[i]=(int)Math.floor(Math.random()*11);
			System.out.printf("%3d", (int)arrayNotas[i]);
			conta= conta + arrayNotas[i];
		}
		System.out.println("\nLa media es: " +(float)conta/10); //salto de linea
		if (((float)conta/10)>5){
			System.out.print(" (Aprobado)");
		}else{
			System.out.print(" (Suspenso)");
		}
		System.out.println("\n Escribe la nota que quieras buscar");
		n = sc.nextInt();
		for (i=0; i<arrayNotas.length; i++){
			if (n==arrayNotas[i]){
				System.out.println(" Ha sacado esa nota en la posicion " +(i+1) +" del vector");
			}
		}

	}//main

}//Class
