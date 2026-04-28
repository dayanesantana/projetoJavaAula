package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " + resultado);
		System.out.println("O segundo resultado é: " + somar(5,4));
		
		mensagem();
		saudacao("Bom dia!");
		ExemploMetodoExterno.info();
	}
		public static int somar(int num1, int num2) { //assinatura do método
			
			return num1 + num2; //lógica do método
			
		}
		
		public static void mensagem() {
			System.out.println("Esse método não tem retorno");
			
		}
		
		public static void saudacao(String msg) {
			System.out.println(msg);
		}
}
