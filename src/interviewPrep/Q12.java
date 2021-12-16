package interviewPrep;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nurses run" .


        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adana`da pide ye,  Traş niçin şart

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scan.nextLine();

        palindromStringBuilder(metin);
        polindromForLoop(metin);

    }
    // StringBuilder cozum  ....
    private static void palindromStringBuilder(String str) {

        StringBuilder sb = new StringBuilder(str);
        String tersStr = sb.reverse().toString();

        if (tersStr.equalsIgnoreCase(str)) {
            System.out.println("Girilen metin polindrom ifadedir.." + tersStr);

        } else {
            System.out.println("Girilen ifade polindrom ifade degildir.." + tersStr);
        }


    }
    //Loop cozum  ......
    private static void polindromForLoop(String str) {

        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            tersStr += str.charAt(i);
        }

        System.out.println(tersStr);

        if (tersStr.equalsIgnoreCase(str)) {

            System.out.println("Girdiginiz metin PALINDROME'dur");

        } else {

            System.out.println("Girdiginiz metin PALINDROME degildir");
        }
    }
}

