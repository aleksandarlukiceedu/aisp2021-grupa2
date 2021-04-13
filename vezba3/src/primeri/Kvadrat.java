package primeri;

public class Kvadrat extends GeometrijskiOblik {
    private double stranica;

    public Kvadrat(double stranica){
        super();
        this.stranica = stranica;
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double izracunajObim() {
        return 4 * stranica;
    }

    @Override
    public double izracunajPovrsinu() {
        return stranica * stranica;
    }
}
