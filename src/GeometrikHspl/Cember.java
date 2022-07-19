package GeometrikHspl;

public class Cember extends Geometrik_Veriler {

    public void cemberCevreHesap(){
        System.out.print("Lutfen cember cevre hesaplama icin yaricap giriniz : ");
        setYaricap(scan.nextDouble());
        System.out.println("Cember Cevre : "+ (2*pi*getYaricap()));
    }

    public void cemberAlanHesap(){
        System.out.print("Lutfen cember alan hesaplama icin yaricap giriniz : ");
        setYaricap(scan.nextDouble());
        System.out.println("Cember Alan : "+ (pi*getYaricap()*getYaricap()));

    }





}
