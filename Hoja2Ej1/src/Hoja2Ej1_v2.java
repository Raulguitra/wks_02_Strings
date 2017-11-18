import java.util.Scanner;

public class Hoja2Ej1_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, letra;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		do{
			System.out.println("Escribe una letra");
			letra = sc.nextLine();
		}while (letra.length()>1);
		if (s1.indexOf(letra)==-1){
			System.out.println("No está la letra");
		}else{
			System.out.println(s1.replace(letra, letra.toUpperCase()));
		}
	}//main

}//Class
