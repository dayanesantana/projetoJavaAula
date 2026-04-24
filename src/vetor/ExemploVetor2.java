package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetorNumeros [] = new int [3];
		
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt();
		}
		
		for (int indice = 0; indice <3; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]);
		}
	}

}
