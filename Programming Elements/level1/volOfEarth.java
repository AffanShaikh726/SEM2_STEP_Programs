import java.lang.Math;

public class volOfEarth {
	public static void main(String[] args) {
		double radiusOfEarthInKm = 6378;// kilometres
		double mileFactor = 1.6;//1 km = 1.6 miles
		double radiusOfEarthInMiles = radiusOfEarthInKm * mileFactor;
		double volInKm = (4/3) * 3.14 * Math.pow(radiusOfEarthInKm, 3);
		double volInMiles = (4/3) * 3.14* Math.pow(radiusOfEarthInMiles, 3);
		System.out.println("The volume of earth in cubic kilometers is " + volInKm + " and cubic miles is " + volInMiles);
	}
	
}