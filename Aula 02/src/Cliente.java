import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private Date dataNascimento;
    private List<Contratacao> contratacao = new ArrayList<>();

    public Cliente(String nome, Date dataNascimento, List<Contratacao> contratacao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contratacao.addAll(contratacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Contratacao> getContratacao() {
        return contratacao;
    }

    public void setContratacao(List<Contratacao> contratacao) {
        this.contratacao = contratacao ;
    }

    public void addContratacao(Contratacao contratacao) {
        this.contratacao.add(contratacao);
    }
}
