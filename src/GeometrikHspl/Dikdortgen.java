package GeometrikHspl;

public class Dikdortgen extends Geometrik_Veriler {

    public void dikdortgenCevreHesap(){

        System.out.print("Lutfen dikdortgen cevre hesaplama icin kisa kenar giriniz : ");
        setKisaKenar(scan.nextDouble());
        System.out.print("Lutfen dikdortgen cevre hesaplama icin uzun kenar giriniz : ");
        setUzunKenar(scan.nextDouble());
        System.out.println("Dikdortgen cevre : "+2*(getKisaKenar()+getUzunKenar()));


    }
    public void dikdortgenAlanHesap(){

        System.out.print("Lutfen dikdortgen alan hesaplama icin kisa kenar giriniz : ");
        setKisaKenar(scan.nextDouble());
        System.out.print("Lutfen dikdortgen alan hesaplama icin uzun kenar giriniz : ");
        setUzunKenar(scan.nextDouble());
        System.out.println("Dikdortgen alan : "+(2*getKisaKenar()*getUzunKenar()));


    }
}
