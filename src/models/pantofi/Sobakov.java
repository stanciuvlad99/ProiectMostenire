package models.pantofi;

public class Sobakov extends Pantof{
    private String culoare;
    private int marime;

    public Sobakov(String marca, String model, int pret,String culoare, int marime) {
        super(marca,model,pret);
        System.out.println("Constructor sobakov" + "\n");
        this.culoare = culoare;
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="marca " + super.getMarca()+"\n";
        text+="model " + super.getModel()+ "\n";
        text+="pret " + super.getPret()+ "\n";
        text+="culoare " + culoare + "\n";
        text+="marime " + marime ;
        return text;
    }
}
