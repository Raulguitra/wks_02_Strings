import java.util.Scanner;

public class StringDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patron = "TRWAGMYFPDXBNJZSQVHLCKE";
		String letraDada = "";
		int codigo;
		boolean letraBien = false;
		//do{
		
			System.out.println("Introduce DNI sin letra");
			codigo = sc.nextInt();
			System.out.println(codigo%23 +" es el índice que corresponde al string patron para ese DNI");
			
		//while(codigo.length()!=8 && letraBien==true);

			
		System.out.println("Introduce la letra");
		sc.nextLine();
		letraDada = sc.nextLine();
		if (letraDada.charAt(0)==(patron.charAt(codigo%23))){
			System.out.println("Letra bien");
			letraBien=true;
		}else{
			System.out.println("Letra mal");
		}
		
	}//main

}//Class
