import java.util.Scanner;


public class Exercise2_1 {
	public static void main(String[] args) {
		
	

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter degree in celsius");	
	int celsius = scanner.nextInt();
	double fahrenheit = (9.0/5)*celsius +32;
	System.out.println(celsius + " Celsius degree is " + fahrenheit + "Fahrenheit");
	
	scanner.close();
}
}
