package control_statement;

import java.util.*;

public class swich_task_1 {

public static void main(String[] args) {

Scanner obj=new Scanner(System.in);	

int days;

System.out.println("1 monday");
System.out.println("2 tuesday");
System.out.println("3 wednesday");
System.out.println("4 thusday");
System.out.println("5 friday");
System.out.println("6 saturday");
System.out.println("7 sunday");

System.out.println("ENTER YOUR DAYS");

days=obj.nextInt();

switch (days) {
	
	case 1:
	System.out.println("monday for money ");
	break;
	
	case 2:
		System.out.println("tuesday for silent life ");
	break;
	
	case 3:
		System.out.println("wednesday for happy life ");
	break;
	
	case 4:
		System.out.println("thusday for enjoyment ");
	break;
	
	case 5:
		System.out.println("friday for  bike ride ");
	break;
	
	case 6:
		System.out.println("saturday for photoshoot ");
	break;
	
	case 7:
		System.out.println("sunday for videos  ");
	break;
	
	default:
		System.out.println("not a days ");	
}

obj.close();

}
}