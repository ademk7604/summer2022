package practice_java.practice_day10;

import java.util.Scanner;

public class UzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));

        // ben bugun javayi daha cok sevdim ama cok zorlandim

    }

    public static String enUzunKelime(String cumle) { // en uzun kelime istiyor
        String []arr=cumle.split(" "); // bu sekilde string veriyi array a ceviriyoruz. cok onemli
        int max=0;
        String longesWord="";
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>max){
                max=arr[i].length(); // max ilk calistiginda kod max= 3 oldu
                longesWord=arr[i];

            }

        }

     return longesWord;
    }

}
