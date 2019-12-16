import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	
	System.out.println("Enter Student Id");
	Scanner sc= new Scanner(System.in);
	int Id = sc.nextInt();
	System.out.println("The Student ID Is " +Id);
	System.out.println("Enter The Name");
	String name = sc.next();
	System.out.println("The Student Name Is "+name);
	System.out.println("Enter The Email ID");
    String email =sc.next();
	System.out.println("THE MAIL ID IS"+email);
	System.out.println("Enter The PhoneNo");
	long phone = sc.nextLong();
	System.out.println("The Phone No Is" +phone);
	System.out.println("Enter The Dept");
	String dept= sc.next();
	System.out.println("THE DEPARTMENT IS  "+dept);
	System.out.println("Enter The Gender");
	String gender= sc.next();
	System.out.println("The Gender Is " +gender);
	System.out.println("Enter The City");
	String city= sc.next();
	System.out.println("The City Is "+city);
	System.out.println("The Clonning Is Done");

}
}
