import java.util.*;
public class Pseudocodigo3_34 {

	public static void main(String[] args) {
		int i,conta=0;
		Scanner sc = new Scanner(System.in);
		int arrayNotas[] = new int[10];

		for (i=0; i<arrayNotas.length; i++){
			arrayNotas[i]=(int)Math.floor(Math.random()*10);
			System.out.print((int)arrayNotas[i]);
			conta= conta + arrayNotas[i];
		}
		System.out.println("La media es: " +(float)conta/10);
	}//main

}//Class
