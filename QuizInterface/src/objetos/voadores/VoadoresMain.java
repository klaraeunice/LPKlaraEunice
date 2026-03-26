package objetos.voadores;

import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {
        Voador[] voadores = new Voador[10];
        Random random = new Random();

        System.out.println("--- Instanciando Voadores Aleatoriamente ---");

        for (int i = 0; i < voadores.length; i++) {
            int escolha = random.nextInt(3); // Gera 0, 1 ou 2

            if (escolha == 0) {
                voadores[i] = new GalinhaVoadora();
                System.out.println("Posição " + i + ": GalinhaVoadora criada.");
            } else if (escolha == 1) {
                voadores[i] = new Drone();
                System.out.println("Posição " + i + ": Drone criado.");
            } else {
                // Usando a classe Aviao que você implementou
                voadores[i] = new Aviao("Latam", false);
                System.out.println("Posição " + i + ": Aviao criado.");
            }
        }

        System.out.println("\n--- Iniciando Ciclo de Voo (Chamadas Polimórficas) ---");

        for (Voador v : voadores) {
            System.out.println("Executando ações para: " + v.getClass().getSimpleName());

            v.voar();  // <--- Chamada Polimórfica
            v.planar(); // <--- Chamada Polimórfica
            v.pousar(); // <--- Chamada Polimórfica

            System.out.println("-------------------------");
        }
    }
}