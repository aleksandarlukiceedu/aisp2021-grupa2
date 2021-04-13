package zadatak1;

public class Avion {
    public String oznaka;
    public String model;
    public String proizvodjac;
    public Aerodrom aerodrom;

    public Avion(){
        this.oznaka = "";
        this.model = "";
        this.proizvodjac = "";
        this.aerodrom = new Aerodrom();
    }

    public Avion(String oznaka, String model, String proizvodjac, Aerodrom aerodrom){
        this.oznaka = oznaka;
        this.model = model;
        this.proizvodjac = proizvodjac;
        this.aerodrom = aerodrom;
    }

    public void obaviLet(Aerodrom aerodrom){
        this.aerodrom = aerodrom;
    }

    public Koordinata trenutnaLokacija(){
        if (aerodrom != null){
            return aerodrom.lokacija;
        }
        return new Koordinata();
    }

    @Override
    public String toString() {
        return "Avion{" +
                "oznaka='" + oznaka + '\'' +
                ", model='" + model + '\'' +
                ", proizvodjac='" + proizvodjac + '\'' +
                ", aerodrom=" + aerodrom +
                '}';
    }
}
