package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin
        String arr [] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(  arr[0].length()  + arr[arr.length-1].length()   );

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String brr [] = new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        //1 yol for loop
        int totalChar=0;

        for (int i = 0; i <brr.length ;             i++) {
            totalChar= totalChar+brr[i].length();

        }
        System.out.println(totalChar);

        //2. Yol for eac loop (enhanced loop)
        //baslangıc değeri, loopun çalışma şartı ve ıncrement decrement kısımını kendisi halleder

        /*
        for(DataType w:arr/collection){
            calisacak kodlar
        }

         */

        int sum=0;
        for (String w:brr  ){
            sum=sum+w.length();

        }
        System.out.println(sum);

        //Ornek 3: Notlar adında Integer bir Array olusturunuz içine 6 tabe not yerşetiriniz ve not
        // ortalamasını

        int notlar [] = new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;
        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]

        int toplam=0;
        for (int w: notlar){
            toplam=w+toplam;

        }
        System.out.println(toplam/notlar.length);


    }
}