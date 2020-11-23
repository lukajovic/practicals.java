package zadatak04;

import java.util.*;

public class Zadatak04 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesi duzinu pravougaonika");
        Integer a = input.nextInt();
        System.out.println("Unesi sirinu pravougaonika");
        Integer b = input.nextInt();
        Integer sum;
        sum = a * b;

        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Unesi brojeve vece od 0");
        } else if (a == null || b == null) {
            throw new EmptyFieldException("Unesi vrednosti");
        }
        System.out.println("Povrsina pravougaonika je " + sum);
    }
}
