import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = 10.10f;   
        int b = (int) a; 

        System.out.println("Float value: " + a);
        System.out.println("After casting to int: " + b);

        sc.close();
    }
}
