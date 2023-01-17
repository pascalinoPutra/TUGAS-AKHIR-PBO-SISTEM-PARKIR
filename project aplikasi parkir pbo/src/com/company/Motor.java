package com.company;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Motor extends Kendaraan {

	private int jam3, menit3;
	private int sisa, durasi, total1, total2;
	int hargaMotor = 2000;


	Scanner in = new Scanner(System.in);


	public int getJam3() {
		return jam3;
	}
	public void setJam3(int jam3) {
		this.jam3 = jam3;
	}

	public int getMenit3() {
		return menit3;
	}
	public void setMenit3(int menit3) {
		this.menit3 = menit3;
	}

	public int getSisa() {
		return sisa;
	}
	public void setSisa(int sisa) {
		this.sisa = sisa;
	}

	public int getDurasi() {
		return durasi;
	}
	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}

	public int getTotal1() {
		return total1;
	}
	public void setTotal1(int total1) {
		this.total1 = total1;
	}

	public int getTotal2() {
		return total2;
	}
	public void setTotal2(int total2) {
		this.total2 = total2;
	}



	public void kendaraanMasuk() {
		GregorianCalendar date = new GregorianCalendar();

		jamMasuk=date.get(Calendar.HOUR_OF_DAY);
		menitMasuk=date.get(Calendar.MINUTE);

		tglMasuk=date.get(Calendar.DAY_OF_MONTH);
		blnMasuk=date.get(Calendar.MONTH);
		tahunMasuk=date.get(Calendar.YEAR);

		System.out.print("plat nomer motor : ");
		platNomer=in.nextLine();
		setPlatNomer(platNomer);
		System.out.println("waktu masuk = "+tglMasuk+"/"+blnMasuk+"/"+tahunMasuk+"" + " "+jamMasuk+":"+menitMasuk);
		setTglMasuk(tglMasuk);
		setBlnMasuk(blnMasuk);
		setTahunMasuk(tahunMasuk);
		setJamMasuk(jamMasuk);
		setMenitMasuk(menitMasuk);
		System.out.println("\n-------------------------------------------");
	}

//	@Override
	public void cetakKarcis() {
		java.io.File file2=new java.io.File("karcis.txt");
		try {
			java.io.PrintWriter output= new java.io.PrintWriter(file2);
			output.print("----------------------------------------");
			output.print("\n==== selamat datang di parkiran UAD ====");
			output.print("\n====      Karcis Masuk Motor        ===");
			output.print("\n----------------------------------------");
			output.print("\n\n\ttarif motor   : "+ hargaMotor +" (flat)");
			output.print("\n\tPlat no motor : " + getPlatNomer());
			output.print("\n\twaktu masuk   : " +jamMasuk+ "."+menitMasuk);
			output.print("\n\n-----------------------------------------");
			output.print("\n== jaga struk ini jangan sampai hilang ==");
			output.print("\n-----------------------------------------");
			output.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	public final void totalHarga() {
		total1=(getJamMasuk()*3600)+(getMenitMasuk()*60);
		setTotal1(total1);
		total2=(getJamKeluar()*3600)+(getMenitKeluar()*60);
		setTotal2(total2);

		durasi=getTotal2()-getTotal1();
		setDurasi(durasi);

		jam3 = getDurasi()/3600;
		setJam3(jam3);
		sisa = getDurasi()%3600;
		setSisa(sisa);
		menit3 = getSisa()/60;
		setMenit3(menit3);
		System.out.println("\tlama parkir   = "+jam3+" jam, "+menit3+" menit");
	}

	@Override
	public final void exit_parkir() {
		System.out.print("\n=======================================");
		System.out.print("\n====      Keluar parkir Motor      ====");
		System.out.print("\n----------------------------------------");
		System.out.print("\n\n\ttarif mobil   = "+ hargaMotor +" (flat)");
		System.out.print("\n\tPlat no mobil = " + getPlatNomer());
		System.out.print("\n\twaktu masuk   = " +getTglMasuk()+"/"+getBlnMasuk()+"/"+getTahunMasuk()+" "+getJamMasuk()+ ":"+getMenitMasuk());
		System.out.print("\n\twaktu keluar ");
		System.out.print("\n\t\tjam keluar   = ");
		jamKeluar=in.nextInt();
		setJamKeluar(jamKeluar);
		System.out.print("\t\tmenit keluar = ");
		menitKeluar=in.nextInt();
		setMenitKeluar(menitKeluar);
		totalHarga();
		System.out.print("\tTotal bayar  = "+ hargaMotor +" (flat)");
		System.out.println("\n----------------------------------------");

//		PRINT STRUK PARKIR
		java.io.File file2 =new java.io.File("struk.txt");
		try {
			GregorianCalendar date = new GregorianCalendar();
			java.io.PrintWriter out = new java.io.PrintWriter(file2);

			jamMasuk=date.get(Calendar.HOUR_OF_DAY);
			menitMasuk=date.get(Calendar.MINUTE);

			tglMasuk=date.get(Calendar.DAY_OF_MONTH);
			blnMasuk=date.get(Calendar.MONTH);
			tahunMasuk=date.get(Calendar.YEAR);

			out.print("\n-----------------------------------------");
			out.print("\n========      sistem parkir UAD    =======");
			out.print("\n========      bukti pembayaran     ======");
			out.print("\n----------------------------------------");

			out.print("\n\n\ttarif motor   = "+ hargaMotor +" (flat)");
			out.print("\n\tPlat no mobil = " + getPlatNomer());
			out.print("\n\twaktu masuk   = " +getTglMasuk()+"/"+getBlnMasuk()+"/"+getTahunMasuk()+" "+getJamMasuk()+ "."+getMenitMasuk());
			out.print("\n\twaktu Keluar  = "+getJamKeluar()+":"+getMenitKeluar());
			out.print("\n\ttotal waktu   = "+getJam3()+" jam, "+getMenit3()+" menit");
			out.print("\n\ttotal bayar   = "+"Rp."+ hargaMotor);
			out.print("\n\n-----------------------------------------");
			out.print("\n====   TERIMA KASIH -  SELAMAT JALAN   ====");
			out.print("\n-------------------------------------------");
			out.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}


	}
}
