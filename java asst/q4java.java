import java.util.*;
class q4java{
	public static void main(String... lllll){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a>b && a>c){
	System.out.println(a+"is hieghest");
	if(b>c)
		System.out.println(b +"is 2nd heighest");
	else
		System.out.println(c +"is 2nd heighest");
	}
	
	if(b>c && b>a){
	System.out.println(b+"is hieghest");
	if(a>c)
		System.out.println(a +"is 2nd heighest");
	else
		System.out.println(c +"is 2nd heighest");
	}
	
	if(c>a && c>b){
	System.out.println(c+"is hieghest");
	if(a>c)
		System.out.println(a +"is 2nd heighest");
	else
		System.out.println(b +"is 2nd heighest");
	}
	
	}
}