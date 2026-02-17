package String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        String str = "abcde";
        String str2 = new String("xyz");
        String str3 = new String(arr);

        // STRINGS ARE IMMUTABLE (NEVER CHANGEABLE)

        Scanner sc = new Scanner(System.in);
        String name; 
        name = sc.nextLine(); // Input with spaces 
        System.out.println(name);

        String fullName = "John Doe";
        System.out.println(fullName);          // prints the full name
        System.out.println(fullName.length()); // prints the length of the string

        // concatenation 
        String firstName = "Satyam";
        String lastName = "Mishra";           
        String completeName = firstName + " " + lastName; 

        // call method to print all letters
        printLetters(completeName);
    }

   
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");  // prints each character with a space
        }
        System.out.println(); // new line at the end
    }
}
