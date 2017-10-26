import java.util.Scanner;

public class Ejer6T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s1m;
		int i, contaNum=0, contaVocal=0, contaCons=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		s1m = s1.toUpperCase();
		String cons = "BCDFGHJKLMNPQRSTVWXYZ";
		String voc = "AEIOU";
		String num ="0123456789";
		for (i=0; i < s1m.length(); i++){ 
			char letra = s1m.charAt(i);
			if (cons.indexOf(letra)!=-1){
				contaCons++;			
			}else if (voc.indexOf(letra)!=-1){
				contaVocal++;
			}else if (num.indexOf(letra) != -1){
				contaNum++;
			}
		}
		System.out.println("la frase " +s1 +" tiene " +contaNum +" numeros, " +contaVocal +" vocales y " +contaCons +" consonantes");
	}//main
}//Class
