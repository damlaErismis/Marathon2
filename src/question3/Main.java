package question3;

public class Main {

	public static void main(String[] args) {
HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		
		Aslan aslan1 = new Aslan("Simba", 150, 200);
		Yilan yilan1 = new Yilan("terminator", 15, 200);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan1);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan1);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("leo", 120, 140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200));
	
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("kermit", 2, 35));
		
		hayvanatBahcesi.hayvanSesCikart(yilan1);
		System.out.println();
		hayvanatBahcesi.hayvanBilgileriniGoster("Simba");
		hayvanatBahcesi.hayvanBilgileriniGoster("Tiger");
		System.out.println();		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		System.out.println();
		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		
	}
}
