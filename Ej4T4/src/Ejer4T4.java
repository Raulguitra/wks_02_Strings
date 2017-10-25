import java.util.Scanner;
public class Ejer4T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int menu;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		System.out.println("Elige la opcion 1 para minusculas o 2 para mayusculas(0:salir)");
		switch (menu = sc.nextInt()){
		case 0: 
			break;
		case 1:
			System.out.println(s1.toLowerCase());
			break;
		case 2:
			System.out.println(s1.toUpperCase());
		}
		
	}//main

}//Class
