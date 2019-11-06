package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  int x,y,z;
        double ortalama;

        Scanner tara =new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        x=tara.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        y=tara.nextInt();

        System.out.println("üçüncü sayıyı giriniz");
        z=tara.nextInt();

        ortalama=(x+y+z)/3d;

        System.out.println("sonuç ="+ ortalama);*/

        String isim ;
        Scanner tara =new Scanner(System.in);
        System.out.println("adınızı girin");
        isim=tara.next();

        for(int i=0;i<5;i++)
        {
            System.out.println("isminiz:"+isim);
        }




    }
}
