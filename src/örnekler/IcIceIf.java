package �rnekler;

public class IcIceIf {

	public static void main(String[] args) {
		
		int sinav1 = 45;
		int sinav2 = 50;
		int sinav3 = 66;
		//ortalama'y� float olarak al�yoruz.
		float ortalama = (float) (sinav1+sinav2+sinav3)/3;
		String sonuc;
		if (ortalama<45) { 
			//0-44 aras� ortalama zay�f 
			sonuc="Zay�f";
		}  else if (ortalama<55) {
		//45-54 aras� ortalama zay�f
			sonuc="Gecer";
		}  else if (ortalama<70) {
		//55-69 aras� ortalamaya orta
			sonuc="Orta";
		}  else if (ortalama<85) {
		//70-84 aras� ortalama iyi
			sonuc ="�yi";
		} else {
		//ba�ka bir sonu� kalmad��� i�in tekrar
		// if lle sart ar�yoruz
			sonuc="Pekiyi";
		}
		 System.out.println("Ortalama:" + ortalama);
		 System.out.println("Buna g�re sonuc:" + sonuc);

	}

}
