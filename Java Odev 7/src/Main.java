/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double  armut =2.14, elma=3.67,domates=1.11,muz=0.95,patlican=5.0,total=0, kilo=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kac kilo? : ");
        kilo = inp.nextDouble();
        total+=kilo*armut;

        System.out.print("Elma kac kilo? : ");
        kilo = inp.nextDouble();
        total+=kilo*elma;

        System.out.print("Domates kac kilo? : ");
        kilo = inp.nextDouble();
        total+=kilo*domates;

        System.out.print("Muz kac kilo? : ");
        kilo = inp.nextDouble();
        total+=kilo*muz;

        System.out.print("Patlican kac kilo? : ");
        kilo = inp.nextDouble();
        total+=kilo*patlican;


        System.out.print("Toplam Tutar  : "+total+ " TL");
    }
}