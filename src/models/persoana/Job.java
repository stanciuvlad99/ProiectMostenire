package models.persoana;

import models.persoana.Persoana;

public class Job extends Persoana {
    private String titlu;
    public String companie;
    public int salariu;

    public Job(String prenume, String nume, int varsta,String titlu, String companie, int salariu){
        super(prenume,nume,varsta);
        System.out.println("Job constructor" + "\n");
        this.titlu=titlu;
        this.companie=companie;
        this.salariu=salariu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="titlu- " + titlu +"\n";
        text+="companie- " + companie + "\n";
        text+="salariu- " + salariu + "\n";
        text+="prenume- " + super.getPrenume() + "\n";
        text+="nume- " + super.getNume() + "\n";
        text+="varsta- " + super. getVarsta();
        return text;
    }
}
