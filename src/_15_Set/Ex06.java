package _15_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        HashSet<Integer> hs=generateSet();
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        Integer[] dizi=convertToArray(hs);
        System.out.println("dizi = " + Arrays.toString(dizi));
    }

    public static Integer[] convertToArray(HashSet<Integer> hs)
    {
        //1.Yöntem
        Integer[] dizi=new Integer[hs.size()];

        int index=0;
        for(int e : hs)
        {
            dizi[index]=e;
            index++;
        }

        //2.Yöntem
        dizi = hs.toArray(new Integer[hs.size()]);

        return dizi;
    }

    public static HashSet<Integer> generateSet()
    {
        HashSet<Integer> set = new HashSet<>();

        int a = 0;
//        for (int i = 0; i < 10; i++) {
//            a = (int) (Math.random() * 20);
//            set.add(a);
//        }

        while(set.size() < 10)
        {
            a = (int) (Math.random() * 20);
            set.add(a);
        }
        return set;
    }
}
