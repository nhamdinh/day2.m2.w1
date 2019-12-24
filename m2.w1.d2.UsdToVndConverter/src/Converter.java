import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        long RATE = 23000;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter USD amount to convert to VND: ");
        long input = sc.nextLong();
        System.out.println(input+" USD = "+input*RATE+" VND");
    }
}