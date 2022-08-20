package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
         /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle = "Java buyuk, dunya kucuk";

        // requirements'de buyuk harf kucuk harf hassasiyeti hakkinda bir sey
        // soylenmemis(produkt onlira bu gorevi tekrar sorarim) mantik anlaminda hava da kaliyor
        // ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requirements: ikisini de iceryorsa "kara ver buyuk mu yazdirayim, kucuk mu ?"
        // case sensitive olmasin


        cumle = cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) { // en sinrlandirici olani if e yani basa yazmam lazim.
            System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
