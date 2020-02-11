import java.util.*;
class q10java{
	public static void main(String... lllll){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	
		int i,fact=1;  
		int number=sc.nextInt(); 
		 if(number>0){
		for(i=1;i<=number;i++){    
		fact=fact*i;    
		 }  
  System.out.println("Factorial of "+number+" is: "+fact); 
		 }
		 else
			 System.out.println("no neg");
	
	}
}

