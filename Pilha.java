/**
 * Estrutura de Pilha para reimpressões emergenciais (LIFO).
 */
public class Pilha {
    private Documento[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        pilha = new Documento[capacidade];
        topo = -1;
    }

    public boolean estaCheia() {
        return topo == pilha.length - 1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean empilhar(Documento doc) {
        if (estaCheia()) return false;
        pilha[++topo] = doc;
        return true;
    }

    public Documento desempilhar() {
        if (estaVazia()) return null;
        Documento doc = pilha[topo--];
        doc.registrarAtendimento();
        return doc;
    }

    public Documento consultar(String nomeArquivo) {
        for (int i = topo; i >= 0; i--) {
            if (pilha[i].getNomeArquivo().equals(nomeArquivo)) {
                return pilha[i];
            }
        }
        return null;
    }

    public int consultarPosicao(String nomeArquivo){
        for (int i = topo; i >= 0; i--) {
            if (pilha[i].getNomeArquivo().equals(nomeArquivo)) {
                return topo - i + 1;
            }
        }
        return -1;
    }

    public void imprimirPilha() {
        System.out.println("Pilha de Reimpressão:");
        for (int i = topo; i >= 0; i--) {
            System.out.println((topo - i + 1) + " - " + pilha[i]);
        }
    }
}
