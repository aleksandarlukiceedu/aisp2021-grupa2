package zadatak1;

public class Zadatak1 {

    public static int prvi(int n){
        return  n*(n-1)/2;
    }

    public static void main(String[] args){
        int rez = Zadatak1.prvi(5);
        System.out.println(rez);
    }
}
