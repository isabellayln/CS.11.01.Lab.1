import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age:");
        int yourAge = age.nextInt();
        System.out.println(yourAge+ " years old should read at least " + (100-yourAge)+ " pages before giving up on a book");
    }
}
