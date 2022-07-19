package GeometrikHspl2;

import static GeometrikHspl2.Geometrik_Hesaplama.*;

public class Cember {

    public static void cemberHesap() {
        System.out.println("lutfen yarıcap giriniz");
        yarıcap= scan.nextDouble();
        double cevre = 2 * pi * yarıcap;
        double alan = pi * yarıcap * yarıcap;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }

}
