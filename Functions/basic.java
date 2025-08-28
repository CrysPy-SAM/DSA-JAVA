package Functions;

import java.util.Scanner;

public class basic {
    public static void printHello(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static void CalculateSum(int num1, int num2){
        int sum = num1+num2;
        System.out.println("sum is: " +sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num");
        int b=sc.nextInt();
        CalculateSum(a, b);
    }
}
