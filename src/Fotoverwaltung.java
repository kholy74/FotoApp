

public class Fotoverwaltung {
    private int x=2;
    private Album[] albums = new Album[x];
    private int counter=0;
    public Fotoverwaltung() {
    }

    public void druckeAlleAlben() {
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null) {
                System.out.println("=== Album" + (i + 1) + " ===");
                System.out.println("Name: " + albums[i].getName());
                System.out.println("Besitzer: " + albums[i].getBesitzer());
                albums[i].drucke();
            }
        }
    }

    public static Album[] copyof(Album[] original, int newLength) {
        assert (newLength > original.length);
        Album[] neueAlbum = new Album[newLength];
        for (int i = 0; i <original.length ; i++) {
            neueAlbum[i]=original[i];
        }
        return neueAlbum;
    }

    public int gibAnzahlAlben() {
        int summe = 0;
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null)
                summe++;
        }
        return summe;
    }

    public Album[] gibAlleAlben() { return albums; }

    public boolean isFull() {
        boolean x = true;
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null)
                x = false;
        }
        return x;
    }

    public void AddAlbum(Album album) {
        x++;
        if (counter>=albums.length) {
            copyof(albums,albums.length+50)[counter] = album;
            counter++;
        }
        if (counter<=albums.length) {
            albums[counter] = album;
            counter++;
        }
    }

    public Album findeAlbumMitName(String name) {
        Album album = null;
        for (int i = 0; i < albums.length; i++) {

            if (albums[i]!=null && albums[i].getName().equals(name)) {
                System.out.println("Album "+name+" wird gefunden!");
                album = albums[i];
                albums[i].drucke();
            }
        }
        return album;
    }
}
