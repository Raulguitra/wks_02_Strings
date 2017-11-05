import java.util.Scanner;

public class Hoja2Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, conta=0;
		char a;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println("Escribe una letra");
		a = sc.next().charAt(0); //pedir char por teclado
		for (i=0; i<s1.length(); i++){

			if(s1.charAt(i)==a){
				if(conta==0 || conta==1 || conta==2){
					//Si es las primeras 3 no lo imprime
				}
				else{
					System.out.print(s1.charAt(i));
				}
				conta++;
			}else{
				System.out.print(s1.charAt(i));
			}
		}
	}//main
}//Class