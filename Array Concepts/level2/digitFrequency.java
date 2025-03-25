import java.util.Scanner;

public class digitFrequency {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number ");
		int number = input.nextInt();
        
        int temp = number;
		int totalDigits = 0;
		
		while(temp != 0) {
			totalDigits += 1;
			temp = temp / 10;		
		}

        int arr[] = new int[totalDigits];

        int i = 0;
        while(number != 0) {
			arr[i] = number % 10;
            number = number / 10;		
            i++;
		}

        // System.out.println(arr[2]);
        // System.out.println(temp2);

        int frequencyArr[] = new int[totalDigits];// this will store the freq of each digit
        int freq = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr.length; j2++) {
                if (arr[j] == arr[j2]) {
                    freq++;
                    //inc^ the freq 
                }
            }
            frequencyArr[j] = freq;
            freq = 0;
        }
        
        System.out.println("Digit:Frequency");
        // frequencyArr.sort();

        if (frequencyArr[0] == totalDigits) {
            //if freq = to total no of digits 
            System.out.println("All the digits are same");
            System.out.println(arr[0] + ":"  + frequencyArr[0]);
        } 
        else {
            for (int j = frequencyArr.length-1; j >= 0; j--) {
                // if (frequencyArr[j] > 1) {
                //only works till first element cos 0-1 becomes -1 and it is not an index
                //     if (frequencyArr[j] != frequencyArr[j-1]) {
                //         System.out.println(arr[j] + ":"  + frequencyArr[j]);
                //     } 
                // } 
                // else {
                //     System.out.println(arr[j] + ":"  + frequencyArr[j]);
                // }
                
                System.out.println(arr[j] + ":"  + frequencyArr[j]);
            }
        }
		
        input.close();
	}
}