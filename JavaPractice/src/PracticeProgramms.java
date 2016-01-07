//import java.util.Scanner;


public class PracticeProgramms {
	
	public static void main(String[] args) {
		
		//	Scanner sc=new Scanner (System.in);
		//  i=sc.nextInt();
		
		
		// Write a program to display first 10 even no
		System.out.println("---------------display first 10 even no------------------");
		int a=10;
		
		for (int i = 1; i <= a*2; i++) {
			
			if (i%2==0) {
				System.out.print(i+", ");
				
			}
		}
		
		
		// WAP for table of any number
		System.out.println();
		System.out.println("---------------WAP for table of any number------------------");
		int b=1;
		
		while (b<=a) {
			
			System.out.println(a*b);
			b++;
		}
		
		
		// WAC to display Square of each number between 1 to 20
		System.out.println("---------------Square of each number between 1 to 20------------------");
		
		
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Square("+i+")="+i*i);
			
		}
		
		
		
		//WAC to display Fibbonica Series till 99
				System.out.println("---------------Fibbonica Series till 99------------------");
				
		
		int first=0;
		int second = 1;
		int c=first+second;
		
		System.out.print(first+",");

		while ( c <= 99) {
			
			System.out.print(c+",");
			
			c=first+second;
			first=second;
			second=c;
		
		}
		System.out.println();
		
		// WAC to display factorial of any number
		// Ex:- Fact(5)=5*4*3*2*1=120
		System.out.println("---------------WAC to display factorial of any number------------------");
		
		int f = 8;
		long total= 1;
	
		System.out.print("Fact("+f+")=");
		for (int i = f; i > 1; i--) {
			System.out.print(i+"*");
			total=i*total;
		}
		System.out.print("1="+total);
		
		System.out.println();
		//WAC to Read and display values of array
		System.out.println("---------------WAC to Read and display values of array------------------");
				
		int Square [] = new int [20];
		for (int i = 0; i < 20; i++) {
			//System.out.println("Square("+i+")="+i*i);
			Square [i] = i*i;
		}
		
		for (int i = 0; i <20; i++) {
			
			System.out.print(Square[i]+",");
		}
		
		System.out.println();
		//WAC to read a number and display in reverse order
		System.out.println("---------------WAC to read a number and display in reverse order------------------");
		
		int number = 123456789;
		
		do {
			System.out.print(number%10);
			number=number/10;
		} while (number%10!=0);
		
		System.out.println();
		//WAC to display summation of 1st 10 number
		System.out.println("---------------WAC to display summation of 1st 10 number------------------");
		
		System.out.println();
		//WAC to display all armstrong number between 1 to 999
		//153= 1^3 + 5^3 + 3^3
		System.out.println("---------------WAC to display all armstrong number between 1 to 999------------------");
		
		for (int i = 1; i < 1000; i++) {
			int g= i;
			int armstrong []=new int [3];
			int j = 0;
			do {
				armstrong [j]= g%10;
				g=g/10;
				j++;
			} while (j<3);
			
			if (i==armstrong [2]*armstrong [2]*armstrong [2]+armstrong [1]*armstrong [1]*armstrong [1]+armstrong [0]*armstrong [0]*armstrong [0]) {
				System.out.println(i);
				
			}
		}
		
		System.out.println();
		//WAC to display any input number in word format
		
		System.out.println("--------------- WAC to display any input number in word format------------------");
		
		int numb = 645282648;
		int numb1[] =new int [99];
		int k = 0;	
		System.out.print(numb+"=");
		do {
			
			numb1[k]= numb%10;

			numb=numb/10;
			k++;
		} while (numb%10!=0);
		
		for (int i = k; i >0; i--) {
			
			switch (numb1[i-1]) {
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			case 0:
				System.out.print("Zero ");
				break;
			
		}		
		}
	
	}
	
}

 