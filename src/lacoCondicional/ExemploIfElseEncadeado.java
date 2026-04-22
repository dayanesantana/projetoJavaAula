package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Parabéns! Você foi aprovada!");
		} else if (media >=5 ) {
			System.out.println("Você está de recuperação!");
		}		
		
		
		else {
			System.out.print("Infelizmente você foi reprovada!");
		}
	
	}
}
