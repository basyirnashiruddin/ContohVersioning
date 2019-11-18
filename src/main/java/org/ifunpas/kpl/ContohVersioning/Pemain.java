package org.ifunpas.kpl.ContohVersioning;

public class Pemain {
	private String nama;
	private int noPunggung;
	
	public Pemain(String nama, int noPunggungs) {
		super();
		this.nama = nama;
		this.noPunggung = noPunggungs;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNoPunggung() {
		return noPunggung;
	}

	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}
	
	
}
