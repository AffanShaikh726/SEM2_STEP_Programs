public class frstAndSecondLargest {
    public static int[] fsLargest(int[] array) {
        int[] result = new int[2];
        int largestIndex = 0;
        int maxValue = array[largestIndex];
        //largest
        for (int i = 0; i < array.length; i++) {
            
            if(array[i] > maxValue) {
                maxValue = array[i];
                largestIndex = i;
            }
            if (i == array.length-1) {
                array[largestIndex] = 0;
            }

        }
        result[0] = maxValue;

        //second largest
        maxValue = array[0];
        for (int j = 0; j < array.length; j++) {
            
            if(array[j] > maxValue) {
                maxValue = array[j];
            }
        }
        result[1] = maxValue;

        return result;  
	}

    public static void main(String[] args){
        int size = 11;
        int arr[] = new int[size];
        System.out.println("The heights of players(in cm)");

        int max = 250;
        int min = 150;
        int range = max - min + 1;

        for (int i = 0;i < arr.length;i++) {
            arr[i] = (int) (Math.random() * range) + min;
            System.out.println((i+1) + ": " + arr[i]);
        }

        int[] result = fsLargest(arr);
        System.out.println("largest : " + result[0]);
        System.out.println("second largest : " + result[1]);
	}
}
