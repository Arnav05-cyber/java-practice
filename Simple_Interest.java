package Practice_1;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int principle = input.nextInt();
        int time = input.nextInt();
        int rate = input.nextInt();

        int simple_interest = (principle*rate*time)/100;

        System.out.println("Simple Interst is: "+simple_interest);
    }
}
