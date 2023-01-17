package com.company;

import java.util.Scanner;

public class Umum extends Pengunjung{

    Scanner in = new Scanner(System.in);

    public void entryUmum(){
        System.out.println("kategori pengunjung umum");
        System.out.print("NIK : ");
        noKtp=in.nextLine();
        setNoKtp(noKtp);
    }
}
