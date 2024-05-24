public class LocacaoVeiculo extends ItemPacote{
    private String marca;
    private String modelo;

    public LocacaoVeiculo(String price, String marca, String modelo) {
        super(price);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
