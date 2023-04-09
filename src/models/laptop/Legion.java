package models.laptop;

public class Legion extends Laptop{
    private String model;
    private String placaVideo;
    private String procesor;

    public Legion(String marca,int diagonala, String culoare, String model, String placaVideo, String procesor) {
        super(marca,diagonala,culoare);
        System.out.println("Legion constructor"+"\n");
        this.model = model;
        this.placaVideo = placaVideo;
        this.procesor = procesor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String descriere(){
        String text="";
        text+=super.descriere()+"\n";
        text+="marca "+super.getMarca()+"\n";
        text+="diagonala "+super.getDiagonala()+" inch"+"\n";
        text+="culoare "+super.getCuloare()+"\n";
        text+="model "+model+"\n";
        text+="placa video "+ placaVideo + "\n";
        text+="procesor " + procesor;
        return text;

    }

}
