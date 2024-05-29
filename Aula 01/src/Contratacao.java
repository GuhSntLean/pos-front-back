import java.util.Date;

public class Contratacao {
    private long valor;
    private Date dataContratacao;
    private Cliente cliente;
    private Pacote pacote;

    public Contratacao(long valor, Date dataContratacao, Cliente cliente, Pacote pacote) {
        this.valor = valor;
        this.dataContratacao = dataContratacao;
        this.cliente = cliente;
        this.pacote = pacote;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Contratacao(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote){ this.pacote = pacote; }
}
