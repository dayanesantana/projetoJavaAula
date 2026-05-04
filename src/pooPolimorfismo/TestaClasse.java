package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

			
			// Pessoa p = new Pessoa("Maria", 18); //classes abstratas não podem ser instanciadas
			
			//p.visualizar();
		
		Triatleta t = new Triatleta ("Day", 33, 5);
		Triatleta t2 = new Triatleta("João", 28, 5);
		
		t2.competicoesConcluidas();
		t2.competicoesConcluidas(3);
		
		t.visualizar();
	}

}
