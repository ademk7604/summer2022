package day15_overloading_forLoop;

public class C09_ForLoopSoru3 {
    public static void main(String[] args) {
        //Soru 3) 100’den baslayarak 50’ye kadar olan sayilari aralarinda virgule olarak ayni satirda
        //yazdirin
        for (int i = 100; i > 50; i--) {
            if (i < 100 && i > 51) {
                System.out.print(i + ",");
            } else if (i == 51) {
                System.out.print(i);
            }
        }
    }
}
