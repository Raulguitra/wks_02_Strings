/*Generar una matriz de 10x10, asignarles n�mero reales aleatorios a cada elemento entre -5 y 5. 
Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la matriz. */
public class ArrayEj6 {

	public static void main(String[] args) {
		final int F = 10;
		final int C = 10;
		int Array1 [][];
		Array1 = new int[F][C];
		int i,j, sumaF=0, sumaC=0;
		for (i=0; i<F; i++){
			for (j=0; j<C; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*11-5);
				//System.out.print(Array1[i][j] +"["+i+"]" +"["+j+"]");
				System.out.printf("%3d", Array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t\t\t\t\t\t\tsuma de filas");
		for (i=0; i<F; i++){
			for (j=0; j<C; j++){
				sumaF+=Array1[i][j];
				System.out.printf("%5d", Array1[i][j]);  //5caracteres de espacio y d es int.
			}
			System.out.printf("%5d\n", sumaF);
			//System.out.println("Suma fila #" +(i+1) +": " +sumaF); //suma de filas
		}
		System.out.println("");
		for (i=0; i<F; i++){  
			for (j=0; j<C; j++){
				sumaC+=Array1[j][i]; //si es cuadrada recorrer primero las columnas en el for externo
			}
			//System.out.println("Suma columna #" +(i+1) +": " +sumaC); //suma de columnas
			System.out.printf("%5d", sumaC);
			
		}
		System.out.print("\t <---suma columnas");	
	}//main

}//Class 
/*
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] */
