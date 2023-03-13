package question3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(false);
	}

	@Override
	public void sesCikar() {
		System.out.println( this.getAd()+" ses çıkarıyor...");
		
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " sürünüyor...");
		
	}

}
