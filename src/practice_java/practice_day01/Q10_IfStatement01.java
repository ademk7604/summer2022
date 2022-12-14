package practice_java.practice_day01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Y/N ikisinden birisini giriniz :");
        char karakter = scan.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
        } else { // eger bir code kapsamda body tek satirsa {} kullnmayabilirim hata vermez yani else d.
            System.out.println("Lutfen Y/N ikilisinden birini tercih ediniz");
        }
    }
}
