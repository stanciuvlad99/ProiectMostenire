package models.animal;

public class Animal {
    private String animal;
    private String rasa;
    private int varsta;

    public Animal(String animal, String rasa, int varsta){
        System.out.println("Animal constructor"+"\n");
        this.animal=animal;
        this.rasa=rasa;
        this.varsta=varsta;
    }

    public String getAnimal(){
        return animal;
    }

    public void setAnimal(String animal){
        this.animal=animal;
    }

    public String getRasa(){
        return rasa;
    }

    public void setRasa(String rasa){
        this.rasa=rasa;
    }

    public int getVarsta(){
        return varsta;
    }

    public void setVarsta(int varsta){
        this.varsta=varsta;
    }

    public String descriere(){
        String text="";
        text+="animal " + animal+"\n";
        text+="rasa " + rasa + "\n";
        text+="varsta " + varsta + "\n";
        return text;
    }
}
