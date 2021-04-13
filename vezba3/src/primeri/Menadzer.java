package primeri;

public class Menadzer extends Korisnik {
    public Menadzer(String korisnickoIme, String lozinka) {
        super(korisnickoIme, lozinka);
    }

    @Override
    public String getKorisnickoIme() {
        return "Menadzer: " +  super.getKorisnickoIme();
    }
}
