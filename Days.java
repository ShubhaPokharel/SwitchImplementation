import java.util.Scanner;
class Days{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a day: ");
	String day = s.next();

	switch(day){
	case "monday":
	case "tuesday":
	case "wednsday":
	case "thursday":
	case "friday":
	System.out.println("Weeksdays on work...");
	break;

	case "saturday":
	case "sunday":
	System.out.println("Weekend enjoy the party....");
	break;

default:
	System.out.println("You have entered the wrong day");
	break;

	}

	
	}
}