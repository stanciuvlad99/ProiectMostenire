package models.apartament;

public class Apartament {
    private String locatie;
    private int numarCamere;
    private int numarBai;

    public Apartament(String locatie, int numarCamere, int numarBai) {
        System.out.println("Constructor apartament" + "\n");
        this.locatie = locatie;
        this.numarCamere = numarCamere;
        this.numarBai = numarBai;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getNumarCamere() {
        return numarCamere;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public int getNumarBai() {
        return numarBai;
    }

    public void setNumarBai(int numarBai) {
        this.numarBai = numarBai;
    }

    public String descriere(){
        String text="";
        text+="locatie " + locatie + "\n";
        text+="numar camere " + numarCamere + "\n";
        text+="numar bai " + numarBai + "\n";
        return text;
    }
}
