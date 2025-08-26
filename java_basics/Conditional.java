import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        // int age = 17;
        // if(age>=18){
        //       System.out.println("eligible for the drive || Voting");
        // }
        // else{
        //     System.out.println("Not eligible for drive || Voting");
        // }

        //Finding largest Num

        // int a=1;
        // int b=3;

        // if(a>=b){
        //      System.out.println("a is greter than b");
        // }
        // else{
        //     System.out.println("b is greter than a");
        // }

        //print an number is even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

}
