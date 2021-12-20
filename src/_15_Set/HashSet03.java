package _15_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet03 {
    /*

	 		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
	    	Cevap: TreeSet

	 		Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	    Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
	 	    Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
     */
    public static void main(String[] args) {

        long start1=System.currentTimeMillis();
        TreeSet<String > ts1 =new TreeSet<>(Arrays.asList("said", "oguz", "levent", "oner", "sedef"));

        long stop1=System.currentTimeMillis();
        System.out.println("treeSet hizi :"+(stop1-start1));



        long start=System.currentTimeMillis();
        HashSet<String> hs =new HashSet<>(Arrays.asList("said", "oguz", "levent", "oner", "sedef"));
        System.out.println(hs);//[sedef, oner, oguz, said, levent]

        TreeSet<String > ts =new TreeSet<>(hs);
        System.out.println(ts);//[levent, oguz, oner, said, sedef]
        long stop=System.currentTimeMillis();
        System.out.println("hashSet ile hizi: "+(stop-start));




    }
}
