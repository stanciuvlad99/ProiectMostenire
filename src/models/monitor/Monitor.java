package models.monitor;

public class Monitor {
    private String marca;
    private double diagonala;
    private String culoare;

    public Monitor(String marca, double diagonala, String culoare){
        System.out.println("Monitor constructor"+"\n");
        this.marca = marca;
        this.diagonala=diagonala;
        this.culoare=culoare;
    }

    public String getCuloare(){
        return culoare;
    }

    public void setCuloare(String culoare){
        this.culoare=culoare;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public double getDiagonala(){
        return diagonala;
    }

    public void setDiagonala(int diagonala){
        this.diagonala=diagonala;
    }

    public String descriere(){
        String text="";
        text+="marca " + marca +"\n";
        text+="diagonala "+ diagonala + "\n";
        text+="culoare " + culoare + "\n";
        return text;
    }
}
