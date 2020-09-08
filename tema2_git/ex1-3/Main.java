public class Main {
	public static void main(String[] args) {
		
		int a1 = 20;
		int r1 = ++a1 + ++a1 + ++a1 + a1-- -6;
		
		System.out.println(r1); //rezultat : 83
		
		
		int a2 = 10;
		int r2 = a2++ + a2 + a2-- + a2-- + --a2 + a2++ - --a2 + a2++ - a2-- + a2 - --a2 + a2++ + ++a2;
		
		System.out.println(r2); //rezultat : 66
		
		
		int a3 = 10;
		int r3 = a3++ + a3 * a3-- + a3-- * --a3 + a3++ - --a3 * a3++ - a3-- + a3 - --a3 * a3++ + ++a3;
		
		System.out.println(r3); //rezultat : 114
	}
	
	
}
