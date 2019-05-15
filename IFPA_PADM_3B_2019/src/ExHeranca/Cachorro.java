package ExHeranca;

public class Cachorro extends Canino {

	public Cachorro(String nome, int idade, 
			int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" latindo alto");
	}

	@Override
	public void comer() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" está roendo um osso");
	}

}
