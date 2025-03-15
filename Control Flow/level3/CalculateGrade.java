import java.util.Scanner;
class CalculateGrade{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter physics marks");
		double phymarks=input.nextInt();
		System.out.println("enter Chem marks");
		double chemmarks=input.nextInt();
		System.out.println("enter math marks");
		double mathmarks=input.nextInt();
		double average=((mathmarks+phymarks+chemmarks)/300)*100;
		System.out.println(average);
		if(average>=80){
			System.out.println("Grade: A\n level 4 above agency lvl\n 80% and above"); 
		}
		if(average>=70 && average<80){
			System.out.println("Grade: B\n level 3 agency lvl\n 70-79%");			
		}
		if(average>=60 && average<70){
			System.out.println("Grade: c\n level 2 below,but aprroaching agency lvl\n 60-69%");			
		}
		if(average>=50 && average<60){
			System.out.println("Grade: C\n level 3,well below agency lvl\n 50-59%");			
		}
		if(average>=40 && average<50){
			System.out.println("Grade: D\n level 4 Too below agency lvl\n 40-49%");			
		}
		if(average<=39){
			System.out.println("Grade: R\n Remedial standards\n 39% and below");			
		}
	}
}