package models.telefon;

public class Iphone extends Telefon{
    private int memorieStocare;
    private double diagonala;
    private int megapixeli;
    private String culoare;

    public Iphone(String marca, String model,int memorieStocare, double diagonala, int megapixeli, String culoare) {
        super(marca, model);
        System.out.println("Constructor Iphone" + "\n");
        this.memorieStocare = memorieStocare;
        this.diagonala = diagonala;
        this.megapixeli = megapixeli;
        this.culoare = culoare;
    }

    public int getMemorieStocare() {
        return memorieStocare;
    }

    public void setMemorieStocare(int memorieStocare) {
        this.memorieStocare = memorieStocare;
    }

    public double getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(double diagonala) {
        this.diagonala = diagonala;
    }

    public int getMegapixeli() {
        return megapixeli;
    }

    public void setMegapixeli(int megapixeli) {
        this.megapixeli = megapixeli;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="marca " + getMarca() + "\n";
        text+="model " + getModel() + "\n";
        text+="memorie stocare " +megapixeli + "megapixeli" + "\n";
        text+="diagonala " + diagonala + "inch" + "\n";
        text+="megapixeli " + megapixeli + "\n";
        text+="culoare " + culoare;
        return text;
    }
}
