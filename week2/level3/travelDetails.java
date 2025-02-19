import java.util.Scanner;

public class  travelDetails {  
   public static void main(String[] args) {

      String name = "Eric";
      Scanner input = new Scanner(System.in);
      System.out.println("Name :");
      name = input.nextLine();
      
      String fromCity, viaCity, toCity;

      System.out.println("From ");
      fromCity = input.nextLine();

      System.out.println("VIA ");
      viaCity = input.nextLine();

      System.out.println("To ");
      toCity = input.nextLine();

      double distanceFromToVia;
      System.out.println("Distance to Via City");
      distanceFromToVia = input.nextDouble();

      double timeFromToVia;
      System.out.println("Time to reach Via City(in hours)");
      timeFromToVia = input.nextDouble();

      double distanceViaToFinalCity;
      System.out.println("Distance from Via to Final City");
      distanceViaToFinalCity = input.nextDouble();

      double timeViaToFinalCity;
      System.out.println("Time to reach Final City from Via City(in hours)");
      timeViaToFinalCity = input.nextDouble();

      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      double totalTime = timeFromToVia + timeViaToFinalCity;

      System.out.println("The Total Distance travelled by " + name + " from " + 
                        fromCity + " to " + toCity + " via " + viaCity +
                        " is " + totalDistance + " km and " +
                        "the Total Time taken is " + totalTime + " hours");
   }
}
