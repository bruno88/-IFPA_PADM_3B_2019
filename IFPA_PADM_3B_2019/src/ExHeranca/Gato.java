package ExHeranca;

import java.util.ArrayList;

public class Gato extends Felino {
    public Gato(String nome, int idade,
            int tamanho, double peso) {
        super(nome, idade, tamanho, peso);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Um "
                + this.getClass().getSimpleName()
                + " chamado " + this.nome
                + " está miando alto");
    }

    @Override
    public void comer() {
        System.out.println("Um "
                + this.getClass().getSimpleName()
                + " chamado " + this.nome
                + " está bebendo leite");
    }

}
