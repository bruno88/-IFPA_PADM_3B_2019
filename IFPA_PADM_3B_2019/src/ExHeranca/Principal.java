package ExHeranca;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("totó", 3, 10, 10);
        Lobo lobo1 = new Lobo("lobobão", 3, 10, 10);
        Gato gato1 = new Gato("bichento", 3, 10, 10);
        Leao leao1 = new Leao("simba", 3, 10, 10);
        Hipopotamo hippo1 = new Hipopotamo("hippie", 3, 10, 10);
        
	// Testando os métodos:
        // Cachorro
        cachorro1.fazerBarulho();
        cachorro1.comer();
        cachorro1.dormir();
        cachorro1.vaguear();
        System.out.println();

        // Lobo
        lobo1.fazerBarulho();
        lobo1.comer();
        lobo1.dormir();
        lobo1.vaguear();
        System.out.println();

        // Gato
        gato1.fazerBarulho();
        gato1.comer();
        gato1.dormir();
        gato1.vaguear();
        System.out.println();

        // Le�o
        leao1.fazerBarulho();
        leao1.comer();
        leao1.dormir();
        leao1.vaguear();
        System.out.println();

        // Hipopotamo
        hippo1.fazerBarulho();
        hippo1.comer();
        hippo1.dormir();
        hippo1.vaguear();
        System.out.println();
                
    }
}
