import java.util.List;

public class Pacote {
    private String descricao;
    private Localidade localidade;
    private List<ItemPacote> itemPacote;

    public Pacote(String descricao, List<ItemPacote> itemPacote, Localidade localidade) {
        this.descricao = descricao;
        this.localidade = localidade;
        this.itemPacote = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public List<ItemPacote> getItemPacote() {
        return itemPacote;
    }

    public void setItemPacote(List<ItemPacote> itemPacote) {
        this.itemPacote = itemPacote;
    }

    public void addItemPacote(ItemPacote itemPacote) {
        this.itemPacote.add(itemPacote);
    }

}
