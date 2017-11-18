// posición de dicha palabra en la frase o un mensaje indicando que no está. 

import java.util.Scanner;
public class Ejer3T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, palabra;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println("Escribe la palabra que quieras buscar");
		palabra = sc.nextLine();
		if (s1.startsWith(palabra+" ")){
			System.out.println("Es la primera palabra de la frase, posicion " +s1.indexOf(palabra));
		}else if (s1.indexOf(" " +palabra +" ")!=-1){
			System.out.println("La palabra empieza en la posicion " + (s1.indexOf(" " + palabra +" ") +1 ));
		}else if (s1.endsWith(" "+palabra)){
			System.out.println("Es la ultima palabra de la frase, posicion " + (s1.lastIndexOf(" "+palabra) + 1));
		} else{
			System.out.println("No se encuentra la palabra");
		}

	}//main

}//Class