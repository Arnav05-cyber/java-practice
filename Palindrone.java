package Practice_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1 = input.next();
        String n2 = n1;
        String rem = "";
        int len = n1.length();
        for(int i=len-1; i>=0; i--){
            rem = rem + n1.charAt(i);
        }
        if (rem.equals(n1)){
            System.out.println("Palindrone");
        }

    }
}
