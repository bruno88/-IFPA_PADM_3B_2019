package ExHeranca;

public class Lobo extends Canino {

	public Lobo(String nome, int idade,
			int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" uivando para a lua");
	}

	@Override
	public void comer() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" está comendo carne");
	}

}
