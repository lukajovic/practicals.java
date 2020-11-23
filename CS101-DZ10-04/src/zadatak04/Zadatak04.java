package zadatak04;

import java.util.List;
import java.util.ArrayList;

public class Zadatak04 {

    public static void main(String[] args) {

        Vlasnik Luka = new Vlasnik("Luka", "Jovic", 1706990383, 00442121214);
        Vlasnik Pera = new Vlasnik("Pera", "Ivanovic", 41241242, 41249242);
        Vlasnik Marinko = new Vlasnik("Marinko", "Danicic", 242342, 4234234);

        List<Vlasnik> vlasniciStanova = new ArrayList<>();
        List<Vlasnik> vlasniciKuca = new ArrayList<>();

        vlasniciStanova.add(Luka);
        vlasniciStanova.add(Pera);
        vlasniciStanova.add(Marinko);

        vlasniciKuca.add(Luka);

        Stan Zgrada = new Stan("Zgrada", 25, vlasniciStanova);
        Kuca Objekat = new Kuca("Zgrada", 35, vlasniciKuca);

        Zgrada.racunajCenu();
        Objekat.racunajCenu();
        System.out.println(Zgrada);
    }

}
