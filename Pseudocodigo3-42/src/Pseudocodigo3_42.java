public class Pseudocodigo3_42 {
//A VECES sale media = 0.0 en el primer curso de algun centro --------------------------> casting de media? para j=0 (linea 26)
	public static void main(String[] args) {
		int i,j=0,k=0, max=0, posicion=0 ;
		float media=0,mediaMax=0,conta=0;
		int tabla [][][] = new int[5][10][20];
		//Primero se genera una matriz con valures aleatorios
		System.out.println("\t\t\t\t\t\tTabla");
		for (i=0; i<5; i++){ // centro
			System.out.println();
			System.out.println("------------------------------------------------CENTRO-----------------------------------------------");
			for (j=0; j<10; j++){ //curso
				System.out.println();
				for (k=0; k<20; k++){ //num alumnos
					tabla[i][j][k]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d", tabla[i][j][k]);
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");
		System.out.println("\n----------------------------------------------------------------------------------------------------");

		for (i=0; i<5; i++){ //solo hay que recorrer los centros y los cursos
			for (j=0; j<10; j++){
				conta += tabla[i][j][0]; //contador en las filas (ahora es array 2D)
				media = (float)conta / 10; // se da un valor a la media para cada fila (curso)
				System.out.println("La nota media del CURSO #" +(j+1) +" del centro #" +(i+1) +" es " +media);
				System.out.println();
				if ((float)media == 0.0){
					System.out.println("ERROR");
				}
				if ((float)media>(float)mediaMax){
					mediaMax = (float)media;
				}
			}
			System.out.println("La media máxima del CENTRO #" +(i+1) + " es " +mediaMax +"\n"); //Siempre al final porque sino la primera media sería cero
			conta=0;//Se ponen a 0 despúes de mostrar la media máxima del centro
			mediaMax=0;
		}

	}//main

}//Class