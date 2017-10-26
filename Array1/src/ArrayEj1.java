import java.util.*;

public class ArrayEj1 {

	public static void main(String[] args) {
		final int n = 10;
		int Array1 [];
		Array1 = new int[n];
		int i,conta=0;
		double media;
		System.out.println("Escribe una frase");
		for (i=0; i < n; i++){
			
			Array1[i]=(int)Math.floor(Math.random()*21-10);
			conta = conta + Array1[i];
			System.out.println(Array1[i]);
		}
		media = (double) conta/20;
		System.out.println("La media es " +media);

	}//main

}//Class
