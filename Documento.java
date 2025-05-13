import java.time.LocalDateTime;
import java.time.Duration;

/**
 * Documento que será impresso ou reimpresso.
 */
public class Documento {
    private String nomeArquivo;
    private String nomeUsuario;
    private LocalDateTime horarioSolicitacao;
    private LocalDateTime horarioAtendimento;

    public Documento(String nomeArquivo, String nomeUsuario) {
        this.nomeArquivo = nomeArquivo;
        this.nomeUsuario = nomeUsuario;
        this.horarioSolicitacao = LocalDateTime.now();
        this.horarioAtendimento = null;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public LocalDateTime getHorarioSolicitacao() {
        return horarioSolicitacao;
    }

    public LocalDateTime getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void registrarAtendimento() {
        this.horarioAtendimento = LocalDateTime.now();
    }

    public long calcularTempoEspera() {
        if (horarioAtendimento == null) return -1;
        return Duration.between(horarioSolicitacao, horarioAtendimento).getSeconds();
    }

    @Override
    public String toString() {
        String resultado = "Arquivo: " + nomeArquivo +
                           " | Usuário: " + nomeUsuario +
                           " | Solicitado: " + horarioSolicitacao;

        if (horarioAtendimento != null) {
            resultado += " | Atendido: " + horarioAtendimento +
                         " | Espera: " + calcularTempoEspera() + "s";
        }

        return resultado;
    }
}