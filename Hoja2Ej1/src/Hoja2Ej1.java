import java.util.Scanner;

public class Hoja2Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, letra;
		char a;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println("Escribe una letra");
		a = sc.next().charAt(0); //pedir char por teclado
		for (i=0; i<s1.length(); i++){
			if (s1.charAt(i)==a){
				letra = a; //inicializar letra(es int)
				letra = 'A' + (letra - 'a'); //letra pasa a mayusculas mediante ascii
				System.out.print((char)letra); //mostrar letra mayuscula con un casting para que no salga el numero ascii
			}
		}
	}//main

}//Class
