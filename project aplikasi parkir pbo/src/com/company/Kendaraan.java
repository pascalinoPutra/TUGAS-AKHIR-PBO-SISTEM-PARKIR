package com.company;

 public abstract class Kendaraan  {

	protected String platNomer;
	protected int jamMasuk,menitMasuk;
	protected int jamKeluar,menitKeluar;
	protected int tglMasuk,blnMasuk,tahunMasuk;

	 public String getPlatNomer() {
		 return platNomer;
	 }
	 public  void setPlatNomer(String platNomer) {
		 this.platNomer = platNomer;
	 }

	 public int getJamMasuk() {
		return jamMasuk;
	}
	public void setJamMasuk(int jamMasuk) {
		this.jamMasuk = jamMasuk;
	}

	 public int getMenitMasuk() {
		 return menitMasuk;
	 }
	 public void setMenitMasuk(int menitMasuk) {
		 this.menitMasuk = menitMasuk;
	 }

	 public int getJamKeluar() {
		 return jamKeluar;
	 }
	 public void setJamKeluar(int jamKeluar) {
		 this.jamKeluar = jamKeluar;
	 }

	 public int getMenitKeluar() {
		 return menitKeluar;
	 }
	 public void setMenitKeluar(int menitKeluar) {
		 this.menitKeluar = menitKeluar;
	 }

	 public int getTglMasuk() {
		 return tglMasuk;
	 }
	 public void setTglMasuk(int tglMasuk) {
		 this.tglMasuk = tglMasuk;
	 }

	 public int getBlnMasuk() {
		 return blnMasuk;
	 }
	 public void setBlnMasuk(int blnMasuk) {
		 this.blnMasuk = blnMasuk;
	 }

	 public int getTahunMasuk() {
		 return tahunMasuk;
	 }
	 public void setTahunMasuk(int tahunMasuk) {
		 this.tahunMasuk = tahunMasuk;
	 }

	 public abstract void kendaraanMasuk();
	 public abstract void cetakKarcis();
	 public abstract void totalHarga();
	 public abstract void exit_parkir();

 }
