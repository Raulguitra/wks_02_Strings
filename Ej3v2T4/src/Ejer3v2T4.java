import java.util.Scanner;

public class Ejer3v2T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, palabra;
		int posicion=0, conta=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println("Escribe la palabra que quieras buscar");
		palabra = sc.nextLine();
		if (s1.startsWith(palabra+" ")){
			System.out.println("La palabra esta al principio en la posicion " +s1.indexOf(palabra));
			conta++;
		}
		posicion = s1.indexOf(" " +palabra +" ");
		while (posicion!=-1){
			conta++;
			posicion=s1.indexOf(" " +palabra +" ",posicion+1);
			System.out.println("La palabra esta en la posicion " + (s1.indexOf(" " + palabra +" ") +1 ));
		}
		if (s1.endsWith(" "+palabra)){
			System.out.println("La palabra esta al final en la posicion " + (s1.lastIndexOf(" "+palabra) + 1));
			conta++;
		}
		System.out.println("La palabra " +palabra +" aparece " +conta +" veces");
	}//main

}//Class