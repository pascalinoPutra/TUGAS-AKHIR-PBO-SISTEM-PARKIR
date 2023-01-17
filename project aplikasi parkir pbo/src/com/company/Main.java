package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih;

        Mobil mbl = new Mobil();
        Motor mtr =  new Motor();
        LahanParkir lhn=new LahanParkir(false);
        Pengunjung pengunjung=new Pengunjung();
        Umum umum=new Umum();
        Karyawan karyawan=new Karyawan();
        Mahasiswa mhs=new Mahasiswa();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("===== SELAMAT DATANG DI PARKIRAN UAD =====");
            System.out.println("===========================================");
            pengunjung.entry();
            System.out.print("masukan pilihan menu : ");
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    umum.entryUmum();
                    break;
                case 2:
                    karyawan.entryKaryawan();
                    break;
                case 3:
                    mhs.entryMhs();
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("-------------------------------------------");
            System.out.println("[1] Mobil");
            System.out.println("[2] Motor");
            System.out.println("[0] exit");
            System.out.print("masukan pilihan menu : ");
            pilih = input.nextInt();
            System.out.println("-------------------------------------------");
            if(pilih==1){
                System.out.println("============ parkiran mobil UAD ===========");
                mbl.kendaraanMasuk();
                mbl.cetakKarcis();
                lhn.setKendaraanIn(true);
                lhn.entryParking();
                mbl.exit_parkir();
                }
            else if (pilih==2){
                System.out.println("============ parkiran motor UAD ===========");
                mtr.kendaraanMasuk();
                mtr.cetakKarcis();
                lhn.setKendaraanIn(true);
                lhn.entryParking();
                mtr.exit_parkir();
            }
            else if(pilih==0){
                System.exit(0);
            }
            else
            {
                System.out.println("inputan yang anda masukan salah");
            }
        }

    }
}
