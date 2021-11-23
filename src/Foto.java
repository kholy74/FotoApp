
import java.time.LocalDateTime;
public class Foto {


    private FotoMetadaten fotoMetadatens =new FotoMetadaten(1024,1024,"NIKON CORPORATION ","D750", LocalDateTime.now());

    private String name;
    private String dateiName;

    public Foto(String name, String dateiName) {
        this.name = name;
        this.dateiName = dateiName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateiName() {
        return dateiName;
    }

    public void setDateiName(String dateiName) {
        this.dateiName = dateiName;
    }

    public void drucke(){
        System.out.println("Name: " + getName());
        System.out.println("Dateiname: " + getDateiName());
        if (fotoMetadatens!=null) {
            System.out.println("Größe: "+(fotoMetadatens.getHoehe()*fotoMetadatens.getBereite()));
            System.out.println("Kamera: "+fotoMetadatens.getKameraMarke()+fotoMetadatens.getKamerModel());
            System.out.println("Erstellungsdatum: "+fotoMetadatens.getertselungszeitpunkt());
        }
        else System.out.print(" ");
    }

    @Override
    public String toString() {
        return "Foto{" +
                "name='" + name + '\n' +
                ", dateiName='" + dateiName + '\n' +
                '}';
    }
}