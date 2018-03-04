import java.util.Scanner;
public class  FiveCities{
	public static void main(String[] args) {
		double sum = 0;
		int lowestIndex = 0;
		int highestIndex = 0;
		Scanner sc = new Scanner(System.in);
		String[] cities = new String[5];
		double[] temperatures = new double[5];
		System.out.println("Please enter five cities and their temperatures");
		for (int i = 0; i < cities.length; i++) {
			System.out.println("Please enter city " + (i + 1));
			cities[i] = sc.nextLine();
			System.out.println("Please enter " + cities[i] + "'s teperature");
			temperatures[i] = sc.nextDouble();
			sc.nextLine();
		}
		for (int i = 0; i < cities.length; i++) {
			System.out.println("you entered: " + cities[i] + " with teperature " + temperatures[i]);
		}
		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}
		double average = sum / temperatures.length;
		System.out.println("The average temperature for the cities you entered is: " + average);
		for (int i = 0; i < temperatures.length; i++){
			if (temperatures[i] < temperatures[lowestIndex])
				lowestIndex = i;
		}
		System.out.println("The city with the lowest Temperature is "+cities[lowestIndex]+" at "+temperatures[lowestIndex]+" degrees.");
		for (int i = 0; i < temperatures.length; i++){
			if (temperatures[i] > temperatures[highestIndex])
				highestIndex = i;
		}
		System.out.println("The city with the highest Temperature is "+cities[highestIndex]+" at "+temperatures[highestIndex]+" degrees.");
	}
}