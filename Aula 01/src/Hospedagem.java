public class Hospedagem extends ItemPacote{
    private String nomeHotel;
    private String endereco;

    public Hospedagem(String price, String nomeHotel, String endereco) {
        super(price);
        this.nomeHotel = nomeHotel;
        this.endereco = endereco;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
