package question3;

import java.util.ArrayList;

public abstract class MemeliHayvan extends Hayvan {


	public MemeliHayvan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		
	}
	
	public abstract void yuru();

	@Override
	public String toString() {
		return "MemeliHayvan [toString()=" + super.toString() + "]";
	}

	
	

}
