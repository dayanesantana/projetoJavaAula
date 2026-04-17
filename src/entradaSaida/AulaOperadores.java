package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {

		//VARIÁVEIS
		
		float celsius, fahrenheit;
		Scanner leia = new Scanner (System.in);
		
		//ENTRADA DE DADOS
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		
		//PROCESSAMENTO
		fahrenheit = celsius * 1.8f + 32;
		
		//SAÍDA DE DADOS
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
	}

}
