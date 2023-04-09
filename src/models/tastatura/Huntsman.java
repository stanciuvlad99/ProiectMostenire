package models.tastatura;

import models.telefon.Telefon;

public class Huntsman extends Tastatura {
    private String model;
    private int numarTaste;

    public Huntsman(String brand, int pret, String culoare, String model, int numarTaste){
        super(brand,pret,culoare);
        System.out.println("Constructor Huntsman" + "\n");
        this.model=model;
        this.numarTaste=numarTaste;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumarTaste() {
        return numarTaste;
    }

    public void setNumarTaste(int numarTaste) {
        this.numarTaste = numarTaste;
    }

    public String descriere(){
        String text="";
        text+=super.descriere();
        text+="brand " +super.getBrand() + "\n";
        text+="pret " + super.getPret() + "\n";
        text+="culoare " + super.getCuloare() + "\n";
        text+="model " + model + "\n";
        text+="numar taste " + numarTaste;
        return text;
    }
}
