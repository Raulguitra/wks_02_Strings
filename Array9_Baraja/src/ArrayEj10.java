/*Hacer un programa para que extraiga cartas de una baraja española 
La notación del naipe será 
1,2,3,4,5,6,7,A,B,C (num de carta A=10-sota-, B=11-caballo-, C=12rey-) 
OCEP (oros, copas, espadas y bastos) para el palo*/
import java.util.Scanner;
public class ArrayEj10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n, conta=0;
		boolean encontrado;
		String cartaNum [] = {"1", "2", "3", "4", "5", "6", "7","A","B","C"};
		String palo [] = {"O", "C", "E", "B"};
		String carta [] = new String[40]; //todo vale null
		String nuevaCarta="";
		System.out.println("Pulsa 0 para salir");
		n = sc.nextInt();
		while (n!=0){ 

			int numRandom = (int) Math.round(Math.random() * 9 ) ;
			int numRandom2 = (int) Math.round(Math.random() * 3 ) ;
			nuevaCarta=cartaNum[numRandom]+palo[numRandom2];
			encontrado=false;
			for (i=0; i<carta.length && encontrado==false && carta[i]!=null; i++){ 	
				//System.out.println(carta[i]);
				if (nuevaCarta.equals(carta[i])){
					System.out.println("Ya ha salido");
					encontrado = true;
					if (carta[39]!=null){
						System.out.print(" toda la baraja, ludopata ");
					}
				}
			}
			if (encontrado==false){
				carta[i]=cartaNum[numRandom]+palo[numRandom2];
				System.out.println(carta[i]);
			}
			conta++;
			System.out.println("Has sacado " +conta +" cartas");
			n = sc.nextInt();
		}
	}//main

}//Class
