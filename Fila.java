/**
 * Estrutura de Fila para gerenciamento de impressões (FIFO).
 */
public class Fila {
    private Documento[] fila;
    private int frente, fim, tamanho;

    public Fila(int capacidade) {
        fila = new Documento[capacidade];
        frente = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean estaCheia() {
        return tamanho == fila.length;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean enfileirar(Documento doc) {
        if (estaCheia()) return false;
        fila[fim] = doc;
        fim = (fim + 1) % fila.length;
        tamanho++;
        return true;
    }

    public Documento desenfileirar() {
        if (estaVazia()) return null;
        Documento doc = fila[frente];
        frente = (frente + 1) % fila.length;
        tamanho--;
        doc.registrarAtendimento();
        return doc;
    }

    public Documento consultar(String nomeArquivo) {
        for (int i = 0; i < tamanho; i++) {
            int idx = (frente + i) % fila.length;
            if (fila[idx].getNomeArquivo().equals(nomeArquivo)) {
                return fila[idx];
            }
        }
        return null;
    }

    public int consultarPosicao(String nomeArquivo){
        for(int i = 0; i < tamanho; i++){
            int idx = (frente + i) % fila.length;
            if(fila[idx].getNomeArquivo().equals(nomeArquivo))
                return i + 1;
        }
        return -1;
    }

    public void imprimirFila() {
        System.out.println("Fila de Impressão:");
        for (int i = 0; i < tamanho; i++) {
            int idx = (frente + i) % fila.length;
            System.out.println((i + 1) + " - " + fila[idx]);
        }
    }
}