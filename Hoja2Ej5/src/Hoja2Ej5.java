// Escribe un programa que pida una palabra por teclado e intercambie la �ltima y la primera letra
import java.util.Scanner;
public class Hoja2Ej5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Introduce una frase: ");
		s1 = sc.nextLine();
		char ultimo = s1.charAt(s1.length()-1);
		char primero = s1.charAt(0);
		System.out.print(ultimo);
		System.out.print(s1.substring(1,s1.length()).replace(ultimo, primero));	
		

	}//main
	
}//Class