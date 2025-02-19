public class kmToMile {
	public static void main(String[] args) {
		double km = 10.8;// kilometres
		double mileFactor = 1.6;//1 km = 1.6 miles
		double requiredMiles = km*mileFactor;
		System.out.println("The distance " + km + " km in miles is " + requiredMiles);
	}
}