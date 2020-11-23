package zadatak04;

public class Zadatak04 {

    public static void main(String[] args) {

        OnlineProizvod tastatura = new OnlineProizvod("X35", 55, 2);
        OfflineProizvod tastatura1 = new OfflineProizvod("X35", 55, 2);

        System.out.println(tastatura.racunajCenu());
        System.out.println(tastatura1.racunajCenu());

    }

}
