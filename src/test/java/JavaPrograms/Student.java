package JavaPrograms;

public class Student {
 //to initialize the class properties we use Constructors
	String name;
 
 public Student() {
	 
	 System.out.println("The name of the student is:"+"Unknown");
 }
	 
	
 public Student(String name) {
	 
	 this.name = name;//this.classvar = localvar

	 System.out.println("The name of the student is:"+name);

	 
 } 
 
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1 = new Student("Vasu");
		Student obj2 = new Student("Sailaja");
		Student obj3 = new Student("Nikhil");
		Student obj4 = new Student("Ishaan");
		
		
		
		
		
	}

}
