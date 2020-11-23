package zadatak14;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Zadatak14 {

    public static void main(String[] args) {

        int n, a;
        int[] myArray;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza");
        n = sc.nextInt();
        myArray = new int[n];
        System.out.println("Unesite elemente niza");

        for (int i = 0; i < myArray.length; i++) {

            a = sc.nextInt();
            myArray[i] += a;

        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(najduziNiz(myArray));

    }

    public static int najduziNiz(int[] nums) {

        HashSet<Integer> mojSet = new HashSet<>();

        for (int num : nums) {
            mojSet.add(num);
        }

        int result = 0;

        for (int num : nums) {
            int count = 1;

            int down = num - 1;

            while (mojSet.contains(down)) {

                mojSet.remove(down);
                down--;
                count++;
            }

            int up = num + 1;

            while (mojSet.contains(up)) {

                mojSet.remove(up);
                up++;
                count++;
            }

            result = Math.max(result, count);
        }

        return result;
    }
}
