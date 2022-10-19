package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {

		
//		int ergebnis = addieren(1,2);
//		System.out.println(ergebnis);
//		
//		int i = 5;
		
		
		MathUtil mathUtilObject = new MathUtil();
		int ergebnis = mathUtilObject.addieren(5, 6);
		
		
		ConsolePrint cPrint = new ConsolePrint();
		cPrint.printInCaps("das ist alles klein");
		
	}

	
	
	
	static int addieren(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
//		System.out.println(ergebnis);
//		System.out.println(zahl1 + zahl2);
		
		return ergebnis;
//		return zahl1 + zahl2;
	}
	
	
	
	
	

}
