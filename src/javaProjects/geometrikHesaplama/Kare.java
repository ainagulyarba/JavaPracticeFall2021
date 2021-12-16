package javaProjects.geometrikHesaplama;

public class Kare extends Dikdortgen {


     public Kare(double uzunKenar,double kisaKenar) {
		super(uzunKenar,kisaKenar);
		
	}

	@Override
	public String toString() {
		return "Kenar = " + uzunKenar + ", kare cevre = " + cevreHesaplama()
				+ ", kare alan = " + alanHesaplama();
	}


	


	


	
	
	
	
	
	
	
}
