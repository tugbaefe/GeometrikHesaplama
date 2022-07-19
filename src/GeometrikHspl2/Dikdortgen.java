package GeometrikHspl2;

import static GeometrikHspl2.Geometrik_Hesaplama.*;

public class Dikdortgen {

    public  static void dikdortgenHesap() {
        System.out.println("lutfen dikdortgenın uzun kenar ve kısa kenarı giriniz");
        duzunKenar=scan.nextDouble();
        dkısaKenar=scan.nextDouble();
        double cevre = (duzunKenar + dkısaKenar) * 2;
        double alan = duzunKenar * dkısaKenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
