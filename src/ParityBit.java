public class ParityBit {
	public static void main(String[] args) {
		int wert = 0x17;	//Max wert 31==0b11111==0x1F
		int quersumme = 0;
		int pruefziffer = wert & 1;
		for(int i=0;i<4;i++) {
			wert = wert >> 1;
			quersumme += wert & 1;
		}
		boolean ergebnis = false;
		if(quersumme%2 == pruefziffer) {
			ergebnis = true;
		}
		System.out.println(ergebnis);
		System.out.println(quersumme);
		System.out.println(pruefziffer);
	}
}
