package models.telefon;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model){
        System.out.println("Telefon constructor"+"\n");
        this.marca=marca;
        this.model=model;
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

    public String descriere(){
        String text="";
        text+="marca " + marca + "\n";
        text+="model " + model + "\n";
        return text;
    }
}
