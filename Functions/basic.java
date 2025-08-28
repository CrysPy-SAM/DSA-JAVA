package Functions;

import java.util.Scanner;

public class basic {
    // public static void printHello(){
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    // }

    // public static void CalculateSum(int num1, int num2){
    //     int sum = num1+num2;
    //     System.out.println("sum is: " +sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter 1st num");
    //     int a = sc.nextInt();
    //     System.out.println("Enter 2nd num");
    //     int b=sc.nextInt();
    //     CalculateSum(a, b);
    // }


    //Factorial


    public static int factorial(int n){

        int f=1;

        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }

    public static int bionoCo(int n, int r){
                 int fact_n= factorial(n);
                 int fact_r= factorial(r);
                 int fact_nmr= factorial(n-r);
                 
                 int  bionoCo = fact_n/ (fact_r*fact_nmr);
                 return bionoCo;
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(5));
    }
}
