package davidproj;

import java.util.Scanner;
public class Davidproj {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter birth year: ");
        int by =sc.nextInt();
        
        int age = 2025 - by;
        
        System.out.println("\nhello "+name+"your age is "+age);
    }
    
    
}
