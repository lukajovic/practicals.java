package zadatak14;

import java.util.Scanner;

public class Zadatak14 {

    public static void main(String[] args) {
        new Zadatak14();
    }

    public Zadatak14() {

        int n;

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            
            sum += i;
        }

        System.out.println("Zbir svih brojeva je " + sum);
    }
}
