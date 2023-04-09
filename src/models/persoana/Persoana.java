package models.persoana;

public class Persoana {
    private String prenume;
    private String nume;
    private int varsta;

    public Persoana(String prenume, String nume, int varsta){
        System.out.println("Persoana constructor"+"\n");
        this.prenume=prenume;
        this.nume = nume;
        this.varsta=varsta;
    }

    public void setPrenume(String prenume){
        this.prenume=prenume;
    }

    public String getPrenume(){
        return prenume;
    }

    public void setNume(String nume){
        this.nume=nume;
    }

    public String getNume(){
        return nume;
    }

    public void setVarsta(int varsta){
        this.varsta=varsta;
    }

    public int getVarsta(){
        return varsta;
    }

    public String descriere(){
        String text="";
        text+="prenume " +prenume+ "\n";
        text+="nume " + nume+"\n";
        text+="varsta " + varsta+"\n";

        return text;
    }
}
