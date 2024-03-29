package control_statement;

import java.util.Scanner;

public class if_if {

public static void main(String[] args) {
	
Scanner obj=new Scanner(System.in);	

System.out.println("ENTRE YOUR DETAILS FOR VOTERS LIST ");
System.out.println("enter your name");
String name=obj.next();
int age,mobile_number;

System.out.println("ENTER YOUR AGE ");	
age=obj.nextInt();
if (age>=18) {
System.out.println("NEXT ");

System.out.println("ENTER YOUR number ");
mobile_number=obj.nextInt();
if(mobile_number==6381159) {
System.out.println("your eligiable for vote ");
}
}

else {
System.out.println("not eligiable ");
}
			
obj.close();
}
}