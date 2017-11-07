
import java.util.Scanner;

public class Hoja2Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i,j,max=0,posicion;
		int conta[] = {0,0,0,0,0};
		char letra;
		String vocales="aeiou";
		System.out.println("Escribe una palabra");
		s1 = sc.nextLine();
		for (i=0; i<s1.length(); i++){
			letra = s1.charAt(i);
			conta[i]=vocales.indexOf(letra);
			if(conta[i]!=-1){
				conta[i]++;
			}
			
			if (conta[i]>max){
				max = conta[i];
				posicion=i;
			}
			

		}
		System.out.println("La vocal " +vocales.charAt(i) +" aparece " +conta[i] +" veces");
	}//main

}//Class