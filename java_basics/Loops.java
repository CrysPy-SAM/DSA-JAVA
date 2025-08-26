import java.util.*;

public class Loops {
    public static void main(String[] args) {
    //     int counter = 0;
    //     while (counter < 100) {
    //         System.out.println("Hello World!");
    //         counter++;
    //     }

    //     System.out.println("Printed Hellow Worlds! 100s times");
    

    //Print num 1 to 10

    // int counter = 1;
    // while(counter <= 10){
    //     System.out.println(counter);
    //     counter++;
    // }

    //print number from 1 to n
     
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Num");
    // int range = sc.nextInt();
    // int counter = 1;

    // while (counter <= range) {
    //     System.out.print(counter +" ");
    //     counter++;
    // }
    // System.out.println();


    //print sum of n numbers

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num: ");
    int n = sc.nextInt();
    int sum = 0;


    int  i=1;
    while (i <= n) {
        sum += i;
        i++;
    }

    System.out.println("sum is: " +sum);
}
}
