package pooHeranca;

public class Estudante extends Pessoa { //Classe filha ou Classe Derivada
				
		
	    private String matricula;
	    private String curso;
	    
		public Estudante(String nome, int idade, String email, String matricula, String curso) {
			super(nome, idade, email); //Super representa a classe mãe || é o método construtor da classe mãe
			this.matricula = matricula;
			this.curso = curso;
		}
		
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
				
}

