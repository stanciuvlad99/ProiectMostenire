package models.apartament;

public class Bucuresti extends Apartament{
    private int metrilocuibili;
    private int numarApartament;
    private int etaj;

    public Bucuresti(String locatie, int numarCamere, int numarBai,int metrilocuibili, int numarApartament, int etaj) {
        super(locatie,numarCamere,numarBai);
        System.out.println("Constructor Bucuresti" + "\n");
        this.metrilocuibili = metrilocuibili;
        this.numarApartament = numarApartament;
        this.etaj = etaj;
    }

    public int getMetrilocuibili() {
        return metrilocuibili;
    }

    public void setMetrilocuibili(int metrilocuibili) {
        this.metrilocuibili = metrilocuibili;
    }

    public int getNumarApartament() {
        return numarApartament;
    }

    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="locatie " + super.getLocatie() + "\n";
        text+="numar bai " + super.getNumarBai() + "\n";
        text+="numar camere " + super.getNumarCamere() + "\n";
        text+="metri locuiibili " + metrilocuibili + "\n";
        text+="numar apartament" + numarApartament + "\n";
        text+="etaj " + etaj + "\n";
        return text;
    }
}
