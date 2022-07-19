package GeometrikHspl;

public class Kare extends Geometrik_Veriler{

    public void kareCevreHesap(){

        System.out.print("Lutfen kare cevre hesaplama icin  kenar giriniz : ");
        kkenar= scan.nextDouble();
        System.out.println("Kare cevre : "+ 4*kkenar);


    }
    public void kareAlanHesap(){

        System.out.print("Lutfen kare alan hesaplama icin  kenar giriniz : ");
        kkenar= scan.nextDouble();
        System.out.println("Kare alan : "+ kkenar*kkenar);


    }
    /*
    public void kareCevreHesap(){

        System.out.print("Lutfen kare cevre hesaplama icin  kisa kenar giriniz : ");
       setKisaKenar(scan.nextDouble());
        System.out.println("Kare cevre : "+ 4*getKisaKenar());


    }
    public void kareAlanHesap(){

        System.out.print("Lutfen kare alan hesaplama icin  kisa kenar giriniz : ");
        setKisaKenar(scan.nextDouble());
        System.out.println("Kare alan : "+ getKisaKenar()*getKisaKenar());


    }

     */
}
