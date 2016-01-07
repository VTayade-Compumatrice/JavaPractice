
public class FactorialOfAnyNumber {

	public static void main(String[] args) {
		// WAC to display factorial of any number
		//Ex:- Fact(5)=5*4*3*2*1=120

		
		int a = 8;
		int c = a;
		int b = 1;
		
		System.out.print("Fact("+a+")=");
		do {
			System.out.print(a+"*");
			a--;
			b=b*a;
		} while (a>1);
		
		c=b*c;
		
		System.out.print("1="+ c);
	}

}
