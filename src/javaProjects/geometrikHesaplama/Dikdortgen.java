package javaProjects.geometrikHesaplama;

public class Dikdortgen extends Sekil {

	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);

	}

	public double cevreHesaplama() {
		return (uzunKenar+kisaKenar)*2;
	}

	public double alanHesaplama() {
		return uzunKenar*kisaKenar;
	}


	@Override
	public String toString() {
		return "uzunKenar = " + uzunKenar + ", kisaKenar = " + kisaKenar + ", dikdortgen cevre = " + cevreHesaplama()
				+ ", dikdortgen alan = " + alanHesaplama();
	}
}
