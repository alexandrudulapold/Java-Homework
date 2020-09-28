public class UsingTernaryOperator {
	
	public static void main(String[] args) {
		
		 int num = 5000;
		
		String x = num <= 0 ? "Small" : num >= 1000000 ? "Large" : "Average";
		
		System.out.println(x);
		
	}
	
}