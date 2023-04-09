package models.laptop;

public class Laptop {
    private String marca;
    private int diagonala;
    private String culoare;

    public Laptop(String marca, int diagonala, String culoare) {
        System.out.println("Constructor laptop"+"\n");
        this.marca = marca;
        this.diagonala = diagonala;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(int diagonala) {
        this.diagonala = diagonala;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String descriere(){
        String text="";
        text+="marca " + marca + "\n";
        text+="diagonala " + diagonala + "\n";
        text+="culoare " + culoare+ "\n";
        return text;
    }


}
