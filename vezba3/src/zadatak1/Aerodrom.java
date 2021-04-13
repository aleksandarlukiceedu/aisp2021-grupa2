package zadatak1;

public class Aerodrom {
    public String naziv;
    public Koordinata lokacija;

    public Aerodrom(){
        this.naziv = "";
        this.lokacija = new Koordinata();
    }

    public Aerodrom(String naziv, Koordinata lokacija){
        this.naziv = naziv;
        this.lokacija = lokacija;
    }

    @Override
    public String toString() {
        return "Aerodrom (" + naziv + ", " + lokacija + ')';
    }
}
