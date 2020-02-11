import java.util.*;
class q5java{
	public static void main(String... lllll){
	int ttl=0;
	float avg=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name of student");
	String s = sc.nextLine();
	System.out.println("enter marks");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	ttl=m1+m2+m3;
	avg=ttl/3;
	System.out.println("total marks:" +ttl);
	System.out.println("Average:" +avg);
	if(100<=avg<=80)
		System.out.println("First class");
	else if(79<=avg<=60)
		System.out.println("Second class");
	else if(59<=avg<=33)
		System.out.println("Pass");
	else
		System.out.println("F A I L");
	}
}
