
import java.util.Scanner;

public class Hoja2Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int clembuterol [],i,j,max=0, letra;
		clembuterol = new int[5];
		String vocales="aeiou";
		System.out.println("Escribe una palabra");
		s1 = sc.nextLine();
		for (i=0; i<s1.length(); i++){
			letra = s1.charAt(i);
			clembuterol[i]==vocales.indexOf(letra);
				if(){
					clembuterol[j]++;
				}
			}
		}
		/*for (i=0; i<vocales.length(); i++){
			System.out.println("Aparece la vocal " +vocales.charAt(i) +" " +clembuterol[i] +" veces");
			if (clembuterol[i]>0){
				max=clembuterol[i];
			}
			System.out.println(max);*/
		}
		
	}//main

}//Class