public class DoWhile {
	
	public static void main(String[] args) {
		
		int n = 10;
		int sum = 0;
		
		int i = 0;
		
		do {
			
			sum += i;
			i++;
			
		} while(i <= n);
		
		System.out.println(sum);
		
	}
	
}