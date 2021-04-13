package primeri;

import java.util.Arrays;

public class Student {
    public String ime;
    public String prezime;
    public String brojIndeksa;
    public int[] ocene;

    public Student(){
         ime = "";
         prezime = "";
         brojIndeksa = "";
         ocene = new int[4];
    }

    public double izracunajProsek(){
        double suma = 0;
        for (int ocena: this.ocene) {
            suma = suma + ocena;
        }

        return suma/ocene.length;
    }

    public void ispisi(){
        double prosek = izracunajProsek();
        System.out.printf(String.format("%1s %2s %3s %4.2f", ime, prezime, brojIndeksa, prosek));
    }

    @Override
    public String toString() {
        double prosek = izracunajProsek();
        return  String.format("%1s %2s %3s %4.2f", ime, prezime, brojIndeksa, prosek);
    }
}