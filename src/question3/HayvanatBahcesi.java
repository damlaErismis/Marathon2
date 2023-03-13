package question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HayvanatBahcesi {
	private Aslan aslan;
	private Yilan yilan;
	private Maymun maymun;
	private Kertenkele kertenkele;
	private Hayvan hayvan;
	// Aslan aslan = new Aslan("sinba", "130", 180, true);

	public static List<Hayvan> list = new ArrayList<>();
	static List<MemeliHayvan> mList = new ArrayList<>();
	static List<Surungen> sList = new ArrayList<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAd() == m.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}
		list.add(m);
		mList.add(m);
		System.out.println("Hayvanat bahçesine " + m.getAd() + " eklendi.");
	}

	public void bahceyeSurungenEkle(Surungen s) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAd() == s.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}
		list.add(s);
		sList.add(s);
		System.out.println("Hayvanat bahçesine " + s.getAd() + " eklendi.");
	}

	public void hayvanSesCikart(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String isim) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAd().equalsIgnoreCase(isim)) {
				if (list.get(i).toString().substring(0, 1).equalsIgnoreCase("m")) {
					System.out.println(list.get(i).getAd() + " memelidir.");
				} else if (list.get(i).toString().substring(0, 1).equalsIgnoreCase("s")) {
					System.out.println(list.get(i).getAd() + " sürüngendir.");
				}
			}
		}
	}

	public void hayvanBilgileriniGoster(String hayvan) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAd().equalsIgnoreCase(hayvan)) {
				System.out.println(list.get(i).toString());
				return;
			}
		}
		System.out.println(hayvan + " diye bir hayvan Hayvanat bahçesinde yok...");

	}

	public void hayvaniHareketEttir(String hayvan) {

		for (int j = 0; j < mList.size(); j++) {
			
			if (list.get(j).getAd().equalsIgnoreCase(hayvan)) {
				mList.get(j).yuru();

			}
		}

		for (int k = 0; k < sList.size(); k++) {
			if (list.get(k).getAd().equalsIgnoreCase(hayvan)) {
				sList.get(k).surun();

			}
		}
	}

}
