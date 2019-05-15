package ExHeranca;

public class Hipopotamo extends Animal {

	public Hipopotamo(String nome, int idade,
			int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" está grunhindo");
	}

	@Override
	public void comer() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" está comendo frutas");
	}

	@Override
	public void vaguear() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" está nadando por ai...");
		
	}

}
