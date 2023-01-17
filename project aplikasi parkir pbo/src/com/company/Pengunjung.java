package com.company;


public class Pengunjung  {
    protected String noKtp;
    protected String idKaryawan;
    protected String nim;

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void entry()
    {
        System.out.println("kategori Pengunjung ");
        System.out.println("[1] Umum");
        System.out.println("[2] Karyawan");
        System.out.println("[3] Mahasiswa");
        System.out.println("[0] Exit");
    }

}
