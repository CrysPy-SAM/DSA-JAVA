import java.util.*;

public class Array_01 {
    public static void main(String[] args) {
        //  Declear Array

        // int marks[] = new int[50];
        // int number[] = {1,2,3};
        // int moreNumbers[] = {4,5,6};
        // String fruits[] = {"apple", "mango", "gvava"};

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();   //phy
        marks[1] = sc.nextInt();   //che
        marks[2] = sc.nextInt();   //Math

        System.out.println("phy:"+marks[0]);
        System.out.println("che:"+marks[1]);
        System.out.println("Math:"+marks[2]);

        // marks[2] = marks[2]+10;
        // System.out.println("Math:"+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage =" +percentage + "%");
    }
}
