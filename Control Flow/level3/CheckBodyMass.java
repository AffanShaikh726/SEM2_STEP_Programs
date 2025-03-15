import java.util.Scanner;
class CheckBodyMass{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the weight");
		double weight=input.nextInt();
		System.out.println("enter the height in centimeter");
		double h=input.nextDouble();
		double height=h/100;
		double bodymass=weight/(height*height);
		if(bodymass<=18.4){
			System.out.println(bodymass+" Underweight");
			}
		else if(bodymass>=18.5 && bodymass<=24.9){
			System.out.println(bodymass+" Normal");
			}
		else if(bodymass>=25.0 && bodymass<=39.9){
			System.out.println(bodymass+" Overweight`");
			}
		else{
			System.out.println(bodymass+" Obese");
			}
	}
}
		