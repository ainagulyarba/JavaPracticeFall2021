package _15_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli elemanlari 0-20 arasinda 2 adet  ArrayList hazirlayan ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {

        //   System.out.println(arrListHazirla(10,5,10)); // metodu burada parantez içinde kullanabiliriz.
        //   değişken ataması yapar.

        //    ArrayList<Integer>arrayList1 = new ArrayList<>(arrListHazirla(10,5,10));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1 = arrListHazirla(10, 5, 10);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2 = arrListHazirla(5, 0, 20);

        System.out.println("arrList1 = " + arrayList1);
        System.out.println("arrList2 = " + arrayList2);

        //    arrayList1.retainAll(arrayList2);//Kesişimi
        //    System.out.println(arrayList1);

        ArrayList<Integer> arrayListFark1 = new ArrayList<>();
        ArrayList<Integer> arrayListFark2 = new ArrayList<>();

        arrayListFark1 = arrayList1;
        arrayListFark2 = arrayList2;

        arrayListFark1.removeAll(arrayList2); //1 in 2 den farkı
        System.out.println("arrListFark1 = " + arrayListFark1);
                arrayListFark2.removeAll(arrayList1); //2nin 1 den farkı
        System.out.println("arrListFark2 = " + arrayListFark2);

        //     arrayListFark1.addAll(arrayListFark2); // Farkların birleşimi
        //      System.out.println("arrListFarkların birleşimi =" + arrayListFark1);

        Collections.sort(arrayListFark1); // Farkın sıralanması
        System.out.println("Fark1 in sıralanmış hali = " + arrayListFark1);

        Collections.reverse(arrayListFark1); // Farkın tersten yazdırılması
        System.out.println("Fark2 in sıralanmış hali =" + arrayListFark1);
    }

    public static int getRandom(int min, int max) {

        return (int) (min + Math.random() * (max - min + 1));
    }


    public static ArrayList<Integer> arrListHazirla(int size, int min, int max) {

        ArrayList<Integer> tempArrList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            tempArrList.add(getRandom(min, max));
        }
        return tempArrList;
    }
/*
ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
      list1=  listCreat(10, 0, 20);
      list2=  listCreat(5, 0, 20);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        // 2.  Bu iki list'in ortak elemanlarini bulunuz.
       // list1.retainAll(list2);
        //System.out.println("kesişen elemanlar : " + list1);//kesişen elelman verir.
        //  3.  Bu iki list'in farkli olan elemanlarini bulunuz
        ArrayList<Integer>yeniL1=new ArrayList<>();
        ArrayList<Integer>yeniL2=new ArrayList<>();
       yeniL1=list1;
        yeniL2=list2;
        yeniL1.removeAll(list2);//l1 olup l2 de olmayanalar=l1-l2
        yeniL2.removeAll(list1);//l2 de olup l1 de olmayanlar=l2-l1
        System.out.println("l1 deki farklı elemanlar :" + yeniL1);
        System.out.println("l2 deki farklı elemanlar :" + yeniL2);
        yeniL1.addAll(yeniL2);//l1 ve l2 benzeesiz farklı elemanlrını l1 e atadık
        System.out.println("l1 ve l2 deki farklı elemanlar hepsi :" + yeniL1);
    }
    private static ArrayList<Integer> listCreat(int boyut, int min, int max) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i < boyut; i++) {
            liste.add((int) (min + Math.random() * (max - min + 1)));// başladığın +rastgelesayı*(bittiğin-başladığın+1)=başladığın ile bittiğin arasındaki rastgele sayılar
        }
        return liste;
    }

 */
}
