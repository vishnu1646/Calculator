
import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            int a,b,c;
            int choice;
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("press 1 for addition");
                System.out.println("press 2 for addition");
                System.out.println("press 3 for multiplication");
                System.out.println("press 4 for division");
                System.out.println("make your choice");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the first number");
                        a = sc.nextInt();
                        System.out.println("Enter the second number");
                        b = sc.nextInt();
                        c = a + b;
                        System.out.println("Adition of two numbers is :" + c);
                        break;
            }
        }
    }

