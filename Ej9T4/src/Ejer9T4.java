import java.util.*;
public class Ejer9T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		char H, M;
		int i, contaH1=0, contaH2=0, contaM1=0,contaM2=0, contaMal=0, contaBien=0;
		System.out.println("Escribe: 199_(H o M)(1 o 2)(caracter libre)(caracter libre)");
		s1 = sc.nextLine();
		while (!s1.equals("00000000")){
			while (s1.length() != 8) {
				contaMal++;
				System.out.println("Introduce bien el codigo (longitud)");
				s1 = sc.nextLine();	
			}
			while (s1.startsWith("199")==false){
				contaMal++;
				System.out.println("Introduce bien el codigo (Empieza por 199)");
				s1 = sc.nextLine();	
			}
			while (s1.charAt(3)<=48 && s1.charAt(3)>=53){
				contaMal++;
				System.out.println("Introduce bien el codigo (199X)");
				s1 = sc.nextLine();	
			}
			while (s1.charAt(4)!='H' && s1.charAt(4)!='M'){
				contaMal++;
				System.out.println("Introduce bien el codigo (H o M)");
				s1 = sc.nextLine();	
			}
			while (s1.charAt(5)=='1' && s1.charAt(5)=='2'){
				contaMal++;
				System.out.println("Introduce bien el codigo (1 o 2)");
				s1 = sc.nextLine();	
			}
			if (s1.charAt(5)=='1'){
				if (s1.charAt(4)=='H'){
					contaH1++;	
			}else{
				contaM1++;
			}
				if (s1.charAt(5)=='2'){
					if (s1.charAt(4)=='H'){
						contaH2++;	
				}else{
					contaM2++;
				}
			contaBien++;
			System.out.println("Introduce otro codigo");
			s1 = sc.nextLine();
		}
		System.out.println(contaBien+" codigos han sido introducidos correctamente");
		System.out.println("Hay " +contaH1 +" hombres y " +contaM1 +" en primero " +" y " +contaH2+" hombres y " +contaM2 +" en segundo ");

	}//main

}//Class