package zadatak04;

import java.util.Scanner;
import java.util.Arrays;

public class Zadatak04 {

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

                if (row % 2 == 0) {

                    newArr[row][column] = array[row][column] + array[row][column];

                } else {
                    newArr[row][column] = array[row][column] - array[row][column];
                }

            }
        }

        System.out.println(Arrays.deepToString(array));

    }

}
