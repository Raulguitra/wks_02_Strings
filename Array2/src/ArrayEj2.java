import java.util.*;
public class ArrayEj2 {
/*	Leer del teclado dos vectores de dimensión 10 y construir un tercer vector cuyos componentes sean la suma de los dos anteriores. 
 * Luego se imprime el tercer vector.
	A continuación se ordena y se vuelve a imprimir. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, iteracion, aux;
		final int n = 10;
		int Array1 [];
		int Array2 [];
		int Array3 [];
		Array1 = new int[n];
		Array2 = new int[n];
		Array3 = new int[n];
		System.out.println("Introduce el primer array");
		for (i=0; i < n; i++){
			System.out.print("Numero: ");
			Array1[i] = sc.nextInt();
		}
		System.out.println("Introduce el segundo array");
		for (i=0; i < n; i++){
			System.out.print("Numero: ");
			Array2[i] = sc.nextInt();
		}
		System.out.print("");
		System.out.print("La suma de los dos arrays es: ");
		for (i=0; i < n; i++){
			Array3[i] = Array1[i] + Array2[i];
			System.out.print(Array3[i]);
		}
		System.out.print(" (Array #3)");
		System.out.println("");
		System.out.print("Array 1: ");
		for (i=0; i < n; i++){
			System.out.print(Array1[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Array 2: ");
		for (i=0; i < n; i++){
			System.out.print(Array2[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Array 3: ");
		for (i=0; i < n; i++){
			System.out.print(Array3[i]);
			System.out.print(" ");
		}
	/*	for( iteracion = 0; iteracion < 9; iteracion++){
			for(i = 0; i < 10-iteracion-1; i++){
				if( Array3[ i + 1 ] < Array3[ i ]){
					aux = Array3[ i + 1 ];
					Array3[ i + 1 ] = Array3[ i ];
					Array3[ i ] = aux;
				}	
				System.out.print("\n"+Array3[ i ]);	
			}
			
		}*/
		Arrays.sort(Array3);
		System.out.println("");
		System.out.print("Array 3 ordenado: ");
		for (i=0; i < n; i++){
			System.out.print(Array3[i]);
			System.out.print(" ");
		}
	
	}//main

}//Class
