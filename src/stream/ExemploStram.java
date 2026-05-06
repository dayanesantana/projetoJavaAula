package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStram {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//Stream
		List<String> estadosEmMaiusculos = estados.stream()
				.map(x -> x.toUpperCase())   //Operação intermediária, focada no processamento
				.collect(Collectors.toList());  //Operação terminal (finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count();  //Operação terminal
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculos);
		System.out.println("Estados únicos: " + estadosUnicos);
		System.out.println("Quantidade de Estados Unicos: " + quantidadeDeEstados);
		System.out.println("Coleção/Dados Inicial: " + estados);
	}

}
