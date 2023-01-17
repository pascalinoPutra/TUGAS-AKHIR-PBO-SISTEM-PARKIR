package com.company;

import java.util.Scanner;

public class Karyawan extends Pengunjung{

    Scanner in = new Scanner(System.in);

    public void entryKaryawan() {
        System.out.println("kategori pengunjung karyawan");
        System.out.print("ID : ");
        idKaryawan=in.nextLine();
        setIdKaryawan(idKaryawan);
    }
}
