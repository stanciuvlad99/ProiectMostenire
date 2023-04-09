package models.monitor;

public class Alienware extends Monitor{
    private int rataRefresh;
    private String rezolutie;
    private int pret;

    public Alienware(String marca, double diagonala, String culoare, int rataRefresh, String rezolutie, int pret) {
        super(marca,diagonala,culoare);
        System.out.println("Alienware constructor"+"\n");
        this.rataRefresh = rataRefresh;
        this.rezolutie = rezolutie;
        this.pret = pret;
    }

    public int getRataRefresh() {
        return rataRefresh;
    }

    public void setRataRefresh(int rataRefresh) {
        this.rataRefresh = rataRefresh;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String descriere() {
        String text="";
        text+=super.descriere()+"\n";
        text+="marca "+super.getMarca()+"\n";
        text+="culoare "+super.getCuloare()+"\n";
        text+="diagonala " +super.getDiagonala()+"\n";
        text+="rate refresh " + rataRefresh+"\n";
        text+="rezolutie " + rezolutie+"\n";
        text+="pret " + pret;
        return text;
    }
}
