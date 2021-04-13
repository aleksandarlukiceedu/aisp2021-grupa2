package zadatak1;

public class Koordinata {
    public double geoSirina;
    public double geoDuzina;

    public Koordinata(){
    }

    public Koordinata(double geoSirina, double geoDuzina){
        this.geoSirina = geoSirina;
        this.geoDuzina = geoDuzina;
    }

    @Override
    public String toString() {
        return "Koordinata (" +
                 + geoSirina +
                ", " + geoDuzina +
                ')';
    }
}
