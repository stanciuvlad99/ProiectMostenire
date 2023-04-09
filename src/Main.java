import models.animal.Pisica;
import models.apartament.Apartament;
import models.apartament.Bucuresti;
import models.casti.Kraken;
import models.laptop.Legion;
import models.monitor.Alienware;
import models.motocicleta.GSX;
import models.pantofi.Sobakov;
import models.persoana.Job;
import models.tastatura.Huntsman;
import models.telefon.Iphone;

public class Main {
    public static void main(String[] args) {

//        Job job = new Job("Vlad", "Stanciu", 23, "inginer", "vidaXL", 4000);
//        System.out.println(job.descriere());

//        Pisica pisica = new Pisica("pisca", "maidaneza", 2, "Hazel",
//                "gri tigrat", 5.5);
//        System.out.println(pisica.descriere());

//        Alienware alienware = new Alienware("Alienware", 24.5, "negru", 240,
//                "FHD", 1500);
//        System.out.println(alienware.descriere());

//        Legion legion = new Legion("Lenovo", 16, "negru", "Legion",
//                "RTX2060", "I7");
//        System.out.println(legion.descriere());

//        Iphone iphone = new Iphone("Apple", "Iphone 12", 256, 6.8,
//                12, "negru");
//        System.out.println(iphone.descriere());

//        Huntsman huntsman = new Huntsman("Razer", 1100, "negru", "Huntsman Elite",
//                104);
//        System.out.println(huntsman.descriere());

//        GSX gsx = new GSX("Suzuki", "GSX", 11200, 152, 1000,
//                "albastru");
//        System.out.println(gsx.desciere());

//        Kraken kraken = new Kraken("Razer", "kraken", 7.1, "negru", 100);
//        System.out.println(kraken.descriere());

//        Sobakov sobakov = new Sobakov("Adidas", "Sobakov", 400, "gri", 43);
//        System.out.println(sobakov.descriere());

        Bucuresti bucuresti = new Bucuresti("Bucuresti", 3,2,100,
                47,6);
        System.out.println(bucuresti.descriere());
    }
}