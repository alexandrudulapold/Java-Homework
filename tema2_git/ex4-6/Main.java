public class Main {
	
	public static void main(String[] args) {
		
		// ex 4
		int a = 10;
		boolean aBiggerThanFive = a > 5;
		
		
		//ex 5
		char caracter = 'a';
		char cDecimal = 97;
		char cHexadec = '\u0061';
		
		
		//ex 6
		int x = -1;
		
		boolean xPrimaExpresie = ((x < 100) && (x++ >= 0));
		System.out.println("x dupa prima expresie: " + x);
		
		boolean xADouaExpresie = ((x < 100) & (x++ > 0));
		System.out.println("x dupa a doua expresie: " + x);
		
		
		System.out.println("xPrimaExpresie: " + xPrimaExpresie);
		System.out.println("xADouaExpresie: " + xADouaExpresie);
		
	}
	
}