public class Pseudocodigo3_41 {
//A VECES sale media = 0.0 en el primer curso de algun centro --------------------------> casting de media? para j=0 (linea 26)
	public static void main(String[] args) {
		int centro,curso=0,alumno=0, max=0, posicion=0 ;
		float media=0,mediaMax=0,suma=0;
		int tabla [][][] = new int[5][10][20];
		//Primero se genera una matriz con valures aleatorios
		System.out.println("\t\t\t\t\t\tTabla");
		for (centro=0; centro<5; centro++){ // centro
			System.out.println();
			System.out.println("------------------------------------------------CENTRO-----------------------------------------------");
			for (curso=0; curso<10; curso++){ //curso
				System.out.println();
				for (alumno=0; alumno<20; alumno++){ //num alumnos
					tabla[centro][curso][alumno]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d", tabla[centro][curso][alumno]);
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");
		System.out.println("\n----------------------------------------------------------------------------------------------------");

		for (centro=0; centro<5; centro++){ //Se recorre toda
			for (curso=0; curso<10; curso++){
				for (alumno=0; alumno<20; alumno++){
					suma += tabla[centro][curso][alumno]; 
					media = (float)suma / 20; // se da un valor a la media
					if ((float)media>(float)mediaMax){
						mediaMax = (float)media;
					}
				}//for alumnos
				System.out.println("La nota media del CURSO #" +(curso+1) +" del centro #" +(centro+1) +" es " +media);
				System.out.println();
				suma=0;//Se pone a 0 despúes de mostrar la media del curso
			}//for cursos
			System.out.println("La media máxima del CENTRO #" +(centro+1) + " es " +mediaMax +"\n"); //Siempre al final porque sino la primera media sería cero
			mediaMax=0;//Se pone a 0 despúes de mostrar la media max del centro
		}//for centros
	}//main

}//Class