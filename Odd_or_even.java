package Practice_1;
import java.util.Scanner;

public class Odd_or_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
