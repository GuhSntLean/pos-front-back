public class Contratacao {
    private long valor;
    private Date dataContratacao;
    private Cliente cliente;

    public Contratacao(long valor, Date dataContratacao, Cliente cliente) {
        this.valor = valor;
        this.dataContratacao = dataContratacao;
        this.cliente = cliente;
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
}
