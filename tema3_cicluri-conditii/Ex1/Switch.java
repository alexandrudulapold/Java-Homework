public class Switch {
	
	public static void main(String[] args) {
		
		char litera1 = 'q';
		
		switch(litera1) {
			case 'a': 
				System.out.println("Litera " + litera1 + " este o vocala"); break;
			case 'e': 
				System.out.println("Litera " + litera1 + " este o vocala"); break;
			case 'i': 
				System.out.println("Litera " + litera1 + " este o vocala"); break;
			case 'o': 
				System.out.println("Litera " + litera1 + " este o vocala"); break;
			case 'u': 
				System.out.println("Litera " + litera1 + " este o vocala"); break;
				
			default:
				System.out.println("Litera " + litera1 + " este o consoana");
		}
		
		
	}
	
}