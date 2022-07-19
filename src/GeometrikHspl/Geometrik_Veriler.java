package GeometrikHspl;

import java.util.Scanner;

public class Geometrik_Veriler {
    static Scanner scan=new Scanner(System.in);
    private double kisaKenar;
    private double uzunKenar;
    private double yaricap;
    static double kkenar;
    static double pi=3.4;

    public Geometrik_Veriler() {
    }

    public Geometrik_Veriler(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public Geometrik_Veriler(double yaricap) {
       setYaricap(yaricap);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        if (kisaKenar<0){
            this.kisaKenar = -kisaKenar;
        }else this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        if (uzunKenar<0){
            this.uzunKenar = -uzunKenar;
        }else this.uzunKenar = uzunKenar;
    }


    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap<0){
            this.yaricap = -yaricap;
        }else this.yaricap = yaricap;
    }
}
