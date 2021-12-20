package _15_Set;

import java.util.HashSet;

public class Ex01 {

    /*

    parametresi  ve adi elementEkle isminde Integer set ve integer array parametreli
    olan bir method yaziniz (return type void)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[]{10, 11, 12, 13, 24};
        elementEkle(hs, new int[]{3,5,7,9});//int[]arr=new int[]{3,5,7,9} farklı gösterim
        elementEkle(hs, arr);//int[]arr=new int[]{10, 11, 12, 13, 24}
        yazdir(hs);

    }

    public static void elementEkle(HashSet<Integer> hset, int[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        for (Integer num : arr) {
            hs.add(num);
        }
        System.out.println(hs);
    }

    public static void yazdir(HashSet<Integer> set) {
        for (Integer sayi : set) {
            System.out.println(sayi);
        }
    }
}
