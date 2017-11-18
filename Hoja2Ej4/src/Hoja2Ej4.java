
// Después debe intercambiar los apellidos a los nombres y mostrarlos

import java.util.Scanner;
public class Hoja2Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int i;
		System.out.println("Introduce un nombre y un apellido: ");
		s1 = sc.nextLine();
		System.out.println("Introduce otro nombre y apellido: ");
		s2 = sc.nextLine();
		String[] partes1 = s1.split(" ");
		String[] partes2 = s2.split(" ");
		System.out.println(partes1[0]+" " +partes2[1]);
		System.out.println(partes2[0]+" " +partes1[1]);
		
	}//main
	
}//Class