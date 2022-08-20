package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
         */

        String[] harfler= {"Y", "B", "D", "O", "A"}; // ortadan baslar, deger buyukse saga kucuk se sola dogru girder arar
        String arananHarf="Y";                      // burda y d den buyuk o yuzden saga gider ve yanlis deger bulur
        System.out.println(Arrays.binarySearch(harfler,arananHarf));// -6 D yi arattigimizda 2 veriyor dogru yani A da -1 verir
        System.out.println(C03_Contains.contains(harfler,arananHarf));
        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf)); // binarys. yapmadan once de tru dondu

    }
}
