package com.company;

import java.util.Scanner;

public class Mahasiswa extends Pengunjung {

    Scanner in = new Scanner(System.in);

    public void entryMhs(){
        System.out.println("kategori pengunjung mahasiswa");
        System.out.print("NIM  : ");
        nim=in.nextLine();
        setNim(nim);
    }
}
