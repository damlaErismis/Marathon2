package question3;


public abstract class Surungen extends Hayvan {
	
	public abstract void surun();

	public Surungen(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		
	}

	
	@Override
	public String toString() {
		return "Surungen [toString()=" + super.toString() + "]";
	}


	

}
