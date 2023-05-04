package com;
import java.util.Scanner;

class Mobil {
   protected int kecepatan;

   public void naikKecepatan(int increment) {
      kecepatan += increment;
      System.out.println("kecepatan sekarang: " + kecepatan);
   }

   public void turunKecepatan(int decrement) {
      kecepatan -= decrement;
      System.out.println("kecepatan sekarang: " + kecepatan);
   }
}


class MobilRemoteControl extends Mobil {
   private boolean hidup;

   public MobilRemoteControl() {
      hidup = false;
      kecepatan = 0;
   }

   public void hidupkan() {
      hidup = true;
      System.out.println("mobil dinyalakan");
   }

   public void matikan() {
      hidup = false;
      kecepatan = 0;
      System.out.println("mobil dimatikan");
   }

   public boolean getStatus() {
      return hidup;
   }
}


public class ProgramSimulasiMobil {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      MobilRemoteControl mobil = new MobilRemoteControl();

      System.out.println("program simulasi remote control");
      System.out.println("--*********************************--");

      while (true) {
         System.out.println("\nMenu:");
         System.out.println("1.nyalakan mobil");
         System.out.println("2.matikan mobil");
         System.out.println("3.naik kecepatan");
         System.out.println("4.turun kecepatan");
         System.out.println("5.exit");
         System.out.print("pilihan: ");
         int pilihan = input.nextInt();

         switch (pilihan) {
            case 1:
               if (!mobil.getStatus()) {
                  mobil.hidupkan();
               }
               else {
                  System.out.println("mobil dinyalakan");
               }
               break;
            case 2:
               if (mobil.getStatus()) {
                  mobil.matikan();
               }
               else {
                  System.out.println("mobil dimatikan");
               }
               break;
            case 3:
               if (mobil.getStatus()) {
                  mobil.naikKecepatan(10);
               }
               else {
                  System.out.println("nyalakan mobil terlebih dahulu");
               }
               break;
            case 4:
               if (mobil.getStatus()) {
                  mobil.turunKecepatan(10);
               }
               else {
                  System.out.println("nyalakan mobil terlebih dahulu");
               }
               break;
            case 5:
               System.out.println(" - terimakasih - ");
               System.exit(0);
            default:
               System.out.println("pilihan tidak valid");
         }
      }
   }
}
