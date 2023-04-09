package models.tastatura;

public class Tastatura {
    private String brand;
    private int pret;
    private String culoare;

    public Tastatura(String brand, int pret, String culoare){
        System.out.println("Constructor tastatura" + "\n");
        this.brand=brand;
        this.pret=pret;
        this.culoare=culoare;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String descriere(){
        String text="";
        text+="brand " + brand + "\n";
        text+="pret " + pret + "\n";
        text+= "culoare " + culoare + "\n";

        return text;
    }
}
