package diarioDeFerias;

import java.util.Scanner;

public class DiarioDeFerias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MeuDiarioDeFerias meuDiario = new MeuDiarioDeFerias();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU DIÁRIO ---");
            System.out.println("1. Adicionar Atividade");
            System.out.println("2. Listar Tudo");
            System.out.println("3. Pesquisar por Tag");
            System.out.println("4. Ordenar por Nota");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(teclado.nextLine()); // Evita erro de buffer do Scanner

                if (opcao == 1) {
                    System.out.print("Descrição: ");
                    String desc = teclado.nextLine();
                    System.out.print("Tag: ");
                    String tag = teclado.nextLine();
                    System.out.print("Nota (0-10): ");
                    double nota = Double.parseDouble(teclado.nextLine());

                    if (nota < 0 || nota > 10) {
                        System.out.println("Erro: Nota inválida!");
                    } else {
                        meuDiario.adicionarAtividade(new AtividadeDeFerias(desc,nota, tag));
                        System.out.println("Adicionado!");
                    }

                } else if (opcao == 2) {
                    meuDiario.listarAtividades();

                } else if (opcao == 3) {
                    System.out.print("Tag para busca: ");
                    String busca = teclado.nextLine();
                    meuDiario.pesquisarAtividade(busca);

                } else if (opcao == 4) {
                    meuDiario.listarPorNotaMaior();

                } else if (opcao == 5) {
                    System.out.println("Saindo...");
                }

            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
        teclado.close();
    }
}