
public class Designs {
	public static void main(String[] args) {
		// Design no 1
			
		int a = 5; //define number of stars you want to print

		System.out.println("-----------------Design no1----------------");
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// Design no 2
		
		System.out.println("-----------------Design no 2----------------");
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
		
		
		// Design no 3
		
		System.out.println("-----------------Design no 3----------------");
		
		
		for (int i = a; i >=0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		// Design no 4
		
		System.out.println("-----------------Design no 4----------------");
		
		for (int i = 1; i < a+1; i++) {
			
			for (int j = 0; j < a-i; j++) {
				
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Design no 5
		
		System.out.println("-----------------Design no 5----------------");
				
			for (int i = 1; i < a+1; i++) {
				
				
				for (int j = 0; j < i-1; j++) {
					System.out.print(" ");				
				}
				
				for (int j = 0; j < a+1-i; j++) {
					System.out.print("*");
				}
				
				System.out.println();

			}
			
		// Design no 6
			
		System.out.println("-----------------Design no 6----------------");
		
		for (int i = 1; i < a+1; i++) {
			
			for (int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// Design no 7
		
		System.out.println("-----------------Design no 7----------------");
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < a-i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
}
