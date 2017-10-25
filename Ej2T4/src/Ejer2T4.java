import java.util.Scanner;

public class Ejer2T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, contaMay=0, contaMin=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		for (i=0; i < s1.length(); i++){ 
			if (s1.charAt(i)>=65 && s1.charAt(i)<=90){
				contaMay++;			
			}
			if (s1.charAt(i)>=97 && s1.charAt(i)<=122){
				contaMin++;	
			}
		}
		System.out.println("la frase " +s1 +" tiene " +contaMay +" letras mayusculas y " +contaMin +" letras minusculas");

	}//main

}//Class
