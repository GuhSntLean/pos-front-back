public class TransladoAereo extends ItemPacote{
   private String companiaAerea;
   private String numeroVoo;

   public TransladoAereo(String preco, String companiaAerea, String numeroVoo) {
      super(preco);
      this.companiaAerea = companiaAerea;
      this.numeroVoo = numeroVoo;
   }

   public String getCompanhiaAerea() {
      return companiaAerea;
   }

   public void setCompanhiaAerea(String companiaAerea) {
      this.companiaAerea = companiaAerea;
   }

   public String getNumeroVoo() {
      return numeroVoo;
   }

   public void setNumeroVoo(String numeroVoo) {
      this.numeroVoo = numeroVoo;
   }
}