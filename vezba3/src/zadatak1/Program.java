package zadatak1;

import primeri.Krug;

public class Program {

    public static void main(String[] args) {
        Koordinata k1 = new Koordinata();
        System.out.println(k1);

        Koordinata k2 = new Koordinata(18.3, 12.1);
        System.out.println(k2);

        Aerodrom a1 = new Aerodrom();
        System.out.println(a1);

        Aerodrom a2 = new Aerodrom("Nikola Tesla", k2);
        System.out.println(a2);

        Aerodrom a3 = new Aerodrom("JFK", new Koordinata(19.2, 17.3));
        System.out.println(a3);

        Avion avion = new Avion("A123", "737", "Boing", a2);
        System.out.println(avion);

        avion.obaviLet(a3);
        System.out.println(avion);

        Koordinata lokacijaAviona = avion.trenutnaLokacija();
        System.out.println(lokacijaAviona);
    }
}
