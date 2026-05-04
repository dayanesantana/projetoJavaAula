package pooPolimorfismo;

public class Triatleta extends Pessoa implements ICiclista{

	int competicoes;

	public Triatleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	
	
	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}

	public void competicoesConcluidas() {
		System.out.println("Competições concluidas: " + this.competicoes);
	}
	
	//Polimorfismo de sobrecarga (Sobrecarga de métodos)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competições concluidas: " + numero);
	}
	
	//Polimorfismo de sobrescrita (sobrescrita de método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	//Métodos implementados da interface
	public void pedalar() {
		System.out.println("Estou pedalando...");
	}



	@Override //anotações
	public String aquecer() {
		return "Estou me aquecendo";
	}
}
