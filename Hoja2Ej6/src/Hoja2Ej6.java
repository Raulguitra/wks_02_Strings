//Escribe un programa que pida por teclado una frase y cambie cada ocurrencia de la palabra �si� por la palabra �no�.
//Despu�s lo muestra por pantalla

import java.util.Scanner;
public class Hoja2Ej6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println(s1.replace("si", "no"));
	}//main
	
}//Class