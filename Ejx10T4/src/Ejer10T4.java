import java.util.Scanner;

public class Ejer10T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i,contaD=0;
		final int n = 26;
		int conta [];
		conta = new int[n];
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 60){
			System.out.println("Escribe una frase menor de 60 caracteres");
			s1 = sc.nextLine();
		}
		for(i = 0; i < 26; i++){
			conta[i]=0;
		}
		for(i = 0; i < s1.length(); i++){ 
			char c = Character.toUpperCase(s1.charAt(i)); 
			if(c >= 'A' && c <= 'Z' ) 
				conta[c - 'A']++; 
		}
		for (i=0; i<26; i++){
			if (conta[i]>0){
				contaD++;
				System.out.println( (char)(i + 'A') + ": " + conta[i]); 
			}
		}

		System.out.println("Hay " +contaD +" letras distintas"); 
	}//main

}//Class
