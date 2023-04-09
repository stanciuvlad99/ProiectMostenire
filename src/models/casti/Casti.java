package models.casti;

public class Casti {
    private String marca;
    private String moldel;

    public Casti(String marca, String moldel) {
        System.out.println("Constructor casti" + "\n");
        this.marca = marca;
        this.moldel = moldel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMoldel() {
        return moldel;
    }

    public void setMoldel(String moldel) {
        this.moldel = moldel;
    }

    public String descriere(){
        String text="";
        text+="marca " + marca + "\n";
        text+="model " + moldel + "\n";
        return text;
    }
}
