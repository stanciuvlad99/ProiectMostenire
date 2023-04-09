package models.motocicleta;

public class GSX extends Morocicleta{
    private int caiPutere;
    private int capacitateCilindrica;
    private  String culoare;

    public GSX(String marca, String model, int pret, int caiPutere, int capacitateCilindrica, String culoare) {
        super(marca,model,pret);
        System.out.println("Constructor GSX"+"\n");
        this.caiPutere = caiPutere;
        this.capacitateCilindrica = capacitateCilindrica;
        this.culoare = culoare;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String desciere(){
        String text="";
        text=super.descriere()+"\n";
        text+="marca " + getMarca() + "\n";
        text+="model " + getModel() + "\n";
        text+="pret " + getPret() + "\n";
        text+="cai putere " + caiPutere + "\n";
        text+="capacitate cilindrica " + capacitateCilindrica + "cm3" + "\n";
        text+="culoare " + culoare;
        return text;
    }
}
