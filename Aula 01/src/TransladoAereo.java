public class TransladoAereo extends ItemPacote{
   private String companhiaAerea;
   private String numeroVoo;

   public TransladoAereo(String price, String companhiaAerea, String numeroVoo) {
      super(price);
      this.companhiaAerea = companhiaAerea;
      this.numeroVoo = numeroVoo;
   }

   public String getCompanhiaAerea() {
      return companhiaAerea;
   }

   public void setCompanhiaAerea(String companhiaAerea) {
      this.companhiaAerea = companhiaAerea;
   }

   public String getNumeroVoo() {
      return numeroVoo;
   }

   public void setNumeroVoo(String numeroVoo) {
      this.numeroVoo = numeroVoo;
   }
}