import java.util.Scanner;
public class Pseudocodigo3_31 {

	public static void main(String[] args) {
		int opcion, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero 1");
		num1 = sc.nextInt();
		System.out.println("Introduce numero 2");
		num2 = sc.nextInt();
		System.out.println("¿Que quieres hacer con ellos?\n\t1-Sumar\n\t2-Restar\n\t3-Multiplicar\n\t4-Dividir\n\t5-Todo");
		opcion = sc.nextInt();
		switch (opcion){
		case 1:
			System.out.println(+num1 +" + " +num2 +" = " +(num1+num2));
			break;
		case 2:
			System.out.println(+num1 +" - " +num2 +" = " +(num1-num2));
			break;
		case 3:
			System.out.println(+num1 +" * " +num2 +" = " +(num1*num2));
			break;
		case 4:
			System.out.println(+num1 +" / " +num2 +" = " +(float)num1/num2);
			break;
		case 5:
			System.out.println(+num1 +" + " +num2 +" = " +(num1+num2)+" --> Suma ");
			System.out.println(+num1 +" - " +num2 +" = " +(num1-num2)+" --> Resta ");
			System.out.println(+num1 +" * " +num2 +" = " +(num1*num2)+" --> Multiplicacion ");
			System.out.println(+num1 +" / " +num2 +" = " +(float)num1/num2+" --> Division ");
			break;
		default:
			System.out.println("Bueno pues molt bé pues adiós");
		}
		sc.close();
	}//main

}//Class
