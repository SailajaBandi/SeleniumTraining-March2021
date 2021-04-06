package JavaPrograms;

public class Rectangle {
	int Length;
	int Breadth;
	int Area;
	
	
	
	
  public Rectangle() {
	  
	  this.Length = 0;
	   this.Breadth = 0;
	   
	   System.out.println(Length);
	   System.out.println(Breadth);
	   
  }
  public Rectangle(int i) {
	  this.Length = i;
	  this.Breadth =i;
	  
	   
	   System.out.println(Length);
	   System.out.println(Breadth);
	   
 }
  public Rectangle(int i,int j) {
	  this.Length = i;
	  this.Breadth =j;
	  
	   System.out.println(Length);
	   System.out.println(Breadth);
	   
 }
  public int calculate() {
		
		Area=Length*Breadth;
		return Area;
	}
  public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		Rectangle obj1 = new Rectangle(10);
		Rectangle obj2 = new Rectangle(20,30);
		System.out.println("The Area of a Rectangle is:"+obj.calculate());
		System.out.println("The Area of a Rectangle is:"+obj1.calculate());
		System.out.println("The Area of a Rectangle is:"+obj2.calculate());
		

	}

}
