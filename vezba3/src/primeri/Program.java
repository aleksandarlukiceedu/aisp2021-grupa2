package primeri;

public class Program {

    public static void main(String[] args) {
//        GeometrijskiOblik[] go = new GeometrijskiOblik[4];
//
//        Kvadrat k = new Kvadrat(2);
//        Kvadrat k1 = new Kvadrat(5);
//
//        Krug krug1 = new Krug(0.5);
//        Krug krug2 = new Krug(1.5);
//
//        go[0] = k;
//        go[1] = k1;
//        go[2] = krug1;
//        go[3] = krug2;
//
//        for (GeometrijskiOblik oblik: go) {
//            System.out.println(oblik);
//            System.out.println(oblik.izracunajObim());
//            System.out.println(oblik.izracunajPovrsinu());
//        }

        Menadzer m = new Menadzer("Petar", "pera123");
        Korisnik k = m;

        System.out.println(k.getKorisnickoIme());

    }
}
