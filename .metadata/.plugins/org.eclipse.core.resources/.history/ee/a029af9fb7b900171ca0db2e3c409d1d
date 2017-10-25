import java.util.Scanner;

public class Ejer6T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, contaNum=0, contaVocal=0, cons=0, signos=0;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		for (i=0; i < s1.length(); i++){ 
			if (s1.charAt(i)>=48 && s1.charAt(i)<=57){
				contaNum++;			
			}else if ((s1.charAt(i)=='a') || (s1.charAt(i)=='e')|| (s1.charAt(i)=='i')|| (s1.charAt(i)=='o')|| (s1.charAt(i)=='u')){
				contaVocal++;
			}else if ((s1.charAt(i) >=0 & s1.charAt(i) <=47) || (s1.charAt(i) >=58 & s1.charAt(i) <=64) || (s1.charAt(i) >=91 & s1.charAt(i) <=96) || (s1.charAt(i) >=123 & s1.charAt(i) <=128) || (s1.charAt(i) >=142 & s1.charAt(i) <=163) || (s1.charAt(i) >=166 & s1.charAt(i) <=255)) {
				signos++;
			}
		}
		cons = s1.length()-contaNum-contaVocal-signos;
		System.out.println("la frase " +s1 +" tiene " +contaNum +" numeros, " +contaVocal +" vocales y " +cons +" consonantes");
	}//main
}//Class
