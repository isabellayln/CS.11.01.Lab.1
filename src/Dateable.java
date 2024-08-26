import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age:");
        int yourAge = age.nextInt();
        System.out.println(yourAge + " year olds should date somebody at least " + (7+(yourAge/2)) + " years old");
    }
}
