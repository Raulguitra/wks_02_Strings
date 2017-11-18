// construir otras dos cadenas de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar. 
import java.util.*;
public class Ejer5T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		System.out.print("Cadena par -------> ");
		for (i=0 ; i<s1.length(); i += 2){	
			System.out.print(s1.charAt(i));
		}	
		System.out.println("");
		System.out.print("Cadena impar -------> ");
		for (i=1 ; i<s1.length(); i += 2){	
			System.out.print(s1.charAt(i));
		}	

	}//main

}//Class
