import java.util.*;
class q8java{
	public static void main(String... lllll){
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the last no");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		if(i%2!=0){
			sum=sum+i;
		}
		
	}
	System.out.println(sum);
	}
}

