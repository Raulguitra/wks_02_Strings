/*Leer un vector de 20 enteros. Encontrar el mayor
 *  y el menor de ellos y los lugares donde se encuentran.*/
public class ArrayEj3 {

	public static void main(String[] args) {
		int Array1 [];
		Array1 = new int[20];
		int i, max=0, min=0, posMax=Array1[0], posMin=Array1[0];
		System.out.print("Lista de 20 numeros: ");
		for (i=0; i < Array1.length; i++){
			Array1[i]=(int)Math.floor(Math.random()*21-10);
			System.out.print((int)Array1[i]);
			System.out.print(" ");
			if (max < Array1[i]){
				max = Array1[i];
				posMax = i;
				
			}else if (min > Array1[i]){
				min = Array1[i];
				posMin = i;
			}
		}
		System.out.println();
		System.out.println("Num max: " +max +" en la posicion " +posMax); 
		System.out.println("Num min: " +min +" en la posicion " +posMin);
	}//main

}//Class
