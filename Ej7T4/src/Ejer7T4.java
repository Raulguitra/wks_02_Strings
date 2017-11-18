import java.util.Scanner;
//Contador mayus, minus y numeros
public class Ejer7T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, contaNum=0, contaMay=0, contaMin=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		for (i=0; i < s1.length(); i++){ 
			if (s1.charAt(i)>=65 && s1.charAt(i)<=90){
				contaMay++;			
			}else if (s1.charAt(i)>=97 && s1.charAt(i)<=122){
				contaMin++;
			}else if (s1.charAt(i)>=48 && s1.charAt(i)<=57){
				contaNum++;		
			}
		}


		System.out.println("La frase " +s1 +" contiene " +contaMay +" mayusculas " +contaMin +" minusculas y " +contaNum +" numeros");
	}//main

}//Class
