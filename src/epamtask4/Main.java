package epamtask4;
import java.util.*;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose the type of materials used for construction");
	System.out.println("1.Standard");
	System.out.println("2.Above Standard");
	System.out.println("3.High Standard Materials");
	System.out.println("4.High Standard Materials and Fully Automated");
	int standard= sc.nextInt();
	System.out.println("Enter total area of house:");
	float tarea=sc.nextFloat();
	HouseConstruction h = new HouseConstruction();
	System.out.println("Estimated Cost for Construction of House :"+h.calcost(standard,tarea));
}
}
