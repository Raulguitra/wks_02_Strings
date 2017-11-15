public class Pseudocodigo3_42_v2 {

	public static void main(String[] args) {
		int vendedor=0,mes=0,producto=0, suma=0, sumaFila=0;
		int tabla [][][] = new int[12][4][3];
		int ventas [][] = new int[12][4];

		for  (mes=0; mes<12; mes++){ 
			System.out.println();
			System.out.println("\t\t  MES #" +(mes+1));
			for (producto=0; producto<4; producto++){  
				System.out.println();
				System.out.printf("producto %2d ", (producto+1));
				for (vendedor=0; vendedor<3; vendedor++){ // 
					tabla[mes][producto][vendedor]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d ", tabla[mes][producto][vendedor]);
				}
			}
		}
		for (mes=0; mes<12; mes++){ //el mes se deja fijo(pagina)      	// SE SACA LA MATRIZ VENTAS[mes][producto] filas y columnas
			for (producto=0; producto<4; producto++){  
				suma = 0;
				for (vendedor=0; vendedor<3; vendedor++){ 
					suma+=tabla[mes][producto][vendedor];
				}
				ventas[mes][producto]=suma; //sacamos la matriz ventas[j][k]
			}
		}
		System.out.println();
		System.out.println("\n[--------------------------------------------VENTAS POR SEPARADO------------------------------]");
		for (mes=0; mes<12; mes++){ 
			System.out.println();
			System.out.printf("mes #%2d\t", (mes+1));
			for (producto=0; producto<4; producto++){  
				System.out.printf("%4d",ventas[mes][producto]);
			}
		}
		System.out.println("\n[--------------------------------------------VENTAS CONJUNTAS------------------------------------]");
		for (mes=0; mes<12; mes++){ 
			sumaFila=0;
			for (producto=0; producto<4; producto++){  
				sumaFila+=ventas[mes][producto];
			}
			System.out.println("Se han vendido " +sumaFila +" productos en el mes # " +(mes+1) );
		}

	}//main

}//Class