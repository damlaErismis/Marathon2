package question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Ali Kaya", "3123334455");
		hashMap.put("Seher Özkan", "2123236577");
		hashMap.put("Ahmet Genç", "2162223344");
		hashMap.put("Ali Öncü", "5353222288");
		hashMap.put("Damla Erişmiş", "50612546896");
		

		BufferedWriter bf = null;
		File dosya = new File("rehber.txt");
		try {

			bf = new BufferedWriter(new FileWriter(dosya));
			for (Map.Entry<String, String> entry : hashMap.entrySet()) {
				bf.write(entry.getKey() + ";" + entry.getValue());
				bf.newLine();
			}
			bf.flush();

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e) {
			}
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String firstName = scanner.nextLine();
		System.out.println("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
		String lastName = scanner.nextLine();
		String fullName = firstName + " " + lastName;
	
		boolean found = false; // Aranan kişinin rehberde olup olmadığını kontrol etmek için boolean değişken tanımladım.

		try {
			FileReader file = new FileReader("rehber.txt");
			BufferedReader input = new BufferedReader(file);

			String line;
			while ((line = input.readLine()) != null) { // Satır satır okuyarak aranan kişiyi bulmaya çalışıyoruz.
				String[] tokens = line.split(";");
				String personName = tokens[0].trim();
				String phoneNumber = tokens[1].trim();
				if (personName.equalsIgnoreCase(fullName)) {   // büyük-küçük harf duyarlılığı olmadan arayacak.
					System.out.println(fullName + " isimli kişinin telefon numarası: " + phoneNumber);
					found = true; // Aranan kişi bulundu.
					break; // Döngüden çık.
				}
			}

			if (!found) {
				System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
