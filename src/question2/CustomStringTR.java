package question2;

public class CustomStringTR {
	private final String metin;

	public CustomStringTR(String metin) {
		this.metin = metin;
	}

	public int uzunluk() {
		return metin.length();
	}

	public char karakter(int index) {
		return metin.charAt(index);
	}
	
	public Boolean ayniMi(String arananMetin) {
		return metin.equals(arananMetin);
	}

	public int indisNumarasi(String arananMetin) {
		return metin.indexOf(arananMetin);
	}

	public String altMetin(int baslangic, int bitis) {
		return metin.substring(baslangic, bitis);
	}

	public boolean iceriyor(String arananMetin) {
		return metin.contains(arananMetin);
	}

	public boolean baslangic(String arananMetin) {
		return metin.startsWith(arananMetin);
	}

	public boolean bitis(String arananMetin) {
		return metin.endsWith(arananMetin);
	}

	public String hepsiniBuyukHarfYap() {
		return metin.toUpperCase();
	}

	public String hepsiniKucukHarfYap() {
		return metin.toLowerCase();
	}


}
