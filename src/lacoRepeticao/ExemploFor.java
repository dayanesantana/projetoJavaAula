package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int contador;
		String nome;
		
		for (contador = 0; contador < 3; contador ++) {
		
		System.out.println("\n Digite o " + contador + "1º nome: ");
		nome = leia.nextLine();
		System.out.println("O " + contador + " nome é: " + nome);
		}

		
	}

}
