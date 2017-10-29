
public class ArrayEj4 {

	public static void main(String[] args) {
		final int n = 20;
		int Array1 [][];
		Array1 = new int[5][5];
		int i,j;
		while (i < 5){
			while (j < 5){
				
				j++;
			}
			
			i++;
		}
		
		for (i=0; i < n; i++){
			Array1[i]=(int)Math.floor(Math.random()*1-100);
			System.out.print((int)Array1[i]);
			System.out.print(" ");
			if (max < Array1[i]){
				max = Array1[i];
			}
			if (min > Array1[i]){
				min = Array1[i];
			}
		}

	}//main

}//Class
