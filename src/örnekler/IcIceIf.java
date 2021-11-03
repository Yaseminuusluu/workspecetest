package örnekler;

public class IcIceIf {

	public static void main(String[] args) {
		
		int sinav1 = 45;
		int sinav2 = 50;
		int sinav3 = 66;
		//ortalama'yý float olarak alýyoruz.
		float ortalama = (float) (sinav1+sinav2+sinav3)/3;
		String sonuc;
		if (ortalama<45) { 
			//0-44 arasý ortalama zayýf 
			sonuc="Zayýf";
		}  else if (ortalama<55) {
		//45-54 arasý ortalama zayýf
			sonuc="Gecer";
		}  else if (ortalama<70) {
		//55-69 arasý ortalamaya orta
			sonuc="Orta";
		}  else if (ortalama<85) {
		//70-84 arasý ortalama iyi
			sonuc ="Ýyi";
		} else {
		//baþka bir sonuç kalmadýðý için tekrar
		// if lle sart arýyoruz
			sonuc="Pekiyi";
		}
		 System.out.println("Ortalama:" + ortalama);
		 System.out.println("Buna göre sonuc:" + sonuc);

	}

}
