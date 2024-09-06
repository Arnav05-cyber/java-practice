package Practice_1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ind = input.nextInt();
        int usd = (ind/84);
        System.out.println("Currency in usd: "+usd+" dollar");
    }
}
