public class penDistribution {
	public static void main(String[] args) {
		int pens = 14;
		int children = 3;
		int remainder = pens%children;//this is the number of pen which will not be distributed
		
		int pensForEach = (pens - remainder)/children;
		System.out.println("The Pen Per Student is " + pensForEach + " and the remaining pen not distributed is " + remainder);	
	}
}