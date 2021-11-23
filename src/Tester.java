

public class Tester {
    public static void main(String[] args) {

        Foto foto1=new Foto("SkyFall","AdeleSkyfall.jpg");
        Foto foto3= new Foto("Hello","AdeleHello.jpg");
        Foto foto2=new Foto("Spiderman","Spidy.jpg");

        Foto foto4= new Foto("Thanos Snaps","Snap.jpg");

        Album album1=new Album("Adele","Aya");
        Album album=new Album("Avengers","Elkholy");


        album1.addFotos(foto1);
        album1.addFotos(foto3);
        album.addFotos(foto2);
        album.addFotos(foto4);

        Fotoverwaltung fotoverwaltung=new Fotoverwaltung();

        fotoverwaltung.AddAlbum(album1);
        fotoverwaltung.AddAlbum(album);

        fotoverwaltung.druckeAlleAlben();
        int x=0;
        for (int i = 0; i <fotoverwaltung.gibAlleAlben().length ; i++) {
            if (fotoverwaltung.gibAlleAlben()[i]!=null)
                x++;

        }
        Album [] alb = new Album[x];
        alb= fotoverwaltung.gibAlleAlben();
        for (int i = 0; i <alb.length ; i++) {
            if (alb[i]!=null){
                System.out.println(alb[i]);}
        }
        System.out.println("===========================");

        System.out.println(fotoverwaltung.findeAlbumMitName("Avengers"));
        System.out.println();
        System.out.println(fotoverwaltung.findeAlbumMitName("DC"));
        System.out.println();
        System.out.println("Anzahl der Alben: "+ fotoverwaltung.gibAnzahlAlben());
        System.out.println();
        foto1.drucke();
    }
}