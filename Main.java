import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fila filaImpressao = new Fila(5); // capacidade máxima da fila
        Pilha pilhaReimpressao = new Pilha(5); // capacidade máxima da pilha

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enviar documento para impressão");
            System.out.println("2. Imprimir próximo documento");
            System.out.println("3. Consultar documento na fila");
            System.out.println("4. Enviar documento para reimpressão");
            System.out.println("5. Executar reimpressão");
            System.out.println("6. Consultar documento na pilha");
            System.out.println("7. Mostrar fila de impressão");
            System.out.println("8. Mostrar pilha de reimpressão");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do arquivo: ");
                    String nomeArquivo1 = scanner.nextLine();
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario1 = scanner.nextLine();
                    Documento doc1 = new Documento(nomeArquivo1, nomeUsuario1);
                    if (filaImpressao.enfileirar(doc1)) {
                        System.out.println("Documento adicionado à fila.");
                    } else {
                        System.out.println("Fila cheia! Documento não adicionado.");
                    }
                    break;

                case 2:
                    Documento impresso = filaImpressao.desenfileirar();
                    if (impresso != null) {
                        System.out.println("Documento impresso:\n" + impresso);
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;

                case 3:
                    System.out.print("Nome do arquivo: ");
                    String nomeBusca = scanner.nextLine();
                    Documento encontrado = filaImpressao.consultar(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Documento encontrado na fila:\n" + encontrado);
                        System.out.println("Posição: " + filaImpressao.consultarPosicao(nomeBusca));
                    } else {
                        System.out.println("Documento não está na fila.");
                    }
                    break;

                case 4:
                    System.out.print("Nome do arquivo: ");
                    String nomeArquivo2 = scanner.nextLine();
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario2 = scanner.nextLine();
                    Documento doc2 = new Documento(nomeArquivo2, nomeUsuario2);
                    if (pilhaReimpressao.empilhar(doc2)) {
                        System.out.println("Documento adicionado à pilha de reimpressão.");
                    } else {
                        System.out.println("Pilha cheia! Documento não adicionado.");
                    }
                    break;

                case 5:
                    Documento reimpresso = pilhaReimpressao.desempilhar();
                    if (reimpresso != null) {
                        System.out.println("Documento reimpresso:\n" + reimpresso);
                    } else {
                        System.out.println("Pilha vazia!");
                    }
                    break;

                case 6:
                    System.out.print("Nome do arquivo: ");
                    String nomeBusca2 = scanner.nextLine();
                    Documento encontradoPilha = pilhaReimpressao.consultar(nomeBusca2);
                    if (encontradoPilha != null) {
                        System.out.println("Documento encontrado na pilha:\n" + encontradoPilha);
                        System.out.println("Posição: " + pilhaReimpressao.consultarPosicao(nomeBusca2));

                    } else {
                        System.out.println("Documento não está na pilha.");
                    }
                    break;

                case 7:
                    filaImpressao.imprimirFila();
                    break;

                case 8:
                    pilhaReimpressao.imprimirPilha();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}