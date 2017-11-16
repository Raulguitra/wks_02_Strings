import java.util.Scanner;

public class StringDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patron = "TRWAGMYFPDXBNJZSQVHLCKE";
		String patronNie = "XYZ";
		String letraDada = "";
		String nie="";
		String nieNum;
		int codigo, documento;
		boolean letraBien = false;
		System.out.println("Pulsa 1 para DNI\nPulsa 2 para NIE\nPulsa 0 para salir");
		documento = sc.nextInt();
		switch (documento){
		case 0:
			break;
		case 1: //DNI
			do{
				System.out.println("Introduce DNI sin letra");
				codigo = sc.nextInt();
			}while (Integer.toString(codigo).length()!=8);

			do{
				System.out.println("Introduce la letra");
				sc.nextLine();
				letraDada = sc.nextLine();
				letraDada = letraDada.toUpperCase();
			}while (letraDada.length()>1 && letraBien==false);
			if (letraDada.charAt(0)==(patron.charAt(codigo%23))){
				System.out.println("Letra bien");
				letraBien=true;
			}else{
				System.out.println("Letra mal");
			}
			break;
		case 2: //NIE
			do{
				System.out.println("Introduce NIE sin letra");
				sc.nextLine();
				nie = sc.nextLine();
				nie = nie.toUpperCase();
				if (nie.charAt(0)==patronNie.charAt(0)){ //se compara el primer caracter del string introducido con el string patron NIE
					nieNum = String.valueOf(0) + (nie.substring(1, 8)); //se concatena el valor correspondiente (0 para x
					System.out.println(nieNum +" es el String nieNum");             // 1 para y, 2 para z) en un String y se imprime
					do{
						System.out.println("Introduce la letra");
						letraDada = sc.nextLine();
						letraDada = letraDada.toUpperCase();
					}while (letraDada.length()>1 && letraBien==false);
					if (letraDada.charAt(0)==(patron.charAt(Integer.parseInt(nieNum)%23))){ //Se compara con el valor del Int del string concatenado
						System.out.println("Letra bien");
						letraBien=true;
					}else{
						System.out.println("Letra mal");
					}
				}else if (nie.charAt(0)==patronNie.charAt(1)){
					nieNum = String.valueOf(1) + (nie.substring(1, 8)); //nie.valueof(1) da siempre 1. 
					System.out.println(nieNum +" String nieNum"); 
					do{
						System.out.println("Introduce la letra");
						letraDada = sc.nextLine();
						letraDada = letraDada.toUpperCase();
					}while (letraDada.length()>1 && letraBien==false);
					if (letraDada.charAt(0)==(patron.charAt(Integer.parseInt(nieNum)%23))){
						System.out.println("Letra bien");
						letraBien=true;
					}else{
						System.out.println("Letra mal");
					}
				}else if (nie.charAt(0)==patronNie.charAt(2)){
					nieNum = String.valueOf(2) + (nie.substring(1, 8));
					System.out.println(nieNum +" String nieNum");
					do{
						System.out.println("Introduce la letra");
						letraDada = sc.nextLine();
						letraDada = letraDada.toUpperCase();
					}while (letraDada.length()>1 && letraBien==false);
					if (letraDada.charAt(0)==(patron.charAt(Integer.parseInt(nieNum)%23))){
						System.out.println("Letra bien");
						letraBien=true;
					}else{
						System.out.println("Letra mal");
					}
				}

			}while (nie.length()!=8 && letraBien==false);

			break;
			default:
				System.out.println("Bueno pues molt bé pues adiós");
		}
		//X9975003
	}//main

}//Class
