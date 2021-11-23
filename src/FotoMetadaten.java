import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FotoMetadaten {
    private int bereite;
    private int hoehe;
    private String kameraMarke;
    private String kamerModel;
    LocalDateTime  erstelungszeitpunkt;



    public FotoMetadaten(int bereite, int hoehe, String kameraMarke,String kamerModel, LocalDateTime erstelungszeitpunkt) {
        this.bereite = bereite;
        this.hoehe = hoehe;
        this.kameraMarke = kameraMarke;
        this.kamerModel = kamerModel;
        this.erstelungszeitpunkt = erstelungszeitpunkt;
    }



    public int getHoehe(){
        return hoehe;
    }
    public int getBereite(){
        return bereite;
    }
    public String getKameraMarke(){
        return kameraMarke;
    }
    public String getKamerModel(){
        return kamerModel;
    }
    public String getertselungszeitpunkt(){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("de"));
        String germanDateTime = erstelungszeitpunkt.format(formatter);
        return germanDateTime;
    }

    @Override
    public String toString() {
        return "FotoMetadaten{" +
                "bereite=" + bereite +
                ", hoehe=" + hoehe +
                ", kameraMarke='" + kameraMarke + '\n' +
                ", kamerModel='" + kamerModel + '\n' +
                ", erstelungszeitpunkt=" + erstelungszeitpunkt + '}'+'\n';
    }
}
