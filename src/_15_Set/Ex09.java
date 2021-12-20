package _15_Set;

import java.util.HashSet;

public class Ex09 {

    /*
    main method altinda bos bir hashset olusturunuz.
    parametresi Integer set ve integer array ve adi elementEkle olan bir method yaziniz (return tipi olmayacak)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

//        int[] arr = {10, 27, 3, 40, 57, 6, 7, 8, 9, 10};
//        elementEkle(set,arr);
        elementEkle(set, new int[]{10, 27, 3, 40, 57, 6, 7, 8, 9, 10});
        print(set);
    }

    public static void elementEkle(HashSet<Integer> set, int[] elements) {

        for (int e: elements) {
            set.add(e);
        }
    }

    public static void print(HashSet<Integer> set) {
        for (Integer a : set) {
            System.out.println(a);
        }
    }
}
