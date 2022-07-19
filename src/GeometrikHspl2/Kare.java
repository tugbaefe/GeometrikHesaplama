package GeometrikHspl2;

import static GeometrikHspl2.Geometrik_Hesaplama.kkenar;
import static GeometrikHspl2.Geometrik_Hesaplama.scan;

public class Kare {

    public static void kareHesap() {
        System.out.println("lutfen karenın bir kenarını giriniz");
        kkenar=scan.nextDouble();
        double cevre = 4 * kkenar;
        double alan = kkenar * kkenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
