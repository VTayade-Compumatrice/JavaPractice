
public class First100PrimeNo {

	public static void main(String[] args) {

	for (int i = 1; i <= 100; i++) {
			
			for (int j = 2; j <= i; j++) {
				
				if (i%j == 0) {
					if (i==j) {
						System.out.println(i);
					}
					j=101;
				}
			}
						
		}
	
	}
}
		
