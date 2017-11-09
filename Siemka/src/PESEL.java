class PESEL {
	long pesel;
	
	public PESEL(long pesel) {
		this.pesel = pesel;
	}
	public PESEL(String str) {
		this.pesel = Long.parseLong(str);
	}
	
	public boolean isCorecct() {
		return false;
	}
	public boolean isMale() {
	return true;
	}
	
	public String isBorn() {
		return"";
	}
	
	
	public String toString()  {
		String corecct = "";
		if(isCorecct()) corecct = "TAK";
		else corecct = "NIE";
		String sex = "kobieta";
		if(isMale()) sex = "mężczyzna";
		return String.format("Poprawny: %s, Płeć: %s, urodzony: %s",
				corecct, sex, isBorn());
	}
	
	public class PeselMain {
	
	public static void main(String[] args) {
			long pesel = 
			PESEL p1 = new PESEL(pesel);
			PESEL p2 = new PESEL("75121968629");
					p1.toString();
					p2.toString();

	}

}
