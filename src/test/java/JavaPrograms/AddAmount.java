package JavaPrograms;

public class AddAmount {
	int iniamount =50;
	
			
			public AddAmount() {
				
				System.out.println(iniamount);
	
				System.out.println();
			
			}
			
			public AddAmount(int amount) {
				
				System.out.println("The Total amount is:"+(iniamount+amount));
				
			}
			
			
	public static void main(String[] args) {
		AddAmount iniamount = new AddAmount();
		AddAmount iniamount1 = new AddAmount(200);
		AddAmount iniamount2 = new AddAmount(300);
		
	}

}
