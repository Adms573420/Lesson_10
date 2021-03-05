import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class lesson {
    public static void main(String[] args) {
      /*  List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer sayı :list) {
            System.out.println(sayı);

        }
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int sum=0;

        for (Integer sayı:list) {
            sum +=sayı;
        }
        System.out.println(sum);

       ArrayList<String>   gunler=new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        for (String gun:gunler)
        {
            System.out.println(gun.toLowerCase(Locale.ROOT));
        }
        ArrayList<String>  isimler=new ArrayList<>();
     isimler.add("Ahmet");
     isimler.add("Ali");
     isimler.add("Adem");
     isimler.add("AliRıza");
     isimler.add("Abdulkadir");

        Predicate<? super String> isim;
        isimler.removeIf(isim;isimler.size()<4);


        for (String ad:isimler) {
            if(ad.length()<4){
                isimler.remove(ad);
                Sys
                tem.out.println(ad);
       */
        List<Integer> sayilar = ciftSayilar(111);
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }
    }
    public static List<Integer> ciftSayilar(int ust_sinir) {
        List<Integer> ikiye_bolunenler = new ArrayList<>();
        for (int i = 1; i < ust_sinir; i++) {
            if (i % 2 == 0) {
                ikiye_bolunenler.add(i);
            }
        }
        return ikiye_bolunenler;
    }
}













