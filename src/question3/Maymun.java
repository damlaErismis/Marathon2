package question3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(false);
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " ses çıkarıyor.");
		
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " yürüyor...");
		
	}


}
