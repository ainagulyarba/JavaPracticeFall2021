package interviewPrep;

public class Q13 {
    public static void main(String[] args) {
        /*
        Write a Java Program to swap two numbers

        Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
        iki yoldan yaptiginiz java kodunu yaziniz.
        1.Yol: 3. degisken kullanarak
        2.Yol: 3. degisken kullanmadan
   */

        //1.Yol: 3. degisken kullanarak...

        System.out.println("Swap 1.Yol: 3. degisken kullanarak...  ************");
        int a = 5;
        int b = 7;
        System.out.println("Swap öncesi :" + "a=" + a + " " + "b=" + b);
        int c = a; //c=5;
        a = b;// a=7;
        b = c;//b=5
        System.out.println("Swap sonrası :" + "a=" + a + " " + "b=" + b);


        // 2.Yol: 3. degisken kullanmadan...

        System.out.println("Swap 2.Yol: 3. degisken kullanmadan...  ************");
        System.out.println("Swap öncesi :" + "a=" + a + " " + "b=" + b);
        a = a + b;//a=5+7=12
        b = a - b;//b=12(a+b ile atanan yeni a değeri) - 5(eski b değeri)=7(eski a yeni           b değeri)
        a = a - b;//a=12(a+b ile atanan yeni a değeri) - 7(yeni b değeri) = 5(eski b yeni a değeri)

        System.out.println("Swap sonrası :" + "a=" + a + " " + "b=" + b);
    }

}

