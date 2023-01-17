package com.company;

public class LahanParkir implements Parkir {
	private int sisaLahan;
	private boolean kendaraanIn;
	private int jmlhKendaraanMasuk;

	public LahanParkir(boolean kendaraanIn) {
		this.kendaraanIn = kendaraanIn;
	}
	public int getSisaLahan() {
		return sisaLahan;
	}
	public void setSisaLahan() {
		this.sisaLahan = MAX_PARKING-getJmlhKendaraanMasuk();
	}
	public void setKendaraanIn(boolean kendaraanIn) {
		this.kendaraanIn = kendaraanIn;
	}
	public boolean isKendaraanIn() {
		return kendaraanIn;
	}
	public int getJmlhKendaraanMasuk() {
		return jmlhKendaraanMasuk;
	}
	public void setJmlhKendaraanMasuk() {
		this.jmlhKendaraanMasuk +=1;
	}

	@Override
	public void entryParking() {
		if (isKendaraanIn()==true){

			if (jmlhKendaraanMasuk<=MAX_PARKING){
				setJmlhKendaraanMasuk();
				System.out.println("jumlah kendaraan: "+getJmlhKendaraanMasuk());
				setSisaLahan();
				System.out.println("parkir tersedia : "+getSisaLahan());
			}
			else if (getJmlhKendaraanMasuk()==MAX_PARKING){
				System.out.println("parkiran penuh !!!!");
			}
		}
		else{
			System.out.println("belum ada sama sekali kendaraan yang masuk");
		}

	}

}
