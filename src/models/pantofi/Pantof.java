package models.pantofi;

public class Pantof {
    private String marca;
    private String model;
    private int pret;

    public Pantof(String marca, String model, int pret) {
        System.out.println("Constructor Pantof"+"\n");
        this.marca = marca;
        this.model = model;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String descriere(){
        String text="";
        text+="marca " + marca + "\n";
        text+="model " + model + "\n";
        text+="pret " + pret + "\n";
        return text;
    }
}
