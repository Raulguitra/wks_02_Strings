import java.util.*;
public class Pseudocodigo3_34 {

	public static void main(String[] args) {
		int i,conta=0;
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
	}//main

}//Class
