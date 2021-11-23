import java.util.Arrays;

public class Album {
    private int y=2;

    private  Foto[]fotos=new Foto[y];

    private String name;
    private String besitzer;
    private  int counter =0;

    public Album(String name, String besitzer) {
        this.name = name;
        this.besitzer = besitzer;
    }

    public String getName() {
        return name;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public static Foto[] copyOf​(Foto[] original, int newLength){

        assert (newLength > original.length);

        Foto[] neueFotos=new Foto[newLength];
        neueFotos=original;
        return neueFotos;

    }

    public void drucke(){


        for (int i = 0; i < fotos.length; i++) {
            if (fotos[i] != null) {
                System.out.println("=== Foto " + (i + 1) + " ===");
                fotos[i].drucke();
                System.out.println("---------------------------");
            }
        }
    }


    public Foto[] getFotos(){
        return fotos;
    }
    public boolean isFull(){
        boolean x=true;
        for (int i = 0; i <fotos.length ; i++) {
            if (fotos[i]!=null)
                x=false;
        }
        return x;
    }

    public void addFotos(Foto foto){
        y++;
        if (counter>= fotos.length){
            copyOf​(fotos, fotos.length+50)[counter]=foto;
            counter++;
        }
        else {
            fotos[counter]=foto;
            counter++;
        }
    }


    @Override
    public String toString() {
        return "Album{" +
                "fotos=" + Arrays.toString(fotos) +
                ", name='" + name + '\n' +
                ", besitzer='" + besitzer + '\'' +
                '}'+ '\n';
    }
}