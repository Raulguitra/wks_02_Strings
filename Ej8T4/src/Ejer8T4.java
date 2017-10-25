import java.util.*;

public class Ejer8T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2="";
		int i, j, n;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		String mayus = s1.toUpperCase();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (s1.compareTo(mayus)>0){ //AAa = error a veces
			System.out.println(s1);
			System.out.println(mayus);
			System.out.println("Escribe una frase en mayusculas");
			s1 = sc.nextLine();
			mayus = s1.toUpperCase();
		}
		System.out.println("Introduce un numero para codificar");
		n = sc.nextInt();
		for (i=0; i<s1.length(); i++){ 
			for (j=0; j<abc.length(); j++){ //Comparar strings s1 y abc
				if (s1.charAt(i) == abc.charAt(j)) //para el primer caracter de las cadenas se concatenaran j+n segun i de s1 para cada caracter
					if (j+n >= abc.length()){
						s2 += abc.charAt((j+n) % abc.length()); // empezar desde el principio
					}else{
						s2 += abc.charAt(j+n); 
					}
			}
		}
		System.out.println(s1 +" ---> frase original");
		System.out.println(s2 +" ---> frase codificada");

	}//class

}//Class
