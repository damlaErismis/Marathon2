package question2;

public class Main {
	public static void main(String[] args) {
		CustomStringTR customStr = new CustomStringTR("Merhaba");
		System.out.println("1. " +customStr.uzunluk()); 
		System.out.println("2. " +customStr.karakter(3)); 
		System.out.println("3. " +customStr.ayniMi("merhaba"));
		System.out.println("4. " +customStr.indisNumarasi("rha"));
		System.out.println("5. " +customStr.altMetin(2, 5)); 
		System.out.println("6. " +customStr.iceriyor("erb")); 
		System.out.println("7. " +customStr.baslangic("Mer"));
		System.out.println("8. " +customStr.bitis("ba")); 
		System.out.println("9. " +customStr.hepsiniBuyukHarfYap()); 
		System.out.println("10. " +customStr.hepsiniKucukHarfYap());

	}
}
