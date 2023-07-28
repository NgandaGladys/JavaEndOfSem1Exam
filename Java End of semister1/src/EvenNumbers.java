//Sum of even numbers less than 8
public class EvenNumbers {
    public static void main(String[] args) {
        //Initialize array of even numbers
        int [] arr = new int [] { 2, 4, 6};
        int sum = 0;
        //Loop through the array to calculate sum of even numbers
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of even numbers less than 8 of an array is " + sum);
    }

}
