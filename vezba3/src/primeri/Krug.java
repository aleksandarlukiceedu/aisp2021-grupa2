package primeri;

public class Krug extends GeometrijskiOblik {
    private double poluprecnik;

    public Krug(double poluprecnik){
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double izracunajObim() {
        return 2 * poluprecnik * Math.PI;
    }

    @Override
    public double izracunajPovrsinu() {
        return poluprecnik * poluprecnik * Math.PI;
    }

    public double getPoluprecnik(){
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik){
        this.poluprecnik = poluprecnik;
    }
}
