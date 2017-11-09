public class Pseudocodigo3_37v2 {

	public static void main(String[] args) {
		final int F = 4;
		final int C = 5;
		int matriz [][], filas, columnas; 
		int mT[][]=new int[5][4];
		matriz = new int[F][C];
		System.out.println("\tMatriz normal (4x5)");

		for (filas=0; filas<F; filas++){ 
			System.out.println();
			for (columnas=0; columnas<C; columnas++){
				matriz [filas][columnas]=mT[columnas][filas]=(int)Math.floor(Math.random()*101+1);
				System.out.printf("%5d", matriz [filas][columnas]);
			}
		}
		
		System.out.println("\n"); //2 saltos de linea
		System.out.println("\tMatriz transpuesta (5x4)"); 
		
		for (columnas=0; columnas<C; columnas++){ //se recorre por columnas
			System.out.println();
			for (filas=0; filas<F; filas++){
				System.out.printf("%5d", mT [columnas][filas]);

			}
		}
	}//main

}//Class
