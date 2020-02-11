import java.util.*;
class Student1{
	
		void calculateFeesStructure(){

						Scanner sc = new Scanner(System.in);		
						System.out.println("Student ID");
						Long studentId= sc.nextLong();
			
						System.out.println("G R A D E");
						Character studentGrade=sc.next().charAt(0);
			
						System.out.println("Monthly Fees");
						Double monthlyFees=  sc.nextDouble();
			
						System.out.println("Scholarship");
						Boolean isScholarshipEligible=sc.nextBoolean();
						
							if(studentId!=0 && studentGrade == 'A' && isScholarshipEligible == true  ){
								monthlyFees =monthlyFees -monthlyFees *10/100;
								System.out.println("monthlyFees=" +monthlyFees);
							
							}
						    else if( studentId!=0 && studentGrade == 'B' && isScholarshipEligible == true ){
								monthlyFees =monthlyFees -monthlyFees *8/100;
								System.out.println("monthlyFees=" +monthlyFees);
						
							}
							
							else if( studentId!=0 && studentGrade == 'C' && isScholarshipEligible == true ){
								monthlyFees =monthlyFees -monthlyFees *6/100;
								System.out.println("monthlyFees=" +monthlyFees);
						
							}
							
							else if( studentId!=0 && studentGrade == 'D' && isScholarshipEligible == true ){
								monthlyFees =monthlyFees -monthlyFees *4/100;
								System.out.println("monthlyFees=" +monthlyFees);
						
							}
														
							else
								System.out.println("Not Eligible for Exemption...");

		
		}
	}

class Student{
	public static void main(String... lllll){
		
		Student1 student = new Student1();
		student.calculateFeesStructure();
}
}