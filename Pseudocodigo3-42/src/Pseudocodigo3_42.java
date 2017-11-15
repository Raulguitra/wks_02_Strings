public class Pseudocodigo3_42 {
	//A VECES sale media = 0.0 en el primer curso de algun centro --------------------------> casting de media? para j=0 (linea 26)
	public static void main(String[] args) {
		int i,j=0,k=0, max=0, suma=0;
		int tabla [][][] = new int[3][12][4];
		int ventas [][] = new int[12][4];
		System.out.println("\t\t\t\t\t\t  Tabla");
		for (i=0; i<3; i++){ // representante
			System.out.println();
			System.out.println("------------------------------------------------Representante-----------------------------------------------");
			for (j=0; j<12; j++){ //mes
				System.out.println();
				System.out.printf("%4d # mes ", (j+1));
				for (k=0; k<4; k++){  //producto
					tabla[i][j][k]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d", tabla[i][j][k]);
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");

		for (k=0; k<4; k++){ // producto fijo
			for (i=0; i<3; i++){ //rep
				for (j=0; j<12; j++){  //mes
					suma += tabla[k][i][j];
				}
				ventas[j][k]=suma;
			}
			suma=0;
		}

		System.out.println("\n--------------------------------------------VENTAS--------------------------------------------");

		for (k=0; k<4; k++){ //prod
			for (j=0; j<12; j++){  //mes
				System.out.printf("%5d", ventas[j][k]);
			}

		}

	}//main

}//Class