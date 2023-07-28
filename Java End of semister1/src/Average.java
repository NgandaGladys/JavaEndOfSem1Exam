//Question 1(ii) imported the scanner class because it allows user input
import java.util.Scanner;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  first number: " );

        //we use the nextInt when our user input is an integer
        int number1=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter your second number: " );
        int number2=scanner1.nextInt();
//        System.out.println(number+numbers);
        int number3=scanner.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter your third number: " );
        int number4=scanner.nextInt();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Enter your fourth number: " );
        int number5=scanner.nextInt();
        Scanner scanner4=new Scanner(System.in);
        System.out.println("Enter your fifth number: " );

        //method to calculate the average

        System.out.println((number1+number2+number3+number4+number5)/5);


    }
}
