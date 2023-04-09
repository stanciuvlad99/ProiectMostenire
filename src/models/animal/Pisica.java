package models.animal;

public class Pisica extends Animal {

    private String nume;
    private String culoare;
    private double kilograme;

    public Pisica(String animal, String rasa, int varsta, String nume, String culoare, double kilograme) {
        super(animal, rasa, varsta);
        System.out.println("Pisica constructor"+"\n");
        this.nume = nume;
        this.culoare = culoare;
        this.kilograme = kilograme;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getKilograme() {
        return kilograme;
    }

    public void setKilograme(int kilograme) {
        this.kilograme = kilograme;
    }

    public String descriere() {
        String text = "";
        text += super.descriere() + "\n";
        text += "animal " + super.getAnimal() + "\n";
        text += "rasa " + super.getRasa() + "\n";
        text += "varsta " + super.getVarsta() + "\n";
        text += "nume " + nume + "\n";
        text += "culoare " + culoare + "\n";
        text += "greutate " + kilograme + " kilograme";

        return text;
    }


}
