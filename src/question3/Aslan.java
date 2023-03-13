package question3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilo, int uzunluk ) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(true);
	}

	
	@Override
	public void sesCikar() {
		System.out.println( getAd() + " kükrüyor");
		
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() +" yürüyor");
		
	}


	@Override
	public String toString() {
		return "Aslan [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk()
				+ ", isTehlikeliMi()=" + isTehlikeliMi() + "]";
	}

}
