package zadatak06;

import java.util.Scanner;
import java.util.Arrays;

public class Zadatak06 {

    public static void main(String[] args) {
        int[][] array;
        int n, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite n velicinu niza");
        n = sc.nextInt();
        System.out.println("Unesite m velicinu niza");
        m = sc.nextInt();

        array = new int[n][m];
        int[][] newArr = new int[n][m];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                array[row][column] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sumOfElements(array));
    }

    public static int sumOfElements(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    sum += array[i][j];
                }

            }
        }
        return sum;
    }

}
