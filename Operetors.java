package Practice_1;
import  java.util.Scanner;

public class Operetors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println("Enter an operetor");

        char operetor = input.next().charAt(0);

        if (operetor == '+'){
            System.out.print(num1+num2);
        } else if (operetor == '-') {
            System.out.print(num1-num2);
        } else if(operetor == '*'){
            System.out.println(num1*num2);
        } else if(operetor == '/'){
            System.out.println(num1/num2);
        }


    }
}
