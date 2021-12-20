package _15_Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet02 {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */

        String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};
        ArrayList<String> list = new ArrayList<>();
        list = cevir(arr);
        System.out.println(list);

        HashSet<String> hs = new HashSet<>(list);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
        TreeSet<String> ts = new TreeSet<>(list);
        System.out.println("hurra :" + hs);
        System.out.println("giris sirasi :" + lhs);
        System.out.println("alfabetik sira :" + ts);

    }

    public static ArrayList<String> cevir(String[] arr) {
        ArrayList<String> ArrList = new ArrayList<>();
        for (String w : arr) {
            ArrList.add(w);
        }

        return ArrList;
    }
}
