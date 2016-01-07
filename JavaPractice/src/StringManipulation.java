//import org.omg.Messaging.SyncScopeHelper;


public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a= 0;
		int pos=0;
		
		String str= "This is my book";
		//int cnt=0;
		do {
			pos= str.indexOf("i", pos+1);
			
			if (pos!=-1) {
				System.out.println(pos+1);
				
			}
		} while (pos!= -1);
		
		// WAp to display char bet 2 “i”
		int a= str.indexOf("i");
		int b = str.lastIndexOf("i");
		System.out.println(str.substring(a+1, b));
		
		/*split function */
		
		String str2[]= str.split("");

		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		//WAP count “i” in a string using split fun/
		
		String str3[]= str.split("i");
		
		System.out.println(str3.length -1);
		
		//join Function
		
		//System.out.println(str.indexOf("i"), System.out.println(str.indexOf("i"));
		
		/*for (int i = 0; i < args.length; i++) {
			
		}*/
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	System.out.println(str.length());
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
		System.out.print(str.charAt(i));
		}		
	}*/
		
		/*if (str.charAt(i)== "i") {
			a++
		}
		if () {
			
		}
		else{
		
			i++;
			
		}
		}
		System.out.println(a);*/
		
}
