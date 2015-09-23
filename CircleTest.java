package exercisePG92;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter radius:");
		Circle circle = new Circle (posIntReturn(scanner));
		System.out.println ("Area is " + circle.getArea());
		scanner.close();
	}
	
	static int posIntReturn(Scanner scanner){
		boolean validrad=false;
		String toreturnS;
		int toreturn=0;
		int stupidvariablename=0;
		while (validrad==false){
		toreturnS = scanner.nextLine();
		try {
			toreturn = Integer.parseInt(toreturnS);
			if (toreturn<0){
				throw new NumberFormatException();
			} else {
				validrad ^= true; // ^= is the XAND operator
			}
		} catch (NumberFormatException e){
			System.out.println("Put a positive integer in, you twat.");
		}
		}
		return toreturn;
	}
}
