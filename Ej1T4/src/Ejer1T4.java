//Leer una frase de máximo 80 caracteres y escribirla progresivamente 
import java.util.Scanner;
public class Ejer1T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		for (i=0 ; i<s1.length(); i++){	
			System.out.println(s1.substring(0,i+1));
		}
	}//main

}//Class
