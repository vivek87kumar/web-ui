import java.util.*;
class q9java{
	public static void main(String... lllll){
	int num=0,rev=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	 while( num != 0 )
      {
          rev = rev * 10;
          rev = rev + num%10;
          num = num/10;
      }
	System.out.println(rev);
	
	}
}

