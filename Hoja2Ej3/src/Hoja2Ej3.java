/*Escribe un programa que pida por teclado una palabra y diga si es un palíndromo o no. 
Una palabra es un palíndromo si se lee igual de izquierda a derecha que de derecha a izquierda*/
import java.util.Scanner;
public class Hoja2Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s1reverse="";
		int i;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();

		for (i=s1.length()-1; i>=0; i--){
			s1reverse+=s1.charAt(i);
		}
		System.out.println(s1reverse);	

		if (s1.equals(s1reverse)){
			System.out.println("Es un palíndromo");
		}else{
			System.out.println("No es un palíndromo");
		}
	}//main
}//Class