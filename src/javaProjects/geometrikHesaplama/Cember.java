package javaProjects.geometrikHesaplama;

public class Cember extends Sekil {
	
	public Cember(double yariCap) {
		super(yariCap );

	}

	public double cevreHesaplama() {
		return yariCap*2*3.14;
		
	}

	public double alanHesaplamaCember() {
		return yariCap*yariCap*3.14;
	}

	@Override
	public String toString() {
		return
				" yariCap = " + yariCap + ", cember  cevre = " + cevreHesaplama()+", cember alan = "+alanHesaplamaCember();
	}
}
