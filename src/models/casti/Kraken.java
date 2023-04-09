package models.casti;

public class Kraken extends Casti{
    private double sistemSunet;
    private String culoare;
    private int pret;

    public Kraken(String marca, String moldel,double sistemSunet, String culoare, int pret) {
        super(marca,moldel);
        System.out.println("Kraken constructor" + "\n");
        this.sistemSunet = sistemSunet;
        this.culoare = culoare;
        this.pret = pret;
    }

    public double getSistemSunet() {
        return sistemSunet;
    }

    public void setSistemSunet(double sistemSunet) {
        this.sistemSunet = sistemSunet;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="marca " + getMarca() + "\n";
        text+="model " + getMoldel() + "\n";
        text+="sistem sunet " + sistemSunet + "\n";
        text+="culoare " + culoare + "\n";
        text+="pret " + pret ;
        return text;
    }
}
