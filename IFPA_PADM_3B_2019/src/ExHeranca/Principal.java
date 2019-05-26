package ExHeranca;

public class Principal {
    public static void main(String[] args) {
        // Instanciando os nossos animais
        Cachorro cachorro1 = new Cachorro("totó", 3, 10, 10);
        Lobo lobo1 = new Lobo("lobobão", 3, 10, 10);
        Gato gato1 = new Gato("bichento", 3, 10, 10);
        Leao leao1 = new Leao("simba", 3, 10, 10);
        Hipopotamo hippo1 = new Hipopotamo("hippie", 3, 10, 10);

        // Passo 1: Testando os métodos:
       /* cachorro1.fazerBarulho();
        cachorro1.comer();
        cachorro1.dormir();
        cachorro1.vaguear();
        System.out.println();

        lobo1.fazerBarulho();
        lobo1.comer();
        lobo1.dormir();
        lobo1.vaguear();
        System.out.println();

        gato1.fazerBarulho();
        gato1.comer();
        gato1.dormir();
        gato1.vaguear();
        System.out.println();

        leao1.fazerBarulho();
        leao1.comer();
        leao1.dormir();
        leao1.vaguear();
        System.out.println();

        hippo1.fazerBarulho();
        hippo1.comer();
        hippo1.dormir();
        hippo1.vaguear();
        System.out.println();

        // Passo 2: testando os métodos com Polimorfismo
        fazerBarulho(hippo1);
        fazerBarulho(leao1);*/
        
        // Passo 3: testando o método polimórfico com enum
        interagir(hippo1, Comando.DORMIR);
        interagir(leao1, Comando.VAGUEAR);
    }

    // Passo 2: métodos com Polimorfismo
   /* public static void fazerBarulho(Animal a1) {
        a1.fazerBarulho();
    }
    public static void comer(Animal a1) {
        a1.comer();
    }
    public static void dormir(Animal a1) {
        a1.dormir();
    }
    public static void vaguear(Animal a1) {
        a1.vaguear();
    }*/
    // Passo 3: método polimórfico com enum
    public static void interagir(Animal a1, Comando comando) {
        switch (comando) {
            case BARULHO:
                a1.fazerBarulho();
                break;
            case COMER:
                a1.comer();
                break;
            case DORMIR:
                a1.dormir();
                break;
            case VAGUEAR:
                a1.vaguear();
                break;
            default:
                System.out.println("Erro de entrada!");
        }
    }
}