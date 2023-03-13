package question3;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(true);
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+ " tıslıyor");
		
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " sürünüyor");
		
	}

	

}
