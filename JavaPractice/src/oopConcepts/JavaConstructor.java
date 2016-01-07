package oopConcepts;

public class JavaConstructor {

	   	int id;  
	    String name;  
	    int age;  
	    JavaConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    JavaConstructor(int i,String n,int a){  // Constructor Overloading
	    id = i;  
	    name = n;  
	    age=a;  
	    } 
	    
	    void display(){System.out.println(id+" "+name+" "+age);}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConstructor s1 = new JavaConstructor(111,"Karan");  
		JavaConstructor s2 = new JavaConstructor(222,"Aryan",25);  
		    s1.display();  
		    s2.display();  
	}

}
