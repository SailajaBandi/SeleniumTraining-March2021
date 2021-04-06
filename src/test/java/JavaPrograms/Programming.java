package JavaPrograms;

public class Programming {
 
	String str;
 		
		public Programming() {
			
		System.out.println("I love programming languages");
		
		}
		 
public Programming(String str) {
	
	this.str= str;
	
	System.out.println("I love "+ str);	
	 
}
public static void main(String[] args) {
	 Programming obj=new Programming();
	 Programming ob1=new Programming("Java");
	 Programming ob2=new Programming("Selenium");
	 Programming ob3=new Programming("Manual Testing");
			 
			 
	}

}
