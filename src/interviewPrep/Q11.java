package interviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
         Create a function that takes an array and returns the difference between
         and the smallest numbers.
         Ask user to enter array elements.

        kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.
         */

        array();

    }

    private static void array() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Integer array's length : ");
        int length = scan.nextInt();

        int array[] = new int[length];

        for (int i = 0; i < length; i++) {

            System.out.println("Please enter array " + (i + 1) + ". elements");
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[length - 1] + "-" + array[0] + "=" + (array[length - 1] - array[0]));

    }
}

