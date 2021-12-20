package _15_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
    /*
        main islemleri
        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist olusturun
        2.  ekrana yazdirin
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu yazin
        4.  sonucu ekrana yazdirin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin
        7.  Hem Set hem de ArrayList'e method ile hazirlanacak olan 20 elemanli,
            elemanlari 0-10 arasinda random sayilardan olusan arraylist'i ekleyin
        8. Sonuc Set ve ArrayList'i yazdirin
        9. Set icinde cift olan elemanlari iterator kullanarara silin

     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 =arrListHazirla(30, 0, 10);//1.adım method call
        System.out.println("arrayList1 = " + arrayList1);//2.adım

        System.out.println("*********************************");
        //3.adım
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(10, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 60, 70, 80, 90, 10));

        System.out.println("arrayList2 = " + arrayList2);

        System.out.println("tekrarlananlar silinmiş hali" + tekrarlariSil(arrayList2));//4.adım

        System.out.println("*********************************");

        Set<Integer> set = SeteCevir(arrayList1);//5.adım method call

        System.out.println("set = " + set);


        System.out.println("*********************************");

        System.out.println("list = " + ListeCevir(set));//6.adım method call
    }

    //1. Adım method
    public static ArrayList<Integer> arrListHazirla(int size, int min, int max) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrList.add((int) (min + Math.random() * (max - min + 1)));

        }
        return arrList;
    }
//3.Adım method
    public static Set<Integer> tekrarlariSil(ArrayList<Integer> arrList2) {

        Set<Integer> tekraredenler = new HashSet<>(arrList2);//arraylşst elemanlarını hashsete attık

        return tekraredenler;
    }
//5.Adım method
    public static Set<Integer> SeteCevir(ArrayList<Integer> arrayList) {

        Set<Integer> set = new HashSet<>(arrayList);

        return set;
    }
//6.Adım method
    public static ArrayList<Integer> ListeCevir(Set<Integer> set) {

        ArrayList<Integer> list = new ArrayList<>(set);

        return list;
    }
}

