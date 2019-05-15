package ExHeranca;

import java.util.ArrayList;

public abstract class Animal {

    protected String nome;
    protected int idade, tamanho;
    protected double peso;
    protected ArrayList<String> cores = new ArrayList();

    public Animal(String nome, int idade,
            int tamanho, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void adicionaCor(String cor) {
        cores.add(cor);
    }

    public String getCores() {
        String resultado = "";
        for (int i = 0; i < cores.size(); i++) {
            resultado += cores.get(i) + ", ";
        }
        return resultado;
    }

    // Métodos abstratos
    public abstract void fazerBarulho();
    public abstract void comer();
    public abstract void vaguear();

    public void dormir() {
        System.out.println("Um "
                + this.getClass().getSimpleName()
                + " chamado " + this.nome 
                + " está dormindo");
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", idade=" + idade + ", tamanho=" + tamanho + ", peso=" + peso + "]";
    }

}
