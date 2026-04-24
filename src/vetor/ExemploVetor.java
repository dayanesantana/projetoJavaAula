package vetor;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String vetorCachorro[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky", "Corgi"};
		
		for (int numero = 0; numero < 5; numero++) {
			System.out.println((numero + 1) + "º elemento: " + vetorCachorro[numero]);
		}
		 
	      		
	}
}
